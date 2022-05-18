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

import com.um.lms.sb.model.staff;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing staff in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class staffCacheModel implements CacheModel<staff>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof staffCacheModel)) {
			return false;
		}

		staffCacheModel staffCacheModel = (staffCacheModel)obj;

		if (staffID == staffCacheModel.staffID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, staffID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", staffID=");
		sb.append(staffID);
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
		sb.append(", staffType=");
		sb.append(staffType);
		sb.append(", designation=");
		sb.append(designation);
		sb.append(", expertise=");
		sb.append(expertise);
		sb.append(", qualifcation=");
		sb.append(qualifcation);
		sb.append(", experience=");
		sb.append(experience);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public staff toEntityModel() {
		staffImpl staffImpl = new staffImpl();

		if (uuid == null) {
			staffImpl.setUuid("");
		}
		else {
			staffImpl.setUuid(uuid);
		}

		staffImpl.setStaffID(staffID);
		staffImpl.setGroupId(groupId);
		staffImpl.setCompanyId(companyId);
		staffImpl.setUserId(userId);

		if (userName == null) {
			staffImpl.setUserName("");
		}
		else {
			staffImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			staffImpl.setCreateDate(null);
		}
		else {
			staffImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			staffImpl.setModifiedDate(null);
		}
		else {
			staffImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			staffImpl.setFirstName("");
		}
		else {
			staffImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			staffImpl.setMiddleName("");
		}
		else {
			staffImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			staffImpl.setLastName("");
		}
		else {
			staffImpl.setLastName(lastName);
		}

		if (displayName == null) {
			staffImpl.setDisplayName("");
		}
		else {
			staffImpl.setDisplayName(displayName);
		}

		if (salutation == null) {
			staffImpl.setSalutation("");
		}
		else {
			staffImpl.setSalutation(salutation);
		}

		if (departmentID == null) {
			staffImpl.setDepartmentID("");
		}
		else {
			staffImpl.setDepartmentID(departmentID);
		}

		if (staffType == null) {
			staffImpl.setStaffType("");
		}
		else {
			staffImpl.setStaffType(staffType);
		}

		if (designation == null) {
			staffImpl.setDesignation("");
		}
		else {
			staffImpl.setDesignation(designation);
		}

		if (expertise == null) {
			staffImpl.setExpertise("");
		}
		else {
			staffImpl.setExpertise(expertise);
		}

		if (qualifcation == null) {
			staffImpl.setQualifcation("");
		}
		else {
			staffImpl.setQualifcation(qualifcation);
		}

		staffImpl.setExperience(experience);

		staffImpl.resetOriginalValues();

		return staffImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		staffID = objectInput.readLong();

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
		staffType = objectInput.readUTF();
		designation = objectInput.readUTF();
		expertise = objectInput.readUTF();
		qualifcation = objectInput.readUTF();

		experience = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(staffID);

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

		if (staffType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffType);
		}

		if (designation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(designation);
		}

		if (expertise == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertise);
		}

		if (qualifcation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifcation);
		}

		objectOutput.writeLong(experience);
	}

	public String uuid;
	public long staffID;
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
	public String staffType;
	public String designation;
	public String expertise;
	public String qualifcation;
	public long experience;

}