package com.wildcodeschool.wildandwizard.repository;

// TODO : update this interface

import com.wildcodeschool.wildandwizard.entity.School;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
