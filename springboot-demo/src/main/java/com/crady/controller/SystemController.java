package com.crady.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;

/**
 * @author :Crady
 * date :2019/11/21 14:53
 * desc :
 **/
@RestController
@RequestMapping("sys")
public class SystemController {

    @RequestMapping("info")
    public String hello(HttpServletRequest request) throws UnknownHostException {

        String ip=request.getHeader("x-forwarded-for");
        if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)){
            ip=request.getHeader("Proxy-Client-IP");
        }
        if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)){
            ip=request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)){
            ip=request.getHeader("X-Real-IP");
        }
        if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)){
            ip=request.getRemoteAddr();
        }

        String ip1 = request.getRequestURI();
        String ip2 = request.getRequestURL().toString();
        StringBuffer sb = new StringBuffer("Hello World !\n");
        sb.append("服务器主机名：" + request.getLocalName() + "\n");
        sb.append("服务器主机IP：" + request.getLocalAddr() + "\n");
        sb.append("服务器主机端口：" + request.getLocalPort() + "\n");
        sb.append("URL:" + ip2 + "\n");
        sb.append("客户端IP:" + ip + "\n");
        return "<pre align=\"center\" style=\"font-size:20px\"> " + sb.toString() + "</pre>";
    }
}
