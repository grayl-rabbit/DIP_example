package com.bad.entity;/*
 *  25.08.2019
 *  com.bad.entity
 *  DIP_example
 *  @author L
 */

import com.bad.service.IndentServiceImpl;

public class IndentProcessor {
    public void process(com.bad.entity.Indent indent){

        IndentServiceImpl repository = new IndentServiceImpl();
        com.bad.entity.ConfirmationEmailSender mailSender = new com.bad.entity.ConfirmationEmailSender();

        if (indent.isValid() && repository.save(indent)) {
            mailSender.sendConfirmationEmail(indent);
        }
    }
}
