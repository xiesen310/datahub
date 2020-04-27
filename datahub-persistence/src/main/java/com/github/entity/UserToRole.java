package com.github.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;

/**
 * @author 谢森
 * @date 2020/4/25 16:07
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("tb_user_to_role")
public class UserToRole extends Model<UserToRole> {

    private static final long serialVersionUID = -3452904187335252238L;

    /**
     * 主键
     */
    @TableId(value = "user_to_role_id", type = IdType.AUTO)
    private Integer userToRoleId;

    /**
     * 用户 id
     */
    @TableField("user_id")
    private String userId;
    
    /**
     * 角色 id
     */
    @TableField("role_id")
    private String roleId;

    @Override
    protected Serializable pkVal() {
        return this.userToRoleId;
    }
}
