package com.better.repository;/*
 *  25.08.2019
 *  com.better.repository
 *  DIP_example
 *  @author L
 */

import com.better.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
