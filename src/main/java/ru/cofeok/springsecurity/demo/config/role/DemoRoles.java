package ru.cofeok.springsecurity.demo.config.role;

import java.util.HashSet;
import java.util.Set;

import static ru.cofeok.springsecurity.demo.config.role.RolesEnum.*;

public class DemoRoles {

    public final static UserRole EMP = new UserRole(EMPLOYEE);
    public final static UserRole MNG = new UserRole(MANAGER);
    public final static UserRole ADM = new UserRole(ADMIN);

    public static class UserRole {

        private Set<RolesEnum> roles;

        private UserRole(RolesEnum role) {
            roles = new HashSet<>();
            switch (role) {
                case ADMIN:
                    roles.add(ADMIN);
                case MANAGER:
                    roles.add(MANAGER);
                case EMPLOYEE:
                    roles.add(EMPLOYEE);
            }
        }

        public String[] toStringArray() {
            Object[] objs = roles.toArray();
            String[] strs = new String[objs.length];
            for (int i = 0; i < objs.length; i++) {
                strs[i] = ((RolesEnum) objs[i]).name();
            }
            return strs;
        }
    }
}
