package com.macongcong.entity;/*
 作者:马聪聪
 时间:2019-11-25 16:04   
    */

/**
 * @Description
 * @Author M_cc
 * @Date 2019-11-25-16:04
 */
public class Order {
    private int aid;
    private String address;
    private int sid;
    private int cid;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
