package ru.cofeok.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import ru.cofeok.springsecurity.demo.config.role.DemoRoles;
import ru.cofeok.springsecurity.demo.config.role.RolesEnum;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // add users for in-memory authentication
        // using deprecated method just for demo app
        User.UserBuilder users = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(users.username("john").password("test123").roles(DemoRoles.EMP.toStringArray()))
                .withUser(users.username("mary").password("test123").roles(DemoRoles.MNG.toStringArray()))
                .withUser(users.username("susan").password("test123").roles(DemoRoles.ADM.toStringArray()));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //.anyRequest().authenticated()
                .antMatchers("/").hasRole(RolesEnum.EMPLOYEE.name())
                .antMatchers("/leaders/**").hasRole(RolesEnum.MANAGER.name())
                .antMatchers("/systems/**").hasRole(RolesEnum.ADMIN.name())
                .and()
                .formLogin()
                .loginPage("/showMyLoginPage")
                .loginProcessingUrl("/authenticateTheUser")
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .exceptionHandling()
                .accessDeniedPage("/access-denied");
    }
}
