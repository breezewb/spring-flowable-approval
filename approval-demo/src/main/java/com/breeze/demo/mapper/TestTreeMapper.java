package com.breeze.demo.mapper;

import com.breeze.common.annotation.DataColumn;
import com.breeze.common.annotation.DataPermission;
import com.breeze.common.core.mapper.BaseMapperPlus;
import com.breeze.demo.domain.TestTree;
import com.breeze.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTreeMapper, TestTree, TestTreeVo> {

}
