package com.gagechan.controller;

import com.gagechan.common.utils.R;
import com.gagechan.model.User;
import com.gagechan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月19日 11:49
 *
 * @description:
 **/
@Controller
public class IndexController {

	@Autowired
	private UserService userService;

	@RequestMapping("hello")
	@ResponseBody
	public R index(){

		List<User> users = userService.getAll();

		return R.ok().put("data",users);

	}
}
