/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rag.EggNews.repositories;

import com.rag.EggNews.entities.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Long>{
    
    @Query("SELECT u FROM SystemUser u WHERE u.email = :email")
    public SystemUser searchByEmail(@Param("email") String email);
}
