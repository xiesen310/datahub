package com.github.common.base;

/**
 * @author 谢森
 * @date 2020/4/25 15:42
 */
public class Constant {
    /**
     * 用户注册默认角色 0:admin 1:user
     */
    public static final int DEFAULT_REGISTER_ROLE = 1;

    public class RoleType {

        /**
         * 管理员
         */
        public static final String ADMIN = "admin";

        /**
         * 普通用户
         */
        public static final String USER = "user";
    }
}
