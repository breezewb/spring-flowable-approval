package com.breeze.common.translation.impl;

import com.breeze.common.annotation.TranslationType;
import com.breeze.common.constant.TransConstant;
import com.breeze.common.core.service.UserService;
import com.breeze.common.translation.TranslationInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 用户名翻译实现
 */
@Component
@AllArgsConstructor
@TranslationType(type = TransConstant.USER_ID_TO_NAME)
public class UserNameTranslationImpl implements TranslationInterface<String> {

    private final UserService userService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof Long) {
            return userService.selectUserNameById((Long) key);
        }
        return null;
    }
}
