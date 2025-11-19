package com.sbapp.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sbapp.learn.entity.HelloEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<HelloEntity, Long> {

}
