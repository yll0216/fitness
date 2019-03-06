package com.fit.fitsys.entity;

import java.util.Date;
import javax.persistence.*;

public class Money {
    /**
     * 工资编号
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
     * 基本工资
     */
    private Double basic;

    /**
     * 奖金
     */
    private Double bonus;

    /**
     * 实际所得
     */
    private Double real;

    /**
     * 发放时间
     */
    private Date time;

    /**
     * 获取工资编号
     *
     * @return id - 工资编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置工资编号
     *
     * @param id 工资编号
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
     * 获取基本工资
     *
     * @return basic - 基本工资
     */
    public Double getBasic() {
        return basic;
    }

    /**
     * 设置基本工资
     *
     * @param basic 基本工资
     */
    public void setBasic(Double basic) {
        this.basic = basic;
    }

    /**
     * 获取奖金
     *
     * @return bonus - 奖金
     */
    public Double getBonus() {
        return bonus;
    }

    /**
     * 设置奖金
     *
     * @param bonus 奖金
     */
    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取实际所得
     *
     * @return real - 实际所得
     */
    public Double getReal() {
        return real;
    }

    /**
     * 设置实际所得
     *
     * @param real 实际所得
     */
    public void setReal(Double real) {
        this.real = real;
    }

    /**
     * 获取发放时间
     *
     * @return time - 发放时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置发放时间
     *
     * @param time 发放时间
     */
    public void setTime(Date time) {
        this.time = time;
    }
}