package com.gagechan.common.utils;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月21日 17:27
 *
 * @description:
 **/
public class TokenUtil {

	private static final String SECURITY = "1a2b3c4d";

	public static String generate(){
		return JasyptUtil.encyptPwd(SECURITY,String.valueOf(System.nanoTime()));
	}

}
