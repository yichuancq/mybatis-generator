package com.example.domain;

import java.util.Date;

public class PatrolPointDoTask {
    private String uuid;

    private String buildId;

    private String patrolName;

    private String patrolType;

    private Date requiredTime;

    private Date arrivalTime;

    private String isdone;

    private Integer x;

    private Integer y;

    private Integer radius;

    private String patrolManId;

    private String patrolManName;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;

    private String deleteFlag;

    private String enableFlag;

    private String memo;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public String getPatrolName() {
        return patrolName;
    }

    public void setPatrolName(String patrolName) {
        this.patrolName = patrolName;
    }

    public String getPatrolType() {
        return patrolType;
    }

    public void setPatrolType(String patrolType) {
        this.patrolType = patrolType;
    }

    public Date getRequiredTime() {
        return requiredTime;
    }

    public void setRequiredTime(Date requiredTime) {
        this.requiredTime = requiredTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getIsdone() {
        return isdone;
    }

    public void setIsdone(String isdone) {
        this.isdone = isdone;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public String getPatrolManId() {
        return patrolManId;
    }

    public void setPatrolManId(String patrolManId) {
        this.patrolManId = patrolManId;
    }

    public String getPatrolManName() {
        return patrolManName;
    }

    public void setPatrolManName(String patrolManName) {
        this.patrolManName = patrolManName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}