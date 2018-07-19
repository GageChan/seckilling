package com.gagechan.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gagechan.dao.UserMapper;
import com.gagechan.model.User;
import com.gagechan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月19日 14:38
 *
 * @description:
 **/

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
	public List<User> getAll() {
		return baseMapper.selectList(new Wrapper<User>() {
			@Override
			public String getSqlSegment() {
				return "select * from sck_user";
			}
		});
	}

	@Override
	public User get(long id) {
		return baseMapper.selectById(id);
	}
}
