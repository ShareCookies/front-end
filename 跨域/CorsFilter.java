package ...base.spring.filter;





import org.springframework.http.HttpHeaders;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/**
 * @autor
 * @date 2019-11-7
 * @description 使用Filter的方式解决跨域问题
 */

public class CorsFilter implements Filter {
    //private static final List<String> ALLOW_ORIGINS = Config.getListString("allowOrigins", ",");
    private static final String REQUEST_OPTIONS = "OPTIONS";
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 获取源站
        String origin  = request.getHeader(HttpHeaders.ORIGIN);
        //if (orgHeader != null && ALLOW_ORIGINS.contains(orgHeader)) {
            // 允许的跨域的域名
           response.addHeader("Access-Control-Allow-Origin", origin);
            // 允许携带 cookies 等认证信息
            response.addHeader("Access-Control-Allow-Credentials", "true");
            // 设置cookie
            //response.addHeader("Set-Cookie","authorization-token=111");
            //Cookie cookie = new Cookie("authorization-token2","222");
            //cookie.setDomain(origin);
            //response.addCookie(cookie);
            // 允许跨域的方法
            response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PATCH, PUT, HEAD");
            // 允许跨域请求携带的请求头
            response.addHeader("Access-Control-Allow-Headers", "Content-Type, Content-Length, auth-token, Accept, X-Requested-With`");
            // 返回结果可以用于缓存的最长时间，单位是秒。-1表示禁用
            response.addHeader("Access-Control-Max-Age", "36000");

            // 跨域预检请求，直接返回
            if (REQUEST_OPTIONS.equalsIgnoreCase(request.getMethod())) {
				response.setStatus(HttpStatus.OK.value());
                return;
            }
        //   }
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}