package com.github.entity;

/**
 * @author 谢森
 * @date 2020/4/25 16:14
 */
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("tb_topic_info")
public class TopicInfo extends Model<TopicInfo> {

    /**
     * 主题 id
     */
    @TableField("topic_id")
    private String topicId;

    /**
     * 主题名称
     */
    @TableField("topic_name")
    private String topicName;

    /**
     * 分区数
     */
    @TableField("partition_num")
    private int partitionNum;

    /**
     * 副本数
     */
    @TableField("replication_num")
    private int replicationNum;

    /**
     * 生命周期
     */
    @TableField("ttl")
    private int ttl;

    /**
     * 配置信息
     */
    @TableField("config")
    private String config;

    /**
     * 用户 id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 描述信息
     */
    @TableField("comments")
    private String comments;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;

    @Override
    protected Serializable pkVal() {
        return this.topicId;
    }
}
