package com.github.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;

/**
 * @author 谢森
 * @date 2020/4/25 16:01
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("tb_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 4838706668594955327L;
    /**
     * 用户主键
     */
    @TableId("user_id")
    private String userId;
    /**
     * 是电话号码，也是账号（登录用）
     */
    private String mobile;

    /**
     * 姓名
     */
    @TableField("user_name")
    private String username;

    /**
     * 密码
     */
    @TableField("pass_word")
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;

    /**
     * 状态值（1：启用，2：禁用，3：删除）
     */
    private Integer status;

    @TableField(exist = false)
    private String token;

    @TableField(exist = false)
    private String roleName;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }
}
