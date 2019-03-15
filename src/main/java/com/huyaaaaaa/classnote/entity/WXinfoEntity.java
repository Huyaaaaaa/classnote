package com.huyaaaaaa.classnote.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "WXinfo", schema = "classtest", catalog = "")
public class WXinfoEntity {
    private int wxId;
    private Integer wxAccountId;
    private String wxName;
    private String wxToken;
    private String wxImage;
    private String wxInfo1;
    private String wxInfo2;
    private String wxInfo3;
    private Timestamp wxCreatetime;
    private Timestamp wxUpdatetime;

    @Id
    @Column(name = "wx_id")
    public int getWxId() {
        return wxId;
    }

    public void setWxId(int wxId) {
        this.wxId = wxId;
    }

    @Basic
    @Column(name = "wx_account_id")
    public Integer getWxAccountId() {
        return wxAccountId;
    }

    public void setWxAccountId(Integer wxAccountId) {
        this.wxAccountId = wxAccountId;
    }

    @Basic
    @Column(name = "wx_name")
    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    @Basic
    @Column(name = "wx_token")
    public String getWxToken() {
        return wxToken;
    }

    public void setWxToken(String wxToken) {
        this.wxToken = wxToken;
    }

    @Basic
    @Column(name = "wx_image")
    public String getWxImage() {
        return wxImage;
    }

    public void setWxImage(String wxImage) {
        this.wxImage = wxImage;
    }

    @Basic
    @Column(name = "wx_info1")
    public String getWxInfo1() {
        return wxInfo1;
    }

    public void setWxInfo1(String wxInfo1) {
        this.wxInfo1 = wxInfo1;
    }

    @Basic
    @Column(name = "wx_info2")
    public String getWxInfo2() {
        return wxInfo2;
    }

    public void setWxInfo2(String wxInfo2) {
        this.wxInfo2 = wxInfo2;
    }

    @Basic
    @Column(name = "wx_info3")
    public String getWxInfo3() {
        return wxInfo3;
    }

    public void setWxInfo3(String wxInfo3) {
        this.wxInfo3 = wxInfo3;
    }

    @Basic
    @Column(name = "wx_createtime")
    public Timestamp getWxCreatetime() {
        return wxCreatetime;
    }

    public void setWxCreatetime(Timestamp wxCreatetime) {
        this.wxCreatetime = wxCreatetime;
    }

    @Basic
    @Column(name = "wx_updatetime")
    public Timestamp getWxUpdatetime() {
        return wxUpdatetime;
    }

    public void setWxUpdatetime(Timestamp wxUpdatetime) {
        this.wxUpdatetime = wxUpdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WXinfoEntity that = (WXinfoEntity) o;
        return wxId == that.wxId &&
                Objects.equals(wxAccountId, that.wxAccountId) &&
                Objects.equals(wxName, that.wxName) &&
                Objects.equals(wxToken, that.wxToken) &&
                Objects.equals(wxImage, that.wxImage) &&
                Objects.equals(wxInfo1, that.wxInfo1) &&
                Objects.equals(wxInfo2, that.wxInfo2) &&
                Objects.equals(wxInfo3, that.wxInfo3) &&
                Objects.equals(wxCreatetime, that.wxCreatetime) &&
                Objects.equals(wxUpdatetime, that.wxUpdatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wxId, wxAccountId, wxName, wxToken, wxImage, wxInfo1, wxInfo2, wxInfo3, wxCreatetime, wxUpdatetime);
    }
}
