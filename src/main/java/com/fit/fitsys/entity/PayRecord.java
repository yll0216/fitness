package com.fit.fitsys.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pay_record")
public class PayRecord {
    /**
     * 消费记录
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
     * 消费日期
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 消费金额
     */
    private Double money;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取消费记录
     *
     * @return id - 消费记录
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置消费记录
     *
     * @param id 消费记录
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
     * 获取消费日期
     *
     * @return pay_time - 消费日期
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置消费日期
     *
     * @param payTime 消费日期
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取消费金额
     *
     * @return money - 消费金额
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置消费金额
     *
     * @param money 消费金额
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}