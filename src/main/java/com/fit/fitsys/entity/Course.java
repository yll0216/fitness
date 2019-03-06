package com.fit.fitsys.entity;

import java.util.Date;
import javax.persistence.*;

public class Course {
    /**
     * 课程id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程名称
     */
    @Column(name = "course_name")
    private String courseName;

    /**
     * 课程类型
     */
    private String type;

    /**
     * 教练编号
     */
    @Column(name = "coach_id")
    private Integer coachId;

    /**
     * 开设时间
     */
    private Date time;

    /**
     * 器材id
     */
    @Column(name = "tool_id")
    private Integer toolId;

    /**
     * 难度等级
     */
    private String level;

    /**
     * 训练部位
     */
    private String part;

    /**
     * 注解
     */
    private String remark;

    /**
     * 获取课程id
     *
     * @return id - 课程id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置课程id
     *
     * @param id 课程id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取课程名称
     *
     * @return course_name - 课程名称
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * 设置课程名称
     *
     * @param courseName 课程名称
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * 获取课程类型
     *
     * @return type - 课程类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置课程类型
     *
     * @param type 课程类型
     */
    public void setType(String type) {
        this.type = type;
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
     * 获取开设时间
     *
     * @return time - 开设时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置开设时间
     *
     * @param time 开设时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取器材id
     *
     * @return tool_id - 器材id
     */
    public Integer getToolId() {
        return toolId;
    }

    /**
     * 设置器材id
     *
     * @param toolId 器材id
     */
    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    /**
     * 获取难度等级
     *
     * @return level - 难度等级
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置难度等级
     *
     * @param level 难度等级
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取训练部位
     *
     * @return part - 训练部位
     */
    public String getPart() {
        return part;
    }

    /**
     * 设置训练部位
     *
     * @param part 训练部位
     */
    public void setPart(String part) {
        this.part = part;
    }

    /**
     * 获取注解
     *
     * @return remark - 注解
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置注解
     *
     * @param remark 注解
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}