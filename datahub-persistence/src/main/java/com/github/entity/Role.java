package com.github.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;

/**
 * @author 谢森
 * @date 2020/4/25 16:05
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("tb_role")
public class Role extends Model<Role> {
    private static final long serialVersionUID = -3817627087795787687L;

    /**
     * 角色代号主键
     */
    @TableField("role_id")
    private String roleId;

    /**
     * 角色名称
     */
    @TableId("role_name")
    private String roleName;

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }
}
