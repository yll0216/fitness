package com.fit.fitsys.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fit_record")
public class FitRecord {
    /**
     * 健身记录id
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
     * 健身日期
     */
    @Column(name = "fit_time")
    private Date fitTime;

    /**
     * 课程id
     */
    @Column(name = "course_id")
    private Integer courseId;

    /**
     * 注释
     */
    private String remark;

    /**
     * 获取健身记录id
     *
     * @return id - 健身记录id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置健身记录id
     *
     * @param id 健身记录id
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
     * 获取健身日期
     *
     * @return fit_time - 健身日期
     */
    public Date getFitTime() {
        return fitTime;
    }

    /**
     * 设置健身日期
     *
     * @param fitTime 健身日期
     */
    public void setFitTime(Date fitTime) {
        this.fitTime = fitTime;
    }

    /**
     * 获取课程id
     *
     * @return course_id - 课程id
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * 设置课程id
     *
     * @param courseId 课程id
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
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