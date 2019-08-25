package com.better.service;/*
 *  25.08.2019
 *  com.better.service
 *  DIP_example
 *  @author L
 */

import com.better.entity.Test;
import com.better.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSetviceImpl implements TestService {

    @Autowired
    TestRepository testRepository;


    @Override
    public void add(Test test) {
        testRepository.save(test);
    }
}
