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
* 图表信息表
* @TableName chart
*/
public class Chart implements Serializable {

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
    * 分析目标
    */

    private String goal;
    /**
    * 图表名称
    */

    private String name;
    /**
    * 图表数据
    */

    private String chartData;
    /**
    * 图表类型
    */

    private String chartType;
    /**
    * 生成的图表数据
    */

    private String genChart;
    /**
    * 生成的分析结论
    */

    private String genResult;
    /**
    * wait,running,succeed,failed
    */

    private String status;
    /**
    * 执行信息
    */

    private String execMessage;
    /**
    * 创建用户 id
    */

    private Long userId;
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
    * 分析目标
    */
    private void setGoal(String goal){
    this.goal = goal;
    }

    /**
    * 图表名称
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 图表数据
    */
    private void setChartData(String chartData){
    this.chartData = chartData;
    }

    /**
    * 图表类型
    */
    private void setChartType(String chartType){
    this.chartType = chartType;
    }

    /**
    * 生成的图表数据
    */
    private void setGenChart(String genChart){
    this.genChart = genChart;
    }

    /**
    * 生成的分析结论
    */
    private void setGenResult(String genResult){
    this.genResult = genResult;
    }

    /**
    * wait,running,succeed,failed
    */
    private void setStatus(String status){
    this.status = status;
    }

    /**
    * 执行信息
    */
    private void setExecMessage(String execMessage){
    this.execMessage = execMessage;
    }

    /**
    * 创建用户 id
    */
    private void setUserId(Long userId){
    this.userId = userId;
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
    * 分析目标
    */
    private String getGoal(){
    return this.goal;
    }

    /**
    * 图表名称
    */
    private String getName(){
    return this.name;
    }

    /**
    * 图表数据
    */
    private String getChartData(){
    return this.chartData;
    }

    /**
    * 图表类型
    */
    private String getChartType(){
    return this.chartType;
    }

    /**
    * 生成的图表数据
    */
    private String getGenChart(){
    return this.genChart;
    }

    /**
    * 生成的分析结论
    */
    private String getGenResult(){
    return this.genResult;
    }

    /**
    * wait,running,succeed,failed
    */
    private String getStatus(){
    return this.status;
    }

    /**
    * 执行信息
    */
    private String getExecMessage(){
    return this.execMessage;
    }

    /**
    * 创建用户 id
    */
    private Long getUserId(){
    return this.userId;
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
