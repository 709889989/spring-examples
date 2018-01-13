package com.ming.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求过滤
 */
@Component
public class AccessFilter extends ZuulFilter{
    @Override
    public String filterType() {    //过滤器类型，过滤器在哪个生命周期执行
        return "pre";
    }

    @Override
    public int filterOrder() {      //执行顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {     //是否应该执行
        return true;
    }

    @Override
    public Object run() {       //过滤器具体逻辑
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        Object accessToken = request.getParameter("token");
        if(accessToken == null){
            ctx.setSendZuulResponse(false); //不对请求路由
            ctx.setResponseStatusCode(401);
        }

        return null;
    }
}
