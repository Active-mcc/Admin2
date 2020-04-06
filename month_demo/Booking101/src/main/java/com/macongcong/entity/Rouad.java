package com.macongcong.entity;/*
 作者:马聪聪
 时间:2019-11-25 15:32   
    */

import java.io.Serializable;

/**
 * @Description
 * @Author M_cc
 * @Date 2019-11-25-15:32
 */
public class Rouad implements Serializable {
    private int sid;
    private String sname;
    private String cid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
