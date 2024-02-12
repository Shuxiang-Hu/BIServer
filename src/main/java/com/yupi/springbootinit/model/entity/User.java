package com.yupi.springbootinit.model.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;


/**
* 
* @TableName user
*/
public class User implements Serializable {

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
    * 账号
    */

    private String userAccount;
    /**
    * 密码
    */

    private String userPassword;
    /**
    * 用户昵称
    */

    private String userName;
    /**
    * 用户角色：user/admin
    */

    private String userRole;
    /**
    * 创建时间
    */

    private Date createTime;
    /**
    * 更新时间
    */

    private Date updateTime;
    /**
    * 是否删除
    */
    @TableLogic
    private Integer isDelete;

    /**
    * id
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 账号
    */
    private void setUserAccount(String userAccount){
    this.userAccount = userAccount;
    }

    /**
    * 密码
    */
    private void setUserPassword(String userPassword){
    this.userPassword = userPassword;
    }

    /**
    * 用户昵称
    */
    private void setUserName(String userName){
    this.userName = userName;
    }

    /**
    * 用户角色：user/admin
    */
    private void setUserRole(String userRole){
    this.userRole = userRole;
    }

    /**
    * 创建时间
    */
    private void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 更新时间
    */
    private void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }

    /**
    * 是否删除
    */
    private void setIsDelete(Integer isDelete){
    this.isDelete = isDelete;
    }


    /**
    * id
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 账号
    */
    private String getUserAccount(){
    return this.userAccount;
    }

    /**
    * 密码
    */
    private String getUserPassword(){
    return this.userPassword;
    }

    /**
    * 用户昵称
    */
    private String getUserName(){
    return this.userName;
    }

    /**
    * 用户角色：user/admin
    */
    private String getUserRole(){
    return this.userRole;
    }

    /**
    * 创建时间
    */
    private Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 更新时间
    */
    private Date getUpdateTime(){
    return this.updateTime;
    }

    /**
    * 是否删除
    */
    private Integer getIsDelete(){
    return this.isDelete;
    }

}
