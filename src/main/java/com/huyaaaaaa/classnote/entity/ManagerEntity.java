package com.huyaaaaaa.classnote.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "manager", schema = "classtest", catalog = "")
public class ManagerEntity {
    private int managerId;
    private Integer managerTeaId;
    private Integer managerStuId;
    private Timestamp managerCreatetime;
    private Timestamp managerUpdatetime;

    @Id
    @Column(name = "manager_id")
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "manager_tea_id")
    public Integer getManagerTeaId() {
        return managerTeaId;
    }

    public void setManagerTeaId(Integer managerTeaId) {
        this.managerTeaId = managerTeaId;
    }

    @Basic
    @Column(name = "manager_stu_id")
    public Integer getManagerStuId() {
        return managerStuId;
    }

    public void setManagerStuId(Integer managerStuId) {
        this.managerStuId = managerStuId;
    }

    @Basic
    @Column(name = "manager_createtime")
    public Timestamp getManagerCreatetime() {
        return managerCreatetime;
    }

    public void setManagerCreatetime(Timestamp managerCreatetime) {
        this.managerCreatetime = managerCreatetime;
    }

    @Basic
    @Column(name = "manager_updatetime")
    public Timestamp getManagerUpdatetime() {
        return managerUpdatetime;
    }

    public void setManagerUpdatetime(Timestamp managerUpdatetime) {
        this.managerUpdatetime = managerUpdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagerEntity that = (ManagerEntity) o;
        return managerId == that.managerId &&
                Objects.equals(managerTeaId, that.managerTeaId) &&
                Objects.equals(managerStuId, that.managerStuId) &&
                Objects.equals(managerCreatetime, that.managerCreatetime) &&
                Objects.equals(managerUpdatetime, that.managerUpdatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managerId, managerTeaId, managerStuId, managerCreatetime, managerUpdatetime);
    }
}
