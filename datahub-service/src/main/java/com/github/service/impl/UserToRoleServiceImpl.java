package com.github.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.entity.UserToRole;
import com.github.mapper.UserToRoleMapper;
import com.github.service.IUserToRoleService;
import org.springframework.stereotype.Service;

/**
 * @author 谢森
 * @date 2020/4/25 16:54
 */
@Service
public class UserToRoleServiceImpl extends ServiceImpl<UserToRoleMapper, UserToRole> implements IUserToRoleService {
    @Override
    public UserToRole selectByUserId(String userId) {
        return null;
    }
}
