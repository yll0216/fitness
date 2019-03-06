package com.fit.fitsys.entity;

import java.util.Date;
import javax.persistence.*;

public class Member {
    /**
     * 会员id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 姓名
     */
    @Column(name = "member_name")
    private String memberName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 电话
     */
    private String tel;

    /**
     * 地址
     */
    private String address;

    /**
     * 身高
     */
    private Integer height;

    /**
     * 体重
     */
    private Double weight;

    /**
     * 体脂率
     */
    private Double bmi;

    /**
     * 健身目的
     */
    private String goal;

    /**
     * 所选课程id
     */
    private String chooseid;

    /**
     * 获取会员id
     *
     * @return id - 会员id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置会员id
     *
     * @param id 会员id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return member_name - 姓名
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置姓名
     *
     * @param memberName 姓名
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取身高
     *
     * @return height - 身高
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 设置身高
     *
     * @param height 身高
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 获取体重
     *
     * @return weight - 体重
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 设置体重
     *
     * @param weight 体重
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 获取体脂率
     *
     * @return bmi - 体脂率
     */
    public Double getBmi() {
        return bmi;
    }

    /**
     * 设置体脂率
     *
     * @param bmi 体脂率
     */
    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }

    /**
     * 获取健身目的
     *
     * @return goal - 健身目的
     */
    public String getGoal() {
        return goal;
    }

    /**
     * 设置健身目的
     *
     * @param goal 健身目的
     */
    public void setGoal(String goal) {
        this.goal = goal;
    }

    /**
     * 获取所选课程id
     *
     * @return chooseid - 所选课程id
     */
    public String getChooseid() {
        return chooseid;
    }

    /**
     * 设置所选课程id
     *
     * @param chooseid 所选课程id
     */
    public void setChooseid(String chooseid) {
        this.chooseid = chooseid;
    }
}