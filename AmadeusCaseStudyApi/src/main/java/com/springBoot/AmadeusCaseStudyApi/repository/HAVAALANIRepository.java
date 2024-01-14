package com.springBoot.AmadeusCaseStudyApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.AmadeusCaseStudyApi.entity.HAVAALANI;

@Repository
public interface HAVAALANIRepository extends JpaRepository<HAVAALANI, Integer> {

}
