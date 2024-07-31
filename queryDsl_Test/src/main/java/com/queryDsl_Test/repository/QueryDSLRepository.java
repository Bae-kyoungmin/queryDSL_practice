package com.queryDsl_Test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpaQueryMethodFactory;
import org.springframework.stereotype.Repository;

import com.queryDsl_Test.entity.Hello;

@Repository
public interface QueryDSLRepository extends JpaRepository<Long, Hello>, JpaQueryMethodFactory {

}
