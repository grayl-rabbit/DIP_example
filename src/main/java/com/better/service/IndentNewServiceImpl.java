package com.better.service;/*
 *  25.08.2019
 *  com.better.service
 *  DIP_example
 *  @author L
 */

import com.better.entity.IndentNew;
import com.better.repository.IndentNewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndentNewServiceImpl implements IndentNewService {
    @Autowired
    private IndentNewRepository repository;

    public boolean save(IndentNew indent) {
        // сохраняем заказ в базу данных
        repository.save(indent);
        return true;
    }
}
