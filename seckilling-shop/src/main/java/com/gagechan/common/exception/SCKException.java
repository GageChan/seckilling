package com.gagechan.common.exception;

import lombok.Data;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月19日 17:11
 *
 * @description: 系统自定义异常
 **/
@Data
public class SCKException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	private String msg;
	private int code = 500;

	public SCKException(String msg){
		super(msg);
		this.msg = msg;
	}

	public SCKException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}

	public SCKException(Throwable cause, String msg) {
		super(msg,cause);
		this.msg = msg;
	}

	public SCKException(String msg, int code, Throwable e) {
		super(msg,e);
		this.msg = msg;
		this.code = code;
	}

}
