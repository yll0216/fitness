package com.fit.fitsys.entity;

import java.util.Date;
import javax.persistence.*;

public class Check {
    /**
     * 考勤id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 教练编号
     */
    @Column(name = "coach_id")
    private Integer coachId;

    /**
     * 考勤日期
     */
    @Column(name = "check_time")
    private Date checkTime;

    /**
     * 考勤状态（迟到，旷工）
     */
    private String status;

    /**
     * 注释
     */
    private String remark;

    /**
     * 获取考勤id
     *
     * @return id - 考勤id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置考勤id
     *
     * @param id 考勤id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取教练编号
     *
     * @return coach_id - 教练编号
     */
    public Integer getCoachId() {
        return coachId;
    }

    /**
     * 设置教练编号
     *
     * @param coachId 教练编号
     */
    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    /**
     * 获取考勤日期
     *
     * @return check_time - 考勤日期
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * 设置考勤日期
     *
     * @param checkTime 考勤日期
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 获取考勤状态（迟到，旷工）
     *
     * @return status - 考勤状态（迟到，旷工）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置考勤状态（迟到，旷工）
     *
     * @param status 考勤状态（迟到，旷工）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取注释
     *
     * @return remark - 注释
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置注释
     *
     * @param remark 注释
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}