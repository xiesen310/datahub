package com.github.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.entity.Business;
import com.github.mapper.BusinessMapper;
import com.github.service.IBusinessService;
import org.springframework.stereotype.Service;

/**
 * @author 谢森
 * @date 2020/4/25 16:56
 */
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business> implements IBusinessService {

}
