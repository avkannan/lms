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

import com.um.lms.sb.model.author;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing author in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class authorCacheModel implements CacheModel<author>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof authorCacheModel)) {
			return false;
		}

		authorCacheModel authorCacheModel = (authorCacheModel)obj;

		if (authorID == authorCacheModel.authorID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, authorID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", authorID=");
		sb.append(authorID);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public author toEntityModel() {
		authorImpl authorImpl = new authorImpl();

		if (uuid == null) {
			authorImpl.setUuid("");
		}
		else {
			authorImpl.setUuid(uuid);
		}

		authorImpl.setAuthorID(authorID);
		authorImpl.setGroupId(groupId);
		authorImpl.setCompanyId(companyId);
		authorImpl.setUserId(userId);

		if (userName == null) {
			authorImpl.setUserName("");
		}
		else {
			authorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			authorImpl.setCreateDate(null);
		}
		else {
			authorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			authorImpl.setModifiedDate(null);
		}
		else {
			authorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			authorImpl.setFirstName("");
		}
		else {
			authorImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			authorImpl.setMiddleName("");
		}
		else {
			authorImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			authorImpl.setLastName("");
		}
		else {
			authorImpl.setLastName(lastName);
		}

		if (displayName == null) {
			authorImpl.setDisplayName("");
		}
		else {
			authorImpl.setDisplayName(displayName);
		}

		if (salutation == null) {
			authorImpl.setSalutation("");
		}
		else {
			authorImpl.setSalutation(salutation);
		}

		authorImpl.resetOriginalValues();

		return authorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		authorID = objectInput.readLong();

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
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(authorID);

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
	}

	public String uuid;
	public long authorID;
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

}