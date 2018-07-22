package com.gagechan.common.exception;

import com.gagechan.common.utils.R;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月21日 17:48
 *
 * @description: 全局异常处理
 **/

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(SCKException.class)
	@ResponseStatus(HttpStatus.OK)
	public R handleSckExceptioin(SCKException ex){
		return R.error(ex.getCode(),ex.getMsg());
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.OK)
	public R handleExceptioin(Exception ex){
		return R.error(ex.getMessage());
	}
}
