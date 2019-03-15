package com.huyaaaaaa.classnote.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "classtest")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class UserEntity {

    private String userId;
    private String userLastname;
    private String userFirstname;
    private String userIdentity;
    private String userSex;
    private String userMail;
    private Integer userPhone;
    private String userIsBindWx;
    private String userSignFrom;
    private String userStatus;
    private String userCharacter;
    private String userIfsignd;
    private Timestamp userCreatetime;
    private Timestamp userUpdatetime;

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "user_ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_lastname")
    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    @Basic
    @Column(name = "user_firstname")
    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    @Basic
    @Column(name = "user_identity")
    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    @Basic
    @Column(name = "user_sex")
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "user_mail")
    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    @Basic
    @Column(name = "user_phone")
    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "user_is_bind_wx")
    public String getUserIsBindWx() {
        return userIsBindWx;
    }

    public void setUserIsBindWx(String userIsBindWx) {
        this.userIsBindWx = userIsBindWx;
    }

    @Basic
    @Column(name = "user_sign_from")
    public String getUserSignFrom() {
        return userSignFrom;
    }

    public void setUserSignFrom(String userSignFrom) {
        this.userSignFrom = userSignFrom;
    }

    @Basic
    @Column(name = "user_status")
    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "user_character")
    public String getUserCharacter() {
        return userCharacter;
    }

    public void setUserCharacter(String userCharacter) {
        this.userCharacter = userCharacter;
    }

    @Basic
    @Column(name = "user_ifsignd")
    public String getUserIfsignd() {
        return userIfsignd;
    }

    public void setUserIfsignd(String userIfsignd) {
        this.userIfsignd = userIfsignd;
    }

    @Basic
    @Column(name = "user_createtime")
    public Timestamp getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Timestamp userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    @Basic
    @Column(name = "user_updatetime")
    public Timestamp getUserUpdatetime() {
        return userUpdatetime;
    }

    public void setUserUpdatetime(Timestamp userUpdatetime) {
        this.userUpdatetime = userUpdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return userId == that.userId &&
                Objects.equals(userLastname, that.userLastname) &&
                Objects.equals(userFirstname, that.userFirstname) &&
                Objects.equals(userIdentity, that.userIdentity) &&
                Objects.equals(userSex, that.userSex) &&
                Objects.equals(userMail, that.userMail) &&
                Objects.equals(userPhone, that.userPhone) &&
                Objects.equals(userIsBindWx, that.userIsBindWx) &&
                Objects.equals(userSignFrom, that.userSignFrom) &&
                Objects.equals(userStatus, that.userStatus) &&
                Objects.equals(userCharacter, that.userCharacter) &&
                Objects.equals(userIfsignd, that.userIfsignd) &&
                Objects.equals(userCreatetime, that.userCreatetime) &&
                Objects.equals(userUpdatetime, that.userUpdatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userLastname, userFirstname, userIdentity, userSex, userMail, userPhone, userIsBindWx, userSignFrom, userStatus, userCharacter, userIfsignd, userCreatetime, userUpdatetime);
    }
}


