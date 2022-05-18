/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.um.lms.sb.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see student
 * @generated
 */
@ProviderType
public class studentWrapper
	extends BaseModelWrapper<student>
	implements student, ModelWrapper<student> {

	public studentWrapper(student student) {
		super(student);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("studentID", getStudentID());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("displayName", getDisplayName());
		attributes.put("salutation", getSalutation());
		attributes.put("departmentID", getDepartmentID());
		attributes.put("batch", getBatch());
		attributes.put("duration", getDuration());
		attributes.put("registrationNo", getRegistrationNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long studentID = (Long)attributes.get("studentID");

		if (studentID != null) {
			setStudentID(studentID);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String displayName = (String)attributes.get("displayName");

		if (displayName != null) {
			setDisplayName(displayName);
		}

		String salutation = (String)attributes.get("salutation");

		if (salutation != null) {
			setSalutation(salutation);
		}

		String departmentID = (String)attributes.get("departmentID");

		if (departmentID != null) {
			setDepartmentID(departmentID);
		}

		String batch = (String)attributes.get("batch");

		if (batch != null) {
			setBatch(batch);
		}

		Long duration = (Long)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Long registrationNo = (Long)attributes.get("registrationNo");

		if (registrationNo != null) {
			setRegistrationNo(registrationNo);
		}
	}

	/**
	 * Returns the batch of this student.
	 *
	 * @return the batch of this student
	 */
	@Override
	public String getBatch() {
		return model.getBatch();
	}

	/**
	 * Returns the company ID of this student.
	 *
	 * @return the company ID of this student
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this student.
	 *
	 * @return the create date of this student
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the department ID of this student.
	 *
	 * @return the department ID of this student
	 */
	@Override
	public String getDepartmentID() {
		return model.getDepartmentID();
	}

	/**
	 * Returns the display name of this student.
	 *
	 * @return the display name of this student
	 */
	@Override
	public String getDisplayName() {
		return model.getDisplayName();
	}

	/**
	 * Returns the duration of this student.
	 *
	 * @return the duration of this student
	 */
	@Override
	public long getDuration() {
		return model.getDuration();
	}

	/**
	 * Returns the first name of this student.
	 *
	 * @return the first name of this student
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this student.
	 *
	 * @return the group ID of this student
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last name of this student.
	 *
	 * @return the last name of this student
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the middle name of this student.
	 *
	 * @return the middle name of this student
	 */
	@Override
	public String getMiddleName() {
		return model.getMiddleName();
	}

	/**
	 * Returns the modified date of this student.
	 *
	 * @return the modified date of this student
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the registration no of this student.
	 *
	 * @return the registration no of this student
	 */
	@Override
	public long getRegistrationNo() {
		return model.getRegistrationNo();
	}

	/**
	 * Returns the salutation of this student.
	 *
	 * @return the salutation of this student
	 */
	@Override
	public String getSalutation() {
		return model.getSalutation();
	}

	/**
	 * Returns the student ID of this student.
	 *
	 * @return the student ID of this student
	 */
	@Override
	public long getStudentID() {
		return model.getStudentID();
	}

	/**
	 * Returns the user ID of this student.
	 *
	 * @return the user ID of this student
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this student.
	 *
	 * @return the user name of this student
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this student.
	 *
	 * @return the user uuid of this student
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this student.
	 *
	 * @return the uuid of this student
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the batch of this student.
	 *
	 * @param batch the batch of this student
	 */
	@Override
	public void setBatch(String batch) {
		model.setBatch(batch);
	}

	/**
	 * Sets the company ID of this student.
	 *
	 * @param companyId the company ID of this student
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this student.
	 *
	 * @param createDate the create date of this student
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the department ID of this student.
	 *
	 * @param departmentID the department ID of this student
	 */
	@Override
	public void setDepartmentID(String departmentID) {
		model.setDepartmentID(departmentID);
	}

	/**
	 * Sets the display name of this student.
	 *
	 * @param displayName the display name of this student
	 */
	@Override
	public void setDisplayName(String displayName) {
		model.setDisplayName(displayName);
	}

	/**
	 * Sets the duration of this student.
	 *
	 * @param duration the duration of this student
	 */
	@Override
	public void setDuration(long duration) {
		model.setDuration(duration);
	}

	/**
	 * Sets the first name of this student.
	 *
	 * @param firstName the first name of this student
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this student.
	 *
	 * @param groupId the group ID of this student
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this student.
	 *
	 * @param lastName the last name of this student
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the middle name of this student.
	 *
	 * @param middleName the middle name of this student
	 */
	@Override
	public void setMiddleName(String middleName) {
		model.setMiddleName(middleName);
	}

	/**
	 * Sets the modified date of this student.
	 *
	 * @param modifiedDate the modified date of this student
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the registration no of this student.
	 *
	 * @param registrationNo the registration no of this student
	 */
	@Override
	public void setRegistrationNo(long registrationNo) {
		model.setRegistrationNo(registrationNo);
	}

	/**
	 * Sets the salutation of this student.
	 *
	 * @param salutation the salutation of this student
	 */
	@Override
	public void setSalutation(String salutation) {
		model.setSalutation(salutation);
	}

	/**
	 * Sets the student ID of this student.
	 *
	 * @param studentID the student ID of this student
	 */
	@Override
	public void setStudentID(long studentID) {
		model.setStudentID(studentID);
	}

	/**
	 * Sets the user ID of this student.
	 *
	 * @param userId the user ID of this student
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this student.
	 *
	 * @param userName the user name of this student
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this student.
	 *
	 * @param userUuid the user uuid of this student
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this student.
	 *
	 * @param uuid the uuid of this student
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected studentWrapper wrap(student student) {
		return new studentWrapper(student);
	}

}