package com.local.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author 静
 * @since 2020-12-07
 */
public class Dept implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "deptno", type = IdType.AUTO)
    private Integer deptno;

    private String dname;

    private String loc;
    //一个部门下有多个员工
    private List<Emp> empList;

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", empList=" + empList +
                '}';
    }

    public List<Emp> getEmp() {
        return this.empList;
    }

    public void setEmp(List<Emp> empList) {
        this.empList = empList;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

}
