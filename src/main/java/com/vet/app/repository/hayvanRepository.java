package com.vet.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vet.app.model.hayvan;

@Repository
public interface hayvanRepository extends JpaRepository<hayvan, Long> {

}
