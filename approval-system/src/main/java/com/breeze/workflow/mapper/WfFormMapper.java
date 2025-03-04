package com.breeze.workflow.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.breeze.common.core.mapper.BaseMapperPlus;
import com.breeze.workflow.domain.WfForm;
import com.breeze.workflow.domain.vo.WfFormVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 流程表单Mapper接口
 */
public interface WfFormMapper extends BaseMapperPlus<WfFormMapper, WfForm, WfFormVo> {

    List<WfFormVo> selectFormVoList(@Param(Constants.WRAPPER) Wrapper<WfForm> queryWrapper);
}
