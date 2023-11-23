package com.demo.vo;

import java.io.Serializable;

/**
 * 入库（t_ruku表对应的Java实体类）
 */
public class Ruku implements Serializable {
    private Long id;//主键
    private String rukuNo;//货号
    private String rukuDingdanhao;//采购单号
    private String rukuName;//货物名称
    private String rukuSuliang;//数量
    private String rukuTime;//入库时间
    private String rukuRen;//操作员
    private String rukuText;//备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getRukuNo() {
        return rukuNo;
    }

    public void setRukuNo(String rukuNo) {
        this.rukuNo = rukuNo;
    }
    public String getRukuDingdanhao() {
        return rukuDingdanhao;
    }

    public void setRukuDingdanhao(String rukuDingdanhao) {
        this.rukuDingdanhao = rukuDingdanhao;
    }
    public String getRukuName() {
        return rukuName;
    }

    public void setRukuName(String rukuName) {
        this.rukuName = rukuName;
    }
    public String getRukuSuliang() {
        return rukuSuliang;
    }

    public void setRukuSuliang(String rukuSuliang) {
        this.rukuSuliang = rukuSuliang;
    }
    public String getRukuTime() {
        return rukuTime;
    }

    public void setRukuTime(String rukuTime) {
        this.rukuTime = rukuTime;
    }
    public String getRukuRen() {
        return rukuRen;
    }

    public void setRukuRen(String rukuRen) {
        this.rukuRen = rukuRen;
    }
    public String getRukuText() {
        return rukuText;
    }

    public void setRukuText(String rukuText) {
        this.rukuText = rukuText;
    }
}
