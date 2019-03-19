package com.huyaaaaaa.classnote.dao;

import com.huyaaaaaa.classnote.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface AccountJPA extends JpaRepository<AccountEntity,Long>, JpaSpecificationExecutor, Serializable {
    List findByAccountAcc(String acc);
}
