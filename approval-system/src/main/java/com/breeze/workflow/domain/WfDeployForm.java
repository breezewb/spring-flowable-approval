package com.breeze.workflow.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 流程实例关联表单对象 sys_instance_form
 */
@Data
@TableName("wf_deploy_form")
public class WfDeployForm implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 流程部署主键
     */
    private String deployId;

    /**
     * 表单Key
     */
    private String formKey;

    /**
     * 节点Key
     */
    private String nodeKey;

    /**
     * 表单名称
     */
    private String formName;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 表单内容
     */
    private String content;
}
