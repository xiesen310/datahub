package com.github.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.entity.UserToRole;

/**
 * @author 谢森
 * @date 2020/4/25 16:53
 */
public interface IUserToRoleService extends IService<UserToRole> {
    /**
     * 根据用户ID查询人员角色
     * @param userId 用户ID
     * @return  结果
     */
    UserToRole selectByUserId(String  userId);
}
