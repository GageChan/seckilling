package com.gagechan.service.impl;

import com.gagechan.model.User;
import com.gagechan.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	@Autowired
	private UserService service;

	@Test
	public void create() {
		User user = new User();
		user.setName("GageChan");
		user.setPassword("1234");
		user.setSalt("1c2d3s");
		user.setLastLoginTime(new Date());
		int i = service.create(user);
		Assert.assertEquals(1,i);
	}

	@Test
	public void modify() {
		User user = service.get(4);
		user.setLastLoginTime(new Date());
		service.modify(user);
	}

	@Test
	public void remove() {
	}

	@Test
	public void getAll() {
	}

	@Test
	public void get() {
	}
}