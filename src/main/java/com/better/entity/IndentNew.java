package com.better.entity;/*
 *  24.08.2019
 *  bad
 *  DIPExample
 *  @author L
 */

import javax.persistence.*;

@Entity
public class IndentNew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private boolean isValid;
    private String customerName;
    private String customerEmail;

    public IndentNew() {
    }

    public IndentNew(String getCustomerName, String getCustomerEmail) {
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
        if(customerName !="" && customerEmail != ""){
            isValid = true;
        }else{
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
