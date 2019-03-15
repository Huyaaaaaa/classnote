package com.huyaaaaaa.classnote.dao;

import com.huyaaaaaa.classnote.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface UserJPA extends JpaRepository<UserEntity,Long>, JpaSpecificationExecutor, Serializable {
}
