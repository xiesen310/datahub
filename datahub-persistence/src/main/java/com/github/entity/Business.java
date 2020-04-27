package com.github.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;

/**
 * @author 谢森
 * @date 2020/4/25 16:09
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("tb_business")
public class Business extends Model<Business> {

    private static final long serialVersionUID = -7449584810185708975L;

    /**
     * 业务 id
     */
    @TableField("business_id")
    private String businessId;

    /**
     * 业务名称
     */
    @TableField("business_name")
    private String businessName;

    /**
     * 业务描述
     */
    @TableField("business_comments")
    private String businessComments;


    @Override
    protected Serializable pkVal() {
        return this.businessId;
    }
}
