# spring-security-demo
example of Spring Security Configuration
### Features shown
* Spring configuration by Java Classes:
    * [Spring App Configuration](https://github.com/Evgenen96/spring-security-demo/blob/master/src/main/java/ru/cofeok/springsecurity/demo/config/DemoAppConfig.java)
    * [Spring Dispatcher Servlet Initializer](https://github.com/Evgenen96/spring-security-demo/blob/master/src/main/java/ru/cofeok/springsecurity/demo/config/MySpringMvcDispatcherServletInitializer.java)
    * [Spring Security Initializer](https://github.com/Evgenen96/spring-security-demo/blob/master/src/main/java/ru/cofeok/springsecurity/demo/config/SecurityWebApplicationInitializer.java)
    * [Spring Security Configuration](https://github.com/Evgenen96/spring-security-demo/blob/master/src/main/java/ru/cofeok/springsecurity/demo/config/DemoSecurityConfig.java)
* Access Denied JSP processing ([code-line](https://github.com/Evgenen96/spring-security-demo/blob/master/src/main/webapp/WEB-INF/view/plain-login.jsp#L26))
* Logout support ([code-line](https://github.com/Evgenen96/spring-security-demo/blob/master/src/main/webapp/WEB-INF/view/fancy-login.jsp#L58))
* Restrict JSP Access based on role ([code-line](https://github.com/Evgenen96/spring-security-demo/blob/master/src/main/webapp/WEB-INF/view/home.jsp#L24))
* JDBC Authentication ([code-line](https://github.com/Evgenen96/spring-security-demo/blob/master/src/main/java/ru/cofeok/springsecurity/demo/config/DemoAppConfig.java#L41))