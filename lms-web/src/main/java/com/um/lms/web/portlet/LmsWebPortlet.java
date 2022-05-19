package com.um.lms.web.portlet;

import com.um.lms.sb.model.student;
import com.um.lms.sb.service.studentLocalService;
import com.um.lms.sb.service.studentLocalServiceUtil;
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
public class LmsWebPortlet extends MVCPortlet {
	
	
private Log log = LogFactoryUtil.getLog(this.getClass().getName());
    
 
    @ProcessAction(name = "addStudent")
    public void addStudent(ActionRequest actionRequest,ActionResponse actionResponse) {
        long studentId = CounterLocalServiceUtil.increment(student.class.getName());
        String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
        String firstName = ParamUtil.getString(actionRequest, "firstName");
        String lastName = ParamUtil.getString(actionRequest, "lastName");
        String contactNo = ParamUtil.getString(actionRequest, "contactNo");
        String city = ParamUtil.getString(actionRequest, "city");
    
        student student = studentLocalServiceUtil.createstudent(CounterLocalServiceUtil.increment());
        student.setFirstName(firstName);
        student.setLastName(lastName);
        log.info("created");
        studentLocalServiceUtil.addstudent(student);
    }
    
    @ProcessAction(name = "updateStudent")
    public void updateStudent(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException {
        long studentId = CounterLocalServiceUtil.increment(student.class.getName());
        String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
        String firstName = ParamUtil.getString(actionRequest, "firstName");
        String lastName = ParamUtil.getString(actionRequest, "lastName");
        String contactNo = ParamUtil.getString(actionRequest, "contactNo");
        String city = ParamUtil.getString(actionRequest, "city");
        log.info("before");
        student student = studentLocalServiceUtil.getstudent(1l);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        log.info("update");
        System.out.println(student.toString());
        studentLocalServiceUtil.updatestudent(student);
        log.info("before");

    }
    @ProcessAction(name = "deleteStudent")
    public void deleteSw33tudent(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException {
    	  long studentId = CounterLocalServiceUtil.increment(student.class.getName());
          String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
          String firstName = ParamUtil.getString(actionRequest, "firstName");
          String lastName = ParamUtil.getString(actionRequest, "lastName");
          String contactNo = ParamUtil.getString(actionRequest, "contactNo");
          String city = ParamUtil.getString(actionRequest, "city");
          log.info("before");
          student student = studentLocalServiceUtil.getstudent(1l);
          student.setFirstName(firstName);
          student.setLastName(lastName);
          log.info("update");
          System.out.println(student.toString());
          
    	studentLocalServiceUtil.deletestudent(studentId);
    }
    @ProcessAction(name = "deleteStudent")
    public void delete4Student(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException {
    	  long studentId = CounterLocalServiceUtil.increment(student.class.getName());
          String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
          String firstName = ParamUtil.getString(actionRequest, "firstName");
          String lastName = ParamUtil.getString(actionRequest, "lastName");
          String contactNo = ParamUtil.getString(actionRequest, "contactNo");
          String city = ParamUtil.getString(actionRequest, "city");
          log.info("before");
          student student = studentLocalServiceUtil.getstudent(1l);
          student.setFirstName(firstName);
          student.setLastName(lastName);
          log.info("update");
          System.out.println(student.toString());
          
    	studentLocalServiceUtil.deletestudent(studentId);
    }
    @ProcessAction(name = "deleteStudent")
    public void deleteS3tudent(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException {
    	  long studentId = CounterLocalServiceUtil.increment(student.class.getName());
          String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
          String firstName = ParamUtil.getString(actionRequest, "firstName");
          String lastName = ParamUtil.getString(actionRequest, "lastName");
          String contactNo = ParamUtil.getString(actionRequest, "contactNo");
          String city = ParamUtil.getString(actionRequest, "city");
          log.info("before");
          student student = studentLocalServiceUtil.getstudent(1l);
          student.setFirstName(firstName);
          student.setLastName(lastName);
          log.info("update");
          System.out.println(student.toString());
          
    	studentLocalServiceUtil.deletestudent(studentId);
    }
    @ProcessAction(name = "deleteStudent")
    public void deleteStudent(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException {
    	  long studentId = CounterLocalServiceUtil.increment(student.class.getName());
          String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
          String firstName = ParamUtil.getString(actionRequest, "firstName");
          String lastName = ParamUtil.getString(actionRequest, "lastName");
          String contactNo = ParamUtil.getString(actionRequest, "contactNo");
          String city = ParamUtil.getString(actionRequest, "city");
          log.info("before");
          student student = studentLocalServiceUtil.getstudent(1l);
          student.setFirstName(firstName);
          student.setLastName(lastName);
          log.info("update");
          System.out.println(student.toString());
          
    	studentLocalServiceUtil.deletestudent(studentId);
    }
    @ProcessAction(name = "deleteStudent")
    public void delete2Student(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException {
    	  long studentId = CounterLocalServiceUtil.increment(student.class.getName());
          String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
          String firstName = ParamUtil.getString(actionRequest, "firstName");
          String lastName = ParamUtil.getString(actionRequest, "lastName");
          String contactNo = ParamUtil.getString(actionRequest, "contactNo");
          String city = ParamUtil.getString(actionRequest, "city");
          log.info("before");
          student student = studentLocalServiceUtil.getstudent(1l);
          student.setFirstName(firstName);
          student.setLastName(lastName);
          log.info("update");
          System.out.println(student.toString());
          
    	studentLocalServiceUtil.deletestudent(studentId);
    }
    @ProcessAction(name = "deleteStudent")
    public void delete1Student(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException {
    	  long studentId = CounterLocalServiceUtil.increment(student.class.getName());
          String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
          String firstName = ParamUtil.getString(actionRequest, "firstName");
          String lastName = ParamUtil.getString(actionRequest, "lastName");
          String contactNo = ParamUtil.getString(actionRequest, "contactNo");
          String city = ParamUtil.getString(actionRequest, "city");
          log.info("before");
          student student = studentLocalServiceUtil.getstudent(1l);
          student.setFirstName(firstName);
          student.setLastName(lastName);
          log.info("update");
          System.out.println(student.toString());
          
    	studentLocalServiceUtil.deletestudent(studentId);
    }
    
    
    void test() throws PortalException
    {
    	  long studentId = CounterLocalServiceUtil.increment(student.class.getName());
          log.info("before");
          student student = studentLocalServiceUtil.getstudent(1l);
          student.setFirstName("");
          student.setLastName("");
          log.info("update");
          System.out.println(student.toString());
    }
    
    
    
}
