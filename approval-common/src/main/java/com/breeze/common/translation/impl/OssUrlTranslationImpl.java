package com.breeze.common.translation.impl;

import com.breeze.common.annotation.TranslationType;
import com.breeze.common.constant.TransConstant;
import com.breeze.common.core.service.OssService;
import com.breeze.common.translation.TranslationInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * OSS翻译实现
 */
@Component
@AllArgsConstructor
@TranslationType(type = TransConstant.OSS_ID_TO_URL)
public class OssUrlTranslationImpl implements TranslationInterface<String> {

    private final OssService ossService;

    @Override
    public String translation(Object key, String other) {
        return ossService.selectUrlByIds(key.toString());
    }
}
