package com.breeze.demo.service;

import com.breeze.common.core.domain.PageQuery;
import com.breeze.common.core.page.TableDataInfo;
import com.breeze.demo.domain.TestDemo;
import com.breeze.demo.domain.bo.TestDemoBo;
import com.breeze.demo.domain.vo.TestDemoVo;

import java.util.Collection;
import java.util.List;

/**
 * 测试单表Service接口
 */
public interface ITestDemoService {

    /**
     * 查询单个
     */
    TestDemoVo queryById(Long id);

    /**
     * 查询列表
     */
    TableDataInfo<TestDemoVo> queryPageList(TestDemoBo bo, PageQuery pageQuery);

    /**
     * 自定义分页查询
     */
    TableDataInfo<TestDemoVo> customPageList(TestDemoBo bo, PageQuery pageQuery);

    /**
     * 查询列表
     */
    List<TestDemoVo> queryList(TestDemoBo bo);

    /**
     * 根据新增业务对象插入测试单表
     *
     * @param bo 测试单表新增业务对象
     */
    Boolean insertByBo(TestDemoBo bo);

    /**
     * 根据编辑业务对象修改测试单表
     *
     * @param bo 测试单表编辑业务对象
     */
    Boolean updateByBo(TestDemoBo bo);

    /**
     * 校验并删除数据
     *
     * @param ids     主键集合
     * @param isValid 是否校验,true-删除前校验,false-不校验
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);

    /**
     * 批量保存
     */
    Boolean saveBatch(List<TestDemo> list);
}
