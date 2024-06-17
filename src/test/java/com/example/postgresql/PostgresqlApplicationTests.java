package com.example.postgresql;

import com.example.postgresql.database.UserDb;
import com.example.postgresql.model.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostgresqlApplicationTests {

	@Autowired
	private UserDb userDb;
	@Test
	void addUserTest() {
		Users user2 = new Users();
		user2.setUsername("test");
		user2.setEmail("test@gmail.com");
		user2.setPassword("test");
		user2.setRepassword("test");

		userDb.save(user2);
	}

}
