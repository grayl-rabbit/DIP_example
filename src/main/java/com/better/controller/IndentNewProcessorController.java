package com.better.controller;/*
 *  25.08.2019
 *  com.bad.entity
 *  DIP_example
 *  @author L
 */

import com.better.entity.IndentNew;
import com.better.service.IndentNewService;
import com.better.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/indent")
public class IndentNewProcessorController {
    @Autowired
    private MailSenderService mailSender;
    @Autowired
    private IndentNewService repository;

    @PostMapping
    public String process(@RequestParam String name, @RequestParam String mail) {

        IndentNew indent = new IndentNew();
        indent.setCustomerName(name);
        indent.setCustomerEmail(mail);

        if (indent.isValid() && repository.save(indent)) {
            mailSender.sendConfirmationEmail(indent);
            return "Ok";
        }else{
            return ":(";
        }
    }
}
