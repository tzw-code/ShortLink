package com.tangzw.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 用户登录请求参数DTO
 */
@Data
public class UserLoginReqDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;
}
