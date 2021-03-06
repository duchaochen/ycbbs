package com.ycbbs.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Table(name="sys_user")
public class UserInfo implements Serializable {
    /**
     * 用户id
     */
    @Id
    private String  uid;
    /**
     * 用户名
     */
    @Column(name="username")
    private String  username;
    /**
     * 密码
     */
    @Column(name="password")
    private String  password;
    /**
     * 通用mybatis绑定时过滤此属性
     */
    @Transient
    private String confirmPassword;
    /**
     * 真实名称
     */
    @Column(name="realname")
    private String  realname;
    /**
     * 邮箱
     */
    @Column(name="email")
    private String  email;
    /**
     * 电话
     */
    @Column(name="telephone")
    private String  telephone;
    /**
     * 生日
     */
    @Column(name="birthday")
    private Date birthday;
    /**
     * 性别(0男,1女)
     */
    @Column(name="sex")
    private String  sex;
    /**
     * 账号激活状态（0未，1激活）
     */
    @Column(name="state")
    private String  state;
    /**
     * 激活码
     */
    @Column(name="code")
    private String  code;
    /**
     * 图片路径
     */
    @Column(name="imgpath")
    private String imgpath;
    /**
     * 盐
     */
    @Column(name="salt")
    private String salt;
    /**
     * 账号是否锁定，1.锁定
     */
    @Column(name="locked")
    private String locked;
    /**
     * 是否删除(0为否，1为是)
     */
    @Column(name="deleted")
    private String deleted;
    /**
     * 信息是否完整
     */
    @Column(name="completed")
    private String completed;
    /**
     * 用户的角色
     */
    @Transient
    private List<RoleInfo> roleInfos;
}





