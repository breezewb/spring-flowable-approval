package com.breeze.workflow.domain.vo;

import lombok.Data;

import java.util.Date;

/**
 * 流程批复视图对象
 */
@Data
public class WfCommentVo {

    /**
     * 审批类别
     */
    private String type;

    /**
     * 批复内容
     */
    private String message;

    /**
     * 批复时间
     */
    private Date time;


}
