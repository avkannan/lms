package com.um.lms.web.portlet;

import com.um.lms.sb.model.book;
import com.um.lms.sb.service.bookLocalService;
import com.um.lms.sb.service.bookLocalServiceUtil;
import com.um.lms.web.constants.LmsWebPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

import aQute.bnd.annotation.component.Reference;

/**
 * @author vadiv
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LmsWebPortletKeys.LmsWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LmsBookPortlet extends MVCPortlet {
	
	
private Log log = LogFactoryUtil.getLog(this.getClass().getName());
    
 
    @ProcessAction(name = "addBook")
    public void addBook(ActionRequest actionRequest,ActionResponse actionResponse) {
        long bookId = CounterLocalServiceUtil.increment(book.class.getName());
        String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
        String firstName = ParamUtil.getString(actionRequest, "firstName");
        String lastName = ParamUtil.getString(actionRequest, "lastName");
        String contactNo = ParamUtil.getString(actionRequest, "contactNo");
        String city = ParamUtil.getString(actionRequest, "city");
    
        book book = bookLocalServiceUtil.createbook(CounterLocalServiceUtil.increment());
        book.setBookID(1);
        log.info("created");
        bookLocalServiceUtil.addbook(book);
    }
    @ProcessAction(name = "updateBook")
    public void updateBook(ActionRequest actionRequest,ActionResponse actionResponse) {
    	long bookId = CounterLocalServiceUtil.increment(book.class.getName());
    	String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
    	String firstName = ParamUtil.getString(actionRequest, "firstName");
    	String lastName = ParamUtil.getString(actionRequest, "lastName");
    	String contactNo = ParamUtil.getString(actionRequest, "contactNo");
    	String city = ParamUtil.getString(actionRequest, "city");
    	
    	book book = bookLocalServiceUtil.createbook(CounterLocalServiceUtil.increment());
    	book.setBookID(1);
    	log.info("created");
    	bookLocalServiceUtil.updatebook(book);
    }
    @ProcessAction(name ="deleteBook")
    public void deleteBook(ActionRequest actionRequest,ActionResponse actionResponse) {
    	long bookId = CounterLocalServiceUtil.increment(book.class.getName());
    	String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
    	String firstName = ParamUtil.getString(actionRequest, "firstName");
    	String lastName = ParamUtil.getString(actionRequest, "lastName");
    	String contactNo = ParamUtil.getString(actionRequest, "contactNo");
    	String city = ParamUtil.getString(actionRequest, "city");
    	
    	book book = bookLocalServiceUtil.createbook(CounterLocalServiceUtil.increment());
    	book.setBookID(1);
    	log.info("created");
    	bookLocalServiceUtil.deletebook(book);
    }
}
