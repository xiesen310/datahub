package com.github.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.entity.TopicInfo;
import com.github.mapper.TopicInfoMapper;
import com.github.service.ITopicInfoService;
import org.springframework.stereotype.Service;

/**
 * @author 谢森
 * @date 2020/4/25 16:58
 */
@Service
public class TopicInfoServiceImpl extends ServiceImpl<TopicInfoMapper, TopicInfo> implements ITopicInfoService {
}
