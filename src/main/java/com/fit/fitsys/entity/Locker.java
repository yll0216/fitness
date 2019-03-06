package com.fit.fitsys.entity;

import java.util.Date;
import javax.persistence.*;

public class Locker {
    /**
     * 存物柜id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 会员id
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 存物柜大小
     */
    private String size;

    /**
     * 存放时间
     */
    @Column(name = "leave_time")
    private Date leaveTime;

    /**
     * 取回时间
     */
    @Column(name = "get_time")
    private Date getTime;

    /**
     * 注释
     */
    private String remark;

    /**
     * 获取存物柜id
     *
     * @return id - 存物柜id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置存物柜id
     *
     * @param id 存物柜id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取会员id
     *
     * @return member_id - 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置会员id
     *
     * @param memberId 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取存物柜大小
     *
     * @return size - 存物柜大小
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置存物柜大小
     *
     * @param size 存物柜大小
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 获取存放时间
     *
     * @return leave_time - 存放时间
     */
    public Date getLeaveTime() {
        return leaveTime;
    }

    /**
     * 设置存放时间
     *
     * @param leaveTime 存放时间
     */
    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    /**
     * 获取取回时间
     *
     * @return get_time - 取回时间
     */
    public Date getGetTime() {
        return getTime;
    }

    /**
     * 设置取回时间
     *
     * @param getTime 取回时间
     */
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
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