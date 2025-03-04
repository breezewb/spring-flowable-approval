package com.breeze.flowable.utils;

import cn.hutool.core.util.ObjectUtil;
import com.breeze.common.core.domain.model.LoginUser;
import com.breeze.common.helper.LoginHelper;
import com.breeze.flowable.common.constant.TaskConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * 工作流任务工具类
 */
public class TaskUtils {

    public static String getUserId() {
        return String.valueOf(LoginHelper.getUserId());
    }

    /**
     * 获取用户组信息
     *
     * @return candidateGroup
     */
    public static List<String> getCandidateGroup() {
        List<String> list = new ArrayList<>();
        LoginUser user = LoginHelper.getLoginUser();
        if (ObjectUtil.isNotNull(user)) {
            if (ObjectUtil.isNotEmpty(user.getRoles())) {
                user.getRoles().forEach(role -> list.add(TaskConstants.ROLE_GROUP_PREFIX + role.getRoleId()));
            }
            if (ObjectUtil.isNotNull(user.getDeptId())) {
                list.add(TaskConstants.DEPT_GROUP_PREFIX + user.getDeptId());
            }
        }
        return list;
    }
}
