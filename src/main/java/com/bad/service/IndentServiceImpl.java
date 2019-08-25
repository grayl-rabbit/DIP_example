package com.bad.service;/*
 *  25.08.2019
 *  com.bad.service
 *  DIP_example
 *  @author L
 */

import com.bad.entity.Indent;
import com.bad.repository.IndentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class IndentServiceImpl {
    @Autowired
    private IndentRepository repository;

    public boolean save(Indent indent) {
        // сохраняем заказ в базу данных
        repository.save(indent);
        return true;
    }
}
