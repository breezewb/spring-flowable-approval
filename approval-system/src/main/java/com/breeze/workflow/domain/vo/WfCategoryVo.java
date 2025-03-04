package com.breeze.workflow.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 流程分类视图对象 flow_category
 */
@Data
@ExcelIgnoreUnannotated
public class WfCategoryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类ID
     */
    @ExcelProperty(value = "分类ID")
    private Long categoryId;

    /**
     * 分类名称
     */
    @ExcelProperty(value = "分类名称")
    private String categoryName;

    /**
     * 分类编码
     */
    @ExcelProperty(value = "分类编码")
    private String code;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String remark;


}
