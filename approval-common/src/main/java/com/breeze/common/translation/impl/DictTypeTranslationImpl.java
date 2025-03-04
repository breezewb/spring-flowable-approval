package com.breeze.common.translation.impl;

import com.breeze.common.annotation.TranslationType;
import com.breeze.common.constant.TransConstant;
import com.breeze.common.core.service.DictService;
import com.breeze.common.translation.TranslationInterface;
import com.breeze.common.utils.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 字典翻译实现
 */
@Component
@AllArgsConstructor
@TranslationType(type = TransConstant.DICT_TYPE_TO_LABEL)
public class DictTypeTranslationImpl implements TranslationInterface<String> {

    private final DictService dictService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof String && StringUtils.isNotBlank(other)) {
            return dictService.getDictLabel(other, key.toString());
        }
        return null;
    }
}
