package com.huyaaaaaa.classnote.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "account", schema = "classtest")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class AccountEntity {
    private String accountId;
    private String accountUserId;
    private String accountAcc;
    private String accountPwd;
    private String accountEmail;
    private String accountStatus;
    private String accountLastIp;
    private Timestamp accountLastlogintime;
    private String accountCreateip;
    private Timestamp accountCreatetime;
    private Timestamp accountUpdatetime;

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "account_ID")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "account_user_id")
    public String getAccountUserId() {
        return accountUserId;
    }

    public void setAccountUserId(String accountUserId) {
        this.accountUserId = accountUserId;
    }

    @Basic
    @Column(name = "account_acc")
    public String getAccountAcc() {
        return accountAcc;
    }

    public void setAccountAcc(String accountAcc) {
        this.accountAcc = accountAcc;
    }

    @Basic
    @Column(name = "account_pwd")
    public String getAccountPwd() {
        return accountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd;
    }

    @Basic
    @Column(name = "account_email")
    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    @Basic
    @Column(name = "account_status")
    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Basic
    @Column(name = "account_last_ip")
    public String getAccountLastIp() {
        return accountLastIp;
    }

    public void setAccountLastIp(String accountLastIp) {
        this.accountLastIp = accountLastIp;
    }

    @Basic
    @Column(name = "account_lastlogintime")
    public Timestamp getAccountLastlogintime() {
        return accountLastlogintime;
    }

    public void setAccountLastlogintime(Timestamp accountLastlogintime) {
        this.accountLastlogintime = accountLastlogintime;
    }

    @Basic
    @Column(name = "account_createip")
    public String getAccountCreateip() {
        return accountCreateip;
    }

    public void setAccountCreateip(String accountCreateip) {
        this.accountCreateip = accountCreateip;
    }

    @Basic
    @Column(name = "account_createtime")
    public Timestamp getAccountCreatetime() {
        return accountCreatetime;
    }

    public void setAccountCreatetime(Timestamp accountCreatetime) {
        this.accountCreatetime = accountCreatetime;
    }

    @Basic
    @Column(name = "account_updatetime")
    public Timestamp getAccountUpdatetime() {
        return accountUpdatetime;
    }

    public void setAccountUpdatetime(Timestamp accountUpdatetime) {
        this.accountUpdatetime = accountUpdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountEntity that = (AccountEntity) o;
        return Objects.equals(accountId, that.accountId) &&
                Objects.equals(accountUserId, that.accountUserId) &&
                Objects.equals(accountAcc, that.accountAcc) &&
                Objects.equals(accountPwd, that.accountPwd) &&
                Objects.equals(accountEmail, that.accountEmail) &&
                Objects.equals(accountStatus, that.accountStatus) &&
                Objects.equals(accountLastIp, that.accountLastIp) &&
                Objects.equals(accountLastlogintime, that.accountLastlogintime) &&
                Objects.equals(accountCreateip, that.accountCreateip) &&
                Objects.equals(accountCreatetime, that.accountCreatetime) &&
                Objects.equals(accountUpdatetime, that.accountUpdatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountUserId, accountAcc, accountPwd, accountEmail, accountStatus, accountLastIp, accountLastlogintime, accountCreateip, accountCreatetime, accountUpdatetime);
    }
}
