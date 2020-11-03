package com.xiayu.springboot.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * Description: 
 * 
 * @Author xiayu
 * @Date 2020/11/3 14:27
 * @version v1.0.0
 */
@ApiModel(value="com-xiayu-springboot-domain-User")
@Getter
@Setter
@ToString
public class UserPo implements Serializable {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    private String id;

    /**
    * 登录名称
    */
    @ApiModelProperty(value="登录名称")
    private String loginName;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String password;

    /**
    * 用户类型，0 超级管理员，1 管理员 ，2 操作人员
    */
    @ApiModelProperty(value="用户类型，0 超级管理员，1 管理员 ，2 操作人员")
    private Integer type;

    /**
    * 电话
    */
    @ApiModelProperty(value="电话")
    private String tel;

    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private String userNumber;

    /**
    * 用户状态，0 新建，1 正常 ，2 禁用 ，3 注销
    */
    @ApiModelProperty(value="用户状态，0 新建，1 正常 ，2 禁用 ，3 注销")
    private Integer userStatus;

    /**
    * 最后登录时间
    */
    @ApiModelProperty(value="最后登录时间")
    private Date lastTime;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
    * 删除标志，0 未删除，1 已删除
    */
    @ApiModelProperty(value="删除标志，0 未删除，1 已删除")
    private Integer delFlag;

    private static final long serialVersionUID = 1L;
}