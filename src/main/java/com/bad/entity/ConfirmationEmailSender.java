package com.bad.entity;/*
 *  25.08.2019
 *  com.bad.entity
 *  DIP_example
 *  @author L
 */

public class ConfirmationEmailSender {

    public void sendConfirmationEmail(Indent indent) {
        String name = indent.getCustomerName();
        String email = indent.getCustomerEmail();

        // Шлем письмо клиенту
    }
}
