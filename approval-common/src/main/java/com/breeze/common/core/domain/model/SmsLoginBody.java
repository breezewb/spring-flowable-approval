package com.breeze.common.core.domain.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 短信登录对象
 */

@Data
public class SmsLoginBody {

    /**
     * 手机号
     */
    @NotBlank(message = "{user.phonenumber.not.blank}")
    private String phonenumber;

    /**
     * 短信code
     */
    @NotBlank(message = "{sms.code.not.blank}")
    private String smsCode;

}
