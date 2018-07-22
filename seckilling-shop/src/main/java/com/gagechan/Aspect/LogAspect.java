package com.gagechan.Aspect;

import com.gagechan.common.utils.IPUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月19日 12:48
 *
 * @description: 记录日志
 **/

@Slf4j
@Component
@Aspect
public class LogAspect {
	@Pointcut("execution(public * com.gagechan.controller.*Controller.*(..))")
	public void controller(){
	}

	@Before("controller()")
	public void controllerBefor(JoinPoint point){
		log.info("---------begin---------");
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = servletRequestAttributes.getRequest();

		log.info("URL:{}",request.getRequestURL());
		log.info("HTTP_METHOD:{}",request.getMethod());
		log.info("IP:{}",IPUtil.getIpAddr(request));
		log.info("CLASS_METHOD:{}.{}",point.getSignature().getDeclaringTypeName(),point.getSignature().getName());
		log.info("parameters:");
		Enumeration<String> enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			String paraName = enu.nextElement();
			log.info("{}:{}",paraName,request.getParameter(paraName));
		}
	}

	@After("controller()")
	public void controllerAfter(){
		log.info("---------end------------");
	}
}
