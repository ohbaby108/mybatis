package com.local.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 静
 * @since 2020-12-07
 */
public class Emp implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "empno", type = IdType.AUTO)
    private Integer empno;

    private String ename;

    private String job;

    private Integer mgr;

    private LocalDateTime hiredate;

    private Float sal;

    private Float comn;

    private Dept dept;


    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public LocalDateTime getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDateTime hiredate) {
        this.hiredate = hiredate;
    }

    public Float getSal() {
        return sal;
    }

    public void setSal(Float sal) {
        this.sal = sal;
    }

    public Float getComn() {
        return comn;
    }

    public void setComn(Float comn) {
        this.comn = comn;
    }

    public Dept getDeptno() {
        return dept;
    }

    public void setDeptno(Dept deptno) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
        "empno=" + empno +
        ", ename=" + ename +
        ", job=" + job +
        ", mgr=" + mgr +
        ", hiredate=" + hiredate +
        ", sal=" + sal +
        ", comn=" + comn +
        ", Dept=" + dept +
        "}";
    }
}
