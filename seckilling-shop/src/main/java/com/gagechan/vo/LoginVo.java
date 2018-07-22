package com.gagechan.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月21日 17:10
 *
 * @description:
 **/
@Data
public class LoginVo implements Serializable {
	private String username;
	private String password;
}
