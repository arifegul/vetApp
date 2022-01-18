package com.vet.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vet.app.model.Login;

@Repository
public interface loginRepository extends JpaRepository<Login,Long> {

	Optional<Login> findByEmail(String email);
	
	Optional<Login> findBySifre(String sifre);


}
