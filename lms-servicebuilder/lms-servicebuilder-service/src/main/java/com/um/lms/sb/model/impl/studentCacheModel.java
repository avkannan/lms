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

package com.um.lms.sb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.um.lms.sb.model.student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class studentCacheModel implements CacheModel<student>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof studentCacheModel)) {
			return false;
		}

		studentCacheModel studentCacheModel = (studentCacheModel)obj;

		if (studentID == studentCacheModel.studentID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, studentID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", studentID=");
		sb.append(studentID);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", displayName=");
		sb.append(displayName);
		sb.append(", salutation=");
		sb.append(salutation);
		sb.append(", departmentID=");
		sb.append(departmentID);
		sb.append(", batch=");
		sb.append(batch);
		sb.append(", duration=");
		sb.append(duration);
		sb.append(", registrationNo=");
		sb.append(registrationNo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public student toEntityModel() {
		studentImpl studentImpl = new studentImpl();

		if (uuid == null) {
			studentImpl.setUuid("");
		}
		else {
			studentImpl.setUuid(uuid);
		}

		studentImpl.setStudentID(studentID);
		studentImpl.setGroupId(groupId);
		studentImpl.setCompanyId(companyId);
		studentImpl.setUserId(userId);

		if (userName == null) {
			studentImpl.setUserName("");
		}
		else {
			studentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			studentImpl.setCreateDate(null);
		}
		else {
			studentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			studentImpl.setModifiedDate(null);
		}
		else {
			studentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			studentImpl.setFirstName("");
		}
		else {
			studentImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			studentImpl.setMiddleName("");
		}
		else {
			studentImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			studentImpl.setLastName("");
		}
		else {
			studentImpl.setLastName(lastName);
		}

		if (displayName == null) {
			studentImpl.setDisplayName("");
		}
		else {
			studentImpl.setDisplayName(displayName);
		}

		if (salutation == null) {
			studentImpl.setSalutation("");
		}
		else {
			studentImpl.setSalutation(salutation);
		}

		if (departmentID == null) {
			studentImpl.setDepartmentID("");
		}
		else {
			studentImpl.setDepartmentID(departmentID);
		}

		if (batch == null) {
			studentImpl.setBatch("");
		}
		else {
			studentImpl.setBatch(batch);
		}

		studentImpl.setDuration(duration);
		studentImpl.setRegistrationNo(registrationNo);

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		studentID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		displayName = objectInput.readUTF();
		salutation = objectInput.readUTF();
		departmentID = objectInput.readUTF();
		batch = objectInput.readUTF();

		duration = objectInput.readLong();

		registrationNo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(studentID);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (middleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (displayName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(displayName);
		}

		if (salutation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(salutation);
		}

		if (departmentID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(departmentID);
		}

		if (batch == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(batch);
		}

		objectOutput.writeLong(duration);

		objectOutput.writeLong(registrationNo);
	}

	public String uuid;
	public long studentID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String middleName;
	public String lastName;
	public String displayName;
	public String salutation;
	public String departmentID;
	public String batch;
	public long duration;
	public long registrationNo;

}