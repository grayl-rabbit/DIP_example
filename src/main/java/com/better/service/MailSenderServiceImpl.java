package com.better.service;/*
 *  25.08.2019
 *  com.better.service
 *  DIP_example
 *  @author L
 */

import com.better.entity.IndentNew;
import org.springframework.stereotype.Service;

@Service
public class MailSenderServiceImpl implements MailSenderService{
    @Override
    public void sendConfirmationEmail(IndentNew indent) {
        String name = indent.getCustomerName();
        String email = indent.getCustomerEmail();

        // Шлем письмо клиенту
    }
}
