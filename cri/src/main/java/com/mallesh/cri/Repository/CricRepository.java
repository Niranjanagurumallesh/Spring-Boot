package com.mallesh.cri.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mallesh.cri.Entity.CricEntity;



public interface CricRepository extends JpaRepository<CricEntity, Integer> {

}
