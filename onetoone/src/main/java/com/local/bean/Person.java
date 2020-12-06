package com.local.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 静
 * @since 2020-12-05
 */
public class Person implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 人的编号
     */
      @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    /**
     * 姓名
     */
    private String pname;
    private Idcard idcard;

    public Idcard getIdcard(){
        return this.idcard;
    }

    public void setIdcard(Idcard idcard){
        this.idcard=idcard;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Person{" +
        "pid=" + pid +
        ", pname=" + pname +
         ",Idcard="+idcard+
        "}";
    }
}
