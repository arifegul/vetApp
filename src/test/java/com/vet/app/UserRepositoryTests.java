package com.vet.app;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.vet.app.model.Login;
import com.vet.app.repository.loginRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	@Autowired
	private loginRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		Login user = new Login();
		user.setKullaniciAd("Arife Gül");
		user.setEmail("arifegulyalcinn@gmail.com");
		user.setSifre("arife123");
		
		Login kaydedilenkullanici = repo.save(user);
		
		Login kullanicibul = entityManager.find(Login.class, kaydedilenkullanici.getId());
		
		assertThat(kullanicibul.getEmail()).isEqualTo(user.getEmail());
	}
	
	@Test
	
	public void testfindByEmail() {
		
		String email = "arifegulyalcinn@gmail.com";
		Optional<Login> user = repo.findByEmail(email);
		
		assertThat(user).isNotNull();
		
	}
}
