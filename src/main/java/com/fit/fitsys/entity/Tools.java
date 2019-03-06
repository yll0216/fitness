package com.fit.fitsys.entity;

import java.util.Date;
import javax.persistence.*;

public class Tools {
    /**
     * 器材编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 器材名称
     */
    @Column(name = "tool_name")
    private String toolName;

    /**
     * 型号大小
     */
    private String size;

    /**
     * 检查时间
     */
    private Date checktime;

    /**
     * 注释
     */
    private String remark;

    /**
     * 维修时间
     */
    private Date repairtime;

    /**
     * 获取器材编号
     *
     * @return id - 器材编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置器材编号
     *
     * @param id 器材编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取器材名称
     *
     * @return tool_name - 器材名称
     */
    public String getToolName() {
        return toolName;
    }

    /**
     * 设置器材名称
     *
     * @param toolName 器材名称
     */
    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    /**
     * 获取型号大小
     *
     * @return size - 型号大小
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置型号大小
     *
     * @param size 型号大小
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 获取检查时间
     *
     * @return checktime - 检查时间
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
     * 设置检查时间
     *
     * @param checktime 检查时间
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
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

    /**
     * 获取维修时间
     *
     * @return repairtime - 维修时间
     */
    public Date getRepairtime() {
        return repairtime;
    }

    /**
     * 设置维修时间
     *
     * @param repairtime 维修时间
     */
    public void setRepairtime(Date repairtime) {
        this.repairtime = repairtime;
    }
}