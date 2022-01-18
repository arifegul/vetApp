package com.vet.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vet.app.model.hayvanSahip;


@Repository
public interface hayvanSahipRepository extends JpaRepository<hayvanSahip, Long> {

}
