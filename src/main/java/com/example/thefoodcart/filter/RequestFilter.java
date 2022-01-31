/*
package com.example.thefoodcart.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(1)
public class RequestFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("Request URI - " + req.getRequestURI());
        System.out.println("Request Method - " + req.getMethod());
        System.out.println("Request Path - " + req.getPathInfo());

        chain.doFilter(request, response);
    }
}
*/
