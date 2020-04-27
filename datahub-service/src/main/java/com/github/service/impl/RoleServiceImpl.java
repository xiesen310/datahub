package com.github.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.entity.Role;
import com.github.mapper.RoleMapper;
import com.github.model.RoleModel;
import com.github.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 谢森
 * @date 2020/4/25 16:50
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
    @Override
    public boolean addRoleAndPermission(RoleModel roleModel) throws Exception {
        return false;
    }

    @Override
    public boolean updateRoleInfo(RoleModel roleModel) throws Exception {
        return false;
    }

    @Override
    public Map<String, Object> getMenuByRoleCode(String roleCode) {
        return null;
    }

    @Override
    public void getRoleIsAdminByUserNo(String userNo) throws Exception {

    }

    @Override
    public Map<String, Object> selectByRoleCode(String roleCode) throws Exception {
        return null;
    }

    @Override
    public void deleteByRoleCode(String roleCode) throws Exception {

    }
}
