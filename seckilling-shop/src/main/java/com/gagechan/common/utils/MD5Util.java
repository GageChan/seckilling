package com.gagechan.common.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月21日 14:32
 *
 * @description:
 **/
public class MD5Util {

	private static final String salt = "3a4c8l";

	/**
	 * MD5加密
	 * @param str
	 * @return
	 */
	private static String md5(String str){
		return DigestUtils.md5Hex(str);
	}

	/**
	 * 第一次MD5加密，用于网络层传输
	 * @param password
	 * @return
	 */
	public static String first(String password){
		//将表单密码转成临时串
		String str = ""+salt.charAt(3) + salt.charAt(2) + password + salt.charAt(0)+salt.charAt(1);
		return md5(str);
	}

	/**
	 * 第二次MD5加密，用于储存到数据库
	 * @param password
	 * @return
	 */
	public static String second(String password){
		String str = ""+salt.charAt(3) + salt.charAt(2) + password + salt.charAt(0)+salt.charAt(1);
		return md5(str);
	}

	/**
	 * 合并，把表单密码转成数据库储存密码
	 * @param password
	 * @return
	 */
	public static String inPassToDbPass(String password){
		String tmpPassword = first(password);
		return second(tmpPassword);
	}

	public static void main(String[] args) {
		System.out.println(md5("c41234563a"));
		System.out.println(first("57a9656cbbc3fea4e326d53a65a2d082"));
		System.out.println(inPassToDbPass("123456"));
	}
}
