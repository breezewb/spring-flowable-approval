package com.breeze.workflow.service;

import com.breeze.common.core.domain.PageQuery;
import com.breeze.common.core.page.TableDataInfo;
import com.breeze.flowable.core.domain.ProcessQuery;
import com.breeze.workflow.domain.vo.WfDeployVo;

import java.util.List;

public interface IWfDeployService {

    TableDataInfo<WfDeployVo> queryPageList(ProcessQuery processQuery, PageQuery pageQuery);

    TableDataInfo<WfDeployVo> queryPublishList(String processKey, PageQuery pageQuery);

    void updateState(String definitionId, String stateCode);

    String queryBpmnXmlById(String definitionId);

    void deleteByIds(List<String> deployIds);
}
