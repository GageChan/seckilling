package com.gagechan.service.impl;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gagechan.common.exception.SCKException;
import com.gagechan.common.utils.MD5Util;
import com.gagechan.common.utils.TokenUtil;
import com.gagechan.dao.UserMapper;
import com.gagechan.model.User;
import com.gagechan.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月19日 14:38
 *
 * @description:
 **/

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {


	@Override
	public int create(User user) {
		return baseMapper.insert(user);
	}

	@Override
	public int modify(User user) {
		return baseMapper.updateById(user);
	}

	@Override
	public int remove(long id) {
		return baseMapper.deleteById(id);
	}

	@Override
	@Cacheable(value = "users",key = "123")
	public List<User> getAll() {

		log.info("通过数据库查询用户");

		return baseMapper.selectList(new Wrapper<User>() {
			@Override
			public String getSqlSegment() {
				return null;
			}
		});
	}

	@Override
	public User get(long id) {
		return baseMapper.selectById(id);
	}

	@Override
	public String login(String username, String password) {
		List<User> users =  baseMapper.selectList(Condition.create().eq("name",username));
		if (users.size() == 0)
			throw new SCKException("该用户不存在",1);
		User user = users.get(0);
		String dbPassword = user.getPassword();
		String inputPassword = MD5Util.second(password);
		if (dbPassword.equals(inputPassword)){
			// 登录成功
			return TokenUtil.generate();
		}else{
			throw new SCKException("用户名或密码错误",1);
		}
	}

}
