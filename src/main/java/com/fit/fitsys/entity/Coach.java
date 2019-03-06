package com.fit.fitsys.entity;

import javax.persistence.*;

public class Coach {
    /**
     * 教练id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 教练姓名
     */
    @Column(name = "coach_name")
    private String coachName;

    /**
     * 执教类型
     */
    private String type;

    /**
     * 教练等级
     */
    private String level;

    /**
     * 开设课程id
     */
    @Column(name = "course_id")
    private Integer courseId;

    /**
     * 工资收入情况
     */
    private Double money;

    /**
     * 注释
     */
    private String remark;

    /**
     * 获取教练id
     *
     * @return id - 教练id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置教练id
     *
     * @param id 教练id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取教练姓名
     *
     * @return coach_name - 教练姓名
     */
    public String getCoachName() {
        return coachName;
    }

    /**
     * 设置教练姓名
     *
     * @param coachName 教练姓名
     */
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    /**
     * 获取执教类型
     *
     * @return type - 执教类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置执教类型
     *
     * @param type 执教类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取教练等级
     *
     * @return level - 教练等级
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置教练等级
     *
     * @param level 教练等级
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取开设课程id
     *
     * @return course_id - 开设课程id
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * 设置开设课程id
     *
     * @param courseId 开设课程id
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * 获取工资收入情况
     *
     * @return money - 工资收入情况
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置工资收入情况
     *
     * @param money 工资收入情况
     */
    public void setMoney(Double money) {
        this.money = money;
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