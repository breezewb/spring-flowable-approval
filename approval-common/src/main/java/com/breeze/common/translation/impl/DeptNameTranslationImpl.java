package com.breeze.common.translation.impl;

import com.breeze.common.annotation.TranslationType;
import com.breeze.common.constant.TransConstant;
import com.breeze.common.core.service.DeptService;
import com.breeze.common.translation.TranslationInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 部门翻译实现
 */
@Component
@AllArgsConstructor
@TranslationType(type = TransConstant.DEPT_ID_TO_NAME)
public class DeptNameTranslationImpl implements TranslationInterface<String> {

    private final DeptService deptService;

    @Override
    public String translation(Object key, String other) {
        return deptService.selectDeptNameByIds(key.toString());
    }
}
