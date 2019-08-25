package com.better.entity;/*
 *  25.08.2019
 *  com.bad.entity
 *  DIP_example
 *  @author L
 */

import com.bad.entity.Indent;

public class ConfirmationEmailSenderNew {

    public void sendConfirmationEmail(Indent indent) {
        String name = indent.getCustomerName();
        String email = indent.getCustomerEmail();

        // Шлем письмо клиенту
    }
}
