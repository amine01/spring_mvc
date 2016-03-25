package com.essamine.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TimeInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception excep)
			throws Exception {
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelView)
			throws Exception {
		long startTime = (Long) request.getAttribute("startT");
		long endTime = System.currentTimeMillis();
		long handlingT = endTime - startTime;
		request.setAttribute("handlingTime", handlingT);
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		long startTime = System.currentTimeMillis();
		request.setAttribute("startT", startTime);
		return true;
	}
}
