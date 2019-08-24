package com.springcloud.demo.business.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zyz
 * <p>
 * 自定义请求过滤器
 */
@Component
@Slf4j
public class DemoZuul extends ZuulFilter {

    /**
     * 过滤器类型
     * <p>
     * 定义filter的类型，有pre、route、post、error四种
     */
    @Override
    public String filterType() {
        return null;
    }

    /**
     * 定义filter的顺序，数字越小表示顺序越高，越先执行
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 表示是否需要执行该filter，true表示执行，false表示不执行
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }


    /**
     * filter需要执行的具体操作 ,拦截请求，检查请求参数是否带有token
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info("--->>> TokenFilter {},{}", request.getMethod(), request.getRequestURL().toString());
        // 获取请求的参数
        String token = request.getParameter("token");

        //对请求进行路由
        if (StringUtils.isNotBlank(token)) {
            ctx.setSendZuulResponse(true);
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        } else {
            //不对其进行路由
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(400);
            ctx.setResponseBody("token is empty");
            ctx.set("isSuccess", false);
            return null;
        }
    }
}
