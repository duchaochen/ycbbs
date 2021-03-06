package com.ycbbs.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Table(name="sys_user_role")
public class UserRoleInfo implements Serializable {
    /**
     * 用户id
     */
    private String ycUserId;
    /**
     * 角色id
     */
    private String ycRoleId;
    /**
     * 通用mybatis绑定时过滤此属性
     */
    @Transient
    private UserInfo userInfo;
    /**
     * 通用mybatis绑定时过滤此属性
     */
    @Transient
    private RoleInfo roleInfo;
}
