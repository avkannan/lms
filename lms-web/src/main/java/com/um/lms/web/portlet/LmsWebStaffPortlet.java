package com.um.lms.web.portlet;

import com.um.lms.sb.model.staff;
import com.um.lms.sb.service.staffLocalService;
import com.um.lms.sb.service.staffLocalServiceUtil;
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
public class LmsWebStaffPortlet extends MVCPortlet {
	
	
private Log log = LogFactoryUtil.getLog(this.getClass().getName());
    
 
    @ProcessAction(name = "addStaff")
    public void addStaff(ActionRequest actionRequest,ActionResponse actionResponse) {
        long staffId = CounterLocalServiceUtil.increment(staff.class.getName());
        String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
        String firstName = ParamUtil.getString(actionRequest, "firstName");
        String lastName = ParamUtil.getString(actionRequest, "lastName");
        String contactNo = ParamUtil.getString(actionRequest, "contactNo");
        String city = ParamUtil.getString(actionRequest, "city");
    
        staff staff = staffLocalServiceUtil.createstaff(CounterLocalServiceUtil.increment());
        staff.setFirstName(firstName);
        staff.setLastName(lastName);
        log.info("created");
        staffLocalServiceUtil.addstaff(staff);
    }
    
    @ProcessAction(name = "updateStaff")
    public void updateStaff(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException {
        long staffId = CounterLocalServiceUtil.increment(staff.class.getName());
        String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
        String firstName = ParamUtil.getString(actionRequest, "firstName");
        String lastName = ParamUtil.getString(actionRequest, "lastName");
    
        staff staff = staffLocalServiceUtil.getstaff(1l);
        staff.setFirstName(firstName);
        staff.setLastName(lastName);
        log.info("update");
        log.info("update");
        log.info("update");
        staffLocalServiceUtil.updatestaff(staff);
    }
    

    @ProcessAction(name = "deleteStaff")
    public void deleteStaff(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException {
    	long staffId = CounterLocalServiceUtil.increment(staff.class.getName());
        log.info("delete");
    	staffLocalServiceUtil.deletestaff(staffId);
    }
    
    
}
