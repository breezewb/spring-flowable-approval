package com.breeze.flowable.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FormType {

    /**
     * 流程表单
     */
    PROCESS(0),

    /**
     * 外置表单
     */
    EXTERNAL(1),

    /**
     * 节点独立表单
     */
    INDEPENDENT(2);

    /**
     * 表单类型
     */
    private final Integer type;
}
