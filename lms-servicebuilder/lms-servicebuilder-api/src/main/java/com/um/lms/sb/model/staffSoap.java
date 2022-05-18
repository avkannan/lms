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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.um.lms.sb.service.http.staffServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class staffSoap implements Serializable {

	public static staffSoap toSoapModel(staff model) {
		staffSoap soapModel = new staffSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStaffID(model.getStaffID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setLastName(model.getLastName());
		soapModel.setDisplayName(model.getDisplayName());
		soapModel.setSalutation(model.getSalutation());
		soapModel.setDepartmentID(model.getDepartmentID());
		soapModel.setStaffType(model.getStaffType());
		soapModel.setDesignation(model.getDesignation());
		soapModel.setExpertise(model.getExpertise());
		soapModel.setQualifcation(model.getQualifcation());
		soapModel.setExperience(model.getExperience());

		return soapModel;
	}

	public static staffSoap[] toSoapModels(staff[] models) {
		staffSoap[] soapModels = new staffSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static staffSoap[][] toSoapModels(staff[][] models) {
		staffSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new staffSoap[models.length][models[0].length];
		}
		else {
			soapModels = new staffSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static staffSoap[] toSoapModels(List<staff> models) {
		List<staffSoap> soapModels = new ArrayList<staffSoap>(models.size());

		for (staff model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new staffSoap[soapModels.size()]);
	}

	public staffSoap() {
	}

	public long getPrimaryKey() {
		return _staffID;
	}

	public void setPrimaryKey(long pk) {
		setStaffID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStaffID() {
		return _staffID;
	}

	public void setStaffID(long staffID) {
		_staffID = staffID;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getDisplayName() {
		return _displayName;
	}

	public void setDisplayName(String displayName) {
		_displayName = displayName;
	}

	public String getSalutation() {
		return _salutation;
	}

	public void setSalutation(String salutation) {
		_salutation = salutation;
	}

	public String getDepartmentID() {
		return _departmentID;
	}

	public void setDepartmentID(String departmentID) {
		_departmentID = departmentID;
	}

	public String getStaffType() {
		return _staffType;
	}

	public void setStaffType(String staffType) {
		_staffType = staffType;
	}

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
	}

	public String getExpertise() {
		return _expertise;
	}

	public void setExpertise(String expertise) {
		_expertise = expertise;
	}

	public String getQualifcation() {
		return _qualifcation;
	}

	public void setQualifcation(String qualifcation) {
		_qualifcation = qualifcation;
	}

	public long getExperience() {
		return _experience;
	}

	public void setExperience(long experience) {
		_experience = experience;
	}

	private String _uuid;
	private long _staffID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private String _displayName;
	private String _salutation;
	private String _departmentID;
	private String _staffType;
	private String _designation;
	private String _expertise;
	private String _qualifcation;
	private long _experience;

}