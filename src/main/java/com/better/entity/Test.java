package com.better.entity;/*
 *  25.08.2019
 *  com.better.entity
 *  DIP_example
 *  @author L
 */

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;


@Entity(name = "Test")
@Table(name = "indent_new")
@DynamicUpdate
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private boolean isValid;
    private String customerName;
    private String customerEmail;

    public Test() {
    }

    public Test(String getCustomerName, String getCustomerEmail) {
        this.customerName = getCustomerName;
        this.customerEmail = getCustomerEmail;
    }

    public long getId() {
        return id;
    }

    public boolean isValid() {
        setValid();
        return isValid;
    }

    public void setValid() {
        if (!customerName.equals("") && !customerEmail.equals("")) {
            isValid = true;
        } else {
            isValid = false;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}


