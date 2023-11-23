package com.demo.vo;

import java.io.Serializable;

/**
 * 库存（t_kuchun表对应的Java实体类）
 */
public class Kuchun implements Serializable {
    private Long id;//主键
    private String kuchunNo;//货号
    private String kuchunName;//货物名称
    private String kuchunCount;//数量
    private String kuchunRukushijian;//入库时间
    private String kuchunRen;//操作员
    private String kuchunText;//备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getKuchunNo() {
        return kuchunNo;
    }

    public void setKuchunNo(String kuchunNo) {
        this.kuchunNo = kuchunNo;
    }
    public String getKuchunName() {
        return kuchunName;
    }

    public void setKuchunName(String kuchunName) {
        this.kuchunName = kuchunName;
    }
    public String getKuchunCount() {
        return kuchunCount;
    }

    public void setKuchunCount(String kuchunCount) {
        this.kuchunCount = kuchunCount;
    }
    public String getKuchunRukushijian() {
        return kuchunRukushijian;
    }

    public void setKuchunRukushijian(String kuchunRukushijian) {
        this.kuchunRukushijian = kuchunRukushijian;
    }
    public String getKuchunRen() {
        return kuchunRen;
    }

    public void setKuchunRen(String kuchunRen) {
        this.kuchunRen = kuchunRen;
    }
    public String getKuchunText() {
        return kuchunText;
    }

    public void setKuchunText(String kuchunText) {
        this.kuchunText = kuchunText;
    }
}
