package com.breeze.flowable.common.enums;

import com.breeze.common.utils.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProcessStatus {

    /**
     * 进行中（审批中）
     */
    RUNNING("running"),
    /**
     * 已终止
     */
    TERMINATED("terminated"),
    /**
     * 已完成
     */
    COMPLETED("completed"),
    /**
     * 已取消
     */
    CANCELED("canceled");

    private final String status;

    public static ProcessStatus getProcessStatus(String str) {
        if (StringUtils.isNotBlank(str)) {
            for (ProcessStatus value : values()) {
                if (StringUtils.equalsIgnoreCase(str, value.getStatus())) {
                    return value;
                }
            }
        }
        return null;
    }
}
