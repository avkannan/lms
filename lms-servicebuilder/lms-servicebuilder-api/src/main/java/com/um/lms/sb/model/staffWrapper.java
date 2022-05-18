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
 * This class is a wrapper for {@link staff}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see staff
 * @generated
 */
@ProviderType
public class staffWrapper
	extends BaseModelWrapper<staff> implements staff, ModelWrapper<staff> {

	public staffWrapper(staff staff) {
		super(staff);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("staffID", getStaffID());
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
		attributes.put("staffType", getStaffType());
		attributes.put("designation", getDesignation());
		attributes.put("expertise", getExpertise());
		attributes.put("qualifcation", getQualifcation());
		attributes.put("experience", getExperience());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long staffID = (Long)attributes.get("staffID");

		if (staffID != null) {
			setStaffID(staffID);
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

		String staffType = (String)attributes.get("staffType");

		if (staffType != null) {
			setStaffType(staffType);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}

		String expertise = (String)attributes.get("expertise");

		if (expertise != null) {
			setExpertise(expertise);
		}

		String qualifcation = (String)attributes.get("qualifcation");

		if (qualifcation != null) {
			setQualifcation(qualifcation);
		}

		Long experience = (Long)attributes.get("experience");

		if (experience != null) {
			setExperience(experience);
		}
	}

	/**
	 * Returns the company ID of this staff.
	 *
	 * @return the company ID of this staff
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this staff.
	 *
	 * @return the create date of this staff
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the department ID of this staff.
	 *
	 * @return the department ID of this staff
	 */
	@Override
	public String getDepartmentID() {
		return model.getDepartmentID();
	}

	/**
	 * Returns the designation of this staff.
	 *
	 * @return the designation of this staff
	 */
	@Override
	public String getDesignation() {
		return model.getDesignation();
	}

	/**
	 * Returns the display name of this staff.
	 *
	 * @return the display name of this staff
	 */
	@Override
	public String getDisplayName() {
		return model.getDisplayName();
	}

	/**
	 * Returns the experience of this staff.
	 *
	 * @return the experience of this staff
	 */
	@Override
	public long getExperience() {
		return model.getExperience();
	}

	/**
	 * Returns the expertise of this staff.
	 *
	 * @return the expertise of this staff
	 */
	@Override
	public String getExpertise() {
		return model.getExpertise();
	}

	/**
	 * Returns the first name of this staff.
	 *
	 * @return the first name of this staff
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this staff.
	 *
	 * @return the group ID of this staff
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last name of this staff.
	 *
	 * @return the last name of this staff
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the middle name of this staff.
	 *
	 * @return the middle name of this staff
	 */
	@Override
	public String getMiddleName() {
		return model.getMiddleName();
	}

	/**
	 * Returns the modified date of this staff.
	 *
	 * @return the modified date of this staff
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this staff.
	 *
	 * @return the primary key of this staff
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualifcation of this staff.
	 *
	 * @return the qualifcation of this staff
	 */
	@Override
	public String getQualifcation() {
		return model.getQualifcation();
	}

	/**
	 * Returns the salutation of this staff.
	 *
	 * @return the salutation of this staff
	 */
	@Override
	public String getSalutation() {
		return model.getSalutation();
	}

	/**
	 * Returns the staff ID of this staff.
	 *
	 * @return the staff ID of this staff
	 */
	@Override
	public long getStaffID() {
		return model.getStaffID();
	}

	/**
	 * Returns the staff type of this staff.
	 *
	 * @return the staff type of this staff
	 */
	@Override
	public String getStaffType() {
		return model.getStaffType();
	}

	/**
	 * Returns the user ID of this staff.
	 *
	 * @return the user ID of this staff
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this staff.
	 *
	 * @return the user name of this staff
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this staff.
	 *
	 * @return the user uuid of this staff
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this staff.
	 *
	 * @return the uuid of this staff
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
	 * Sets the company ID of this staff.
	 *
	 * @param companyId the company ID of this staff
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this staff.
	 *
	 * @param createDate the create date of this staff
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the department ID of this staff.
	 *
	 * @param departmentID the department ID of this staff
	 */
	@Override
	public void setDepartmentID(String departmentID) {
		model.setDepartmentID(departmentID);
	}

	/**
	 * Sets the designation of this staff.
	 *
	 * @param designation the designation of this staff
	 */
	@Override
	public void setDesignation(String designation) {
		model.setDesignation(designation);
	}

	/**
	 * Sets the display name of this staff.
	 *
	 * @param displayName the display name of this staff
	 */
	@Override
	public void setDisplayName(String displayName) {
		model.setDisplayName(displayName);
	}

	/**
	 * Sets the experience of this staff.
	 *
	 * @param experience the experience of this staff
	 */
	@Override
	public void setExperience(long experience) {
		model.setExperience(experience);
	}

	/**
	 * Sets the expertise of this staff.
	 *
	 * @param expertise the expertise of this staff
	 */
	@Override
	public void setExpertise(String expertise) {
		model.setExpertise(expertise);
	}

	/**
	 * Sets the first name of this staff.
	 *
	 * @param firstName the first name of this staff
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this staff.
	 *
	 * @param groupId the group ID of this staff
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this staff.
	 *
	 * @param lastName the last name of this staff
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the middle name of this staff.
	 *
	 * @param middleName the middle name of this staff
	 */
	@Override
	public void setMiddleName(String middleName) {
		model.setMiddleName(middleName);
	}

	/**
	 * Sets the modified date of this staff.
	 *
	 * @param modifiedDate the modified date of this staff
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this staff.
	 *
	 * @param primaryKey the primary key of this staff
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualifcation of this staff.
	 *
	 * @param qualifcation the qualifcation of this staff
	 */
	@Override
	public void setQualifcation(String qualifcation) {
		model.setQualifcation(qualifcation);
	}

	/**
	 * Sets the salutation of this staff.
	 *
	 * @param salutation the salutation of this staff
	 */
	@Override
	public void setSalutation(String salutation) {
		model.setSalutation(salutation);
	}

	/**
	 * Sets the staff ID of this staff.
	 *
	 * @param staffID the staff ID of this staff
	 */
	@Override
	public void setStaffID(long staffID) {
		model.setStaffID(staffID);
	}

	/**
	 * Sets the staff type of this staff.
	 *
	 * @param staffType the staff type of this staff
	 */
	@Override
	public void setStaffType(String staffType) {
		model.setStaffType(staffType);
	}

	/**
	 * Sets the user ID of this staff.
	 *
	 * @param userId the user ID of this staff
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this staff.
	 *
	 * @param userName the user name of this staff
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this staff.
	 *
	 * @param userUuid the user uuid of this staff
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this staff.
	 *
	 * @param uuid the uuid of this staff
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
	protected staffWrapper wrap(staff staff) {
		return new staffWrapper(staff);
	}

}