package com.github.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.entity.User;
import com.github.mapper.UserMapper;
import com.github.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 谢森
 * @date 2020/4/25 16:46
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public User getUserByUserName(String username) {
        return null;
    }

    @Override
    public User getUserByMobile(String mobile) {
        return null;
    }

    @Override
    public User register(User user, String roleCode) {
        return null;
    }

    @Override
    public Map<String, Object> getLoginUserAndMenuInfo(User user) {
        return null;
    }

    @Override
    public void deleteByUserNo(String userNo) throws Exception {

    }

    @Override
    public Page<User> selectPageByConditionUser(Page<User> userPage, String info, Integer[] status, String startTime, String endTime) {
        return null;
    }

    @Override
    public Map<String, Object> checkMobileAndPasswd(JSONObject requestJson) throws Exception {
        return null;
    }

    @Override
    public Map<String, Object> checkMobileAndCatcha(JSONObject requestJson) throws Exception {
        return null;
    }

    @Override
    public User checkAndRegisterUser(JSONObject requestJson) throws Exception {
        return null;
    }

    @Override
    public User updateForgetPasswd(JSONObject requestJson) throws Exception {
        return null;
    }

    @Override
    public void resetMobile(User currentUser, JSONObject requestJson) throws Exception {

    }

    @Override
    public void resetPassWord(User currentUser, JSONObject requestJson) throws Exception {

    }

    @Override
    public User insertUserByAdmin(JSONObject requestJson) throws Exception {
        return null;
    }
}
