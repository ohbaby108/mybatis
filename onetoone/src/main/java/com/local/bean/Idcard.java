package com.local.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 静
 * @since 2020-12-05
 */
public class Idcard implements Serializable {

    private static final long serialVersionUID=1L;
    /**
     * 身份证号
     */
    @TableField("cardId")
    private String cardId;
    /**
     * 发证派出所地址
     */
    private String address;

    private Person  person;


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getPid() {
        return person;
    }

    public void setPid(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Idcard{" +
        "cardId=" + cardId +
        ", address=" + address +
        ", person=" + person +
        "}";
    }
}
