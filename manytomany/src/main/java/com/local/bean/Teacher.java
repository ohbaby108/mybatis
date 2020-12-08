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
 * @since 2020-12-08
 */
public class Teacher implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "tid", type = IdType.AUTO)
    private Integer tid;

    private String tname;

    private String tsex;

    private Integer tage;
    private List<Student> studentList;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    @Override
    public String toString() {
        return "Teacher{" +
        "tid=" + tid +
        ", tname=" + tname +
        ", tsex=" + tsex +
        ", tage=" + tage +
        ", studentList"+studentList+
        "}";
    }
}
