 package com.bigrabbit.qinghua_school.controller;

 import com.bigrabbit.qinghua_school.vo.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;
import java.util.Iterator;
@ControllerAdvice
@ResponseBody
//@RestControllerAdvice相当于@ControllerAdvice和@ResponseBody连用
public class CommonException {
	//springmvc中异常处理的方法
	//springmvc内部在进行一些逻辑处理时，可能会报一些异常，这种异常，我们无法按照
	//原来的方式，直接try catch捕获，所以就需要这样的异常处理方法
	@ExceptionHandler(ConstraintViolationException.class)
	public R constraintViolation(ConstraintViolationException ex) {
		//获取异常中的信息
		Iterator<javax.validation.ConstraintViolation<?>> iterator = ex.getConstraintViolations().iterator();
		String errorInfo = "";
		while (iterator.hasNext()) {
			 javax.validation.ConstraintViolation<?> next = iterator.next();
			 //打印具体的异常信息
			 System.out.println(next.getMessage());
			 errorInfo += next.getMessage() + ",";
		}
		return R.setERROR(errorInfo);
	}
	
	@ExceptionHandler(Exception.class)
	public R commonException(Exception e) {
		e.printStackTrace();
		return R.setERROR(e.getMessage());
	}
}
