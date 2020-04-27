package com.github.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 谢森
 * @date 2020/4/25 16:22
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 等同于编写一个普通 list 查询，mybatis-plus 自动替你分页
     *
     * @param page
     * @param info
     * @param status
     * @param startTime
     * @param endTime
     * @return
     */
    List<User> selectPageByConditionUser(Page<User> page, @Param("info") String info,
                                         @Param("status") Integer[] status,
                                         @Param("startTime") String startTime,
                                         @Param("endTime") String endTime);
    
}
