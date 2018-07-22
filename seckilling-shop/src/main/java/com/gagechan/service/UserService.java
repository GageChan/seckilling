package com.gagechan.service;

import com.baomidou.mybatisplus.service.IService;
import com.gagechan.model.User;

import java.util.List;

public interface UserService extends IService<User> {
	int create(User user);
	int modify(User user);
	int remove(long id);
	List<User> getAll();
	User get(long id);
	String login(String username,String password);
}
