package com.springboot.chapter314.exception;

import com.springboot.chapter314.domain.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public ModelAndView defaultHandleError(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e);
        modelAndView.addObject("url", req.getRequestURI());
        modelAndView.setViewName("error");
        return modelAndView;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        ErrorInfo<String> result = new ErrorInfo<>();
        result.setCode(ErrorInfo.ERROR);
        result.setData("error");
        result.setMessage("出错了");
        result.setUrl("http://localhost:8080");
        return result;
    }
}
