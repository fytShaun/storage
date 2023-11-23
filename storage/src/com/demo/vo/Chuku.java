package com.demo.vo;

import java.io.Serializable;

/**
 * 出库（t_chuku表对应的Java实体类）
 */
public class Chuku implements Serializable {
    private Long id;//主键
    private String chukuHuohao;//货号
    private String chukuName;//货物名称
    private String chukuSuliang;//数量
    private String chukuClientname;//客户名
    private String chukuTel;//联系方式
    private String chukuMan;//操作员
    private String chukuText;//备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getChukuHuohao() {
        return chukuHuohao;
    }

    public void setChukuHuohao(String chukuHuohao) {
        this.chukuHuohao = chukuHuohao;
    }
    public String getChukuName() {
        return chukuName;
    }

    public void setChukuName(String chukuName) {
        this.chukuName = chukuName;
    }
    public String getChukuSuliang() {
        return chukuSuliang;
    }

    public void setChukuSuliang(String chukuSuliang) {
        this.chukuSuliang = chukuSuliang;
    }
    public String getChukuClientname() {
        return chukuClientname;
    }

    public void setChukuClientname(String chukuClientname) {
        this.chukuClientname = chukuClientname;
    }
    public String getChukuTel() {
        return chukuTel;
    }

    public void setChukuTel(String chukuTel) {
        this.chukuTel = chukuTel;
    }
    public String getChukuMan() {
        return chukuMan;
    }

    public void setChukuMan(String chukuMan) {
        this.chukuMan = chukuMan;
    }
    public String getChukuText() {
        return chukuText;
    }

    public void setChukuText(String chukuText) {
        this.chukuText = chukuText;
    }
}
