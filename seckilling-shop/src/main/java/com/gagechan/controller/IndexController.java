package com.gagechan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("hello")
	public String index(){
		return "hello";
	}
}
