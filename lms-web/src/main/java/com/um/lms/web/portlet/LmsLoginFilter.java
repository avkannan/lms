package com.um.lms.web.portlet;

import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.search.filter.FilterVisitor;
import com.liferay.portal.kernel.util.WebKeys;
import com.um.lms.web.constants.LmsWebPortletKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author vadiv
 */
public class LmsLoginFilter implements Filter {
 
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Called ServletFilter.init(" + filterConfig + ") where hello="
                + filterConfig.getInitParameter("hello"));
 
    }
 
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, 
            FilterChain filterChain)throws IOException, ServletException {
 
        String uri = (String) servletRequest.getAttribute(WebKeys.INVOKER_FILTER_URI);
 
        System.out.println("Called ServletFilter.doFilter(" + servletRequest + ", " 
                + servletResponse + ", "+ filterChain + ") for URI " + uri);
 
 
    }
 
    public void destroy() {
    }

	@Override
	public <T> T accept(FilterVisitor<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExecutionOption() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSortOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Boolean isCached() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCached(Boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setExecutionOption(String arg0) {
		// TODO Auto-generated method stub
		
	}
 
}