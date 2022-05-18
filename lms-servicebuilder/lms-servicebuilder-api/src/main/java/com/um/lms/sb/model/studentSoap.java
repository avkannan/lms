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
 * This class is used by SOAP remote services, specifically {@link com.um.lms.sb.service.http.studentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class studentSoap implements Serializable {

	public static studentSoap toSoapModel(student model) {
		studentSoap soapModel = new studentSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStudentID(model.getStudentID());
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
		soapModel.setBatch(model.getBatch());
		soapModel.setDuration(model.getDuration());
		soapModel.setRegistrationNo(model.getRegistrationNo());

		return soapModel;
	}

	public static studentSoap[] toSoapModels(student[] models) {
		studentSoap[] soapModels = new studentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static studentSoap[][] toSoapModels(student[][] models) {
		studentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new studentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new studentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static studentSoap[] toSoapModels(List<student> models) {
		List<studentSoap> soapModels = new ArrayList<studentSoap>(
			models.size());

		for (student model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new studentSoap[soapModels.size()]);
	}

	public studentSoap() {
	}

	public long getPrimaryKey() {
		return _studentID;
	}

	public void setPrimaryKey(long pk) {
		setStudentID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStudentID() {
		return _studentID;
	}

	public void setStudentID(long studentID) {
		_studentID = studentID;
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

	public String getBatch() {
		return _batch;
	}

	public void setBatch(String batch) {
		_batch = batch;
	}

	public long getDuration() {
		return _duration;
	}

	public void setDuration(long duration) {
		_duration = duration;
	}

	public long getRegistrationNo() {
		return _registrationNo;
	}

	public void setRegistrationNo(long registrationNo) {
		_registrationNo = registrationNo;
	}

	private String _uuid;
	private long _studentID;
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
	private String _batch;
	private long _duration;
	private long _registrationNo;

}