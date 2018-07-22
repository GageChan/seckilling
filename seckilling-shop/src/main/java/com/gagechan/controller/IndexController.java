package com.gagechan.controller;

import com.gagechan.common.utils.R;
import com.gagechan.model.User;
import com.gagechan.service.UserService;
import com.gagechan.vo.LoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
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
@Slf4j
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

	@GetMapping("login.htm")
	public String login(){
		return "modules/login";
	}
	@PostMapping("login.do")
	@ResponseBody
	public R doLogin(@RequestBody LoginVo loginVo){
		String token = userService.login(loginVo.getUsername(),loginVo.getPassword());
		return R.ok().put("token",token);
	}
}
