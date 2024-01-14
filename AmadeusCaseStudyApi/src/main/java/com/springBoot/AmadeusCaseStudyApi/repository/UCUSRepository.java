package com.springBoot.AmadeusCaseStudyApi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.AmadeusCaseStudyApi.entity.UCUS;

@Repository
public interface UCUSRepository extends JpaRepository<UCUS, Integer> {

}
