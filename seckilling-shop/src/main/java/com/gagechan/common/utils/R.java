package com.gagechan.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月19日 16:55
 *
 * @description: 通用返回数据
 **/
public class R extends HashMap<String,Object> {
	public R() {
		put("code",0);
		put("msg","success");
	}

	public static R error(int code,String msg){
		R r = new R();
		r.put("code",code);
		r.put("msg",msg);
		return r;
	}
	public static R error(String msg){
		return error(500,msg);
	}
	public static R error(){
		return error(500,"未知错误，请联系工作人员");
	}

	public static R ok(Map<String,Object> map){
		R r = new R();
		r.putAll(map);
		return r;
	}
	public static R ok(String msg){
		R r = new R();
		r.put("msg",msg);
		return r;
	}
	public static R ok(){
		return new R();
	}

	@Override
	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
