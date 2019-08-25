package com.bad.repository;/*
 *  25.08.2019
 *  com.bad.repository
 *  DIP_example
 *  @author L
 */

import com.bad.entity.Indent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndentRepository extends JpaRepository<Indent, Long> {
}
