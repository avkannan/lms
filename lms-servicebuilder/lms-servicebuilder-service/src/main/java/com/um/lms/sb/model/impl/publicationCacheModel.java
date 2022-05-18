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

import com.um.lms.sb.model.publication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing publication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class publicationCacheModel
	implements CacheModel<publication>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof publicationCacheModel)) {
			return false;
		}

		publicationCacheModel publicationCacheModel =
			(publicationCacheModel)obj;

		if (publicationID == publicationCacheModel.publicationID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, publicationID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", publicationID=");
		sb.append(publicationID);
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
		sb.append(", publicationName=");
		sb.append(publicationName);
		sb.append(", addressLine1=");
		sb.append(addressLine1);
		sb.append(", addressLine2=");
		sb.append(addressLine2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", zip=");
		sb.append(zip);
		sb.append(", state=");
		sb.append(state);
		sb.append(", country=");
		sb.append(country);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public publication toEntityModel() {
		publicationImpl publicationImpl = new publicationImpl();

		if (uuid == null) {
			publicationImpl.setUuid("");
		}
		else {
			publicationImpl.setUuid(uuid);
		}

		publicationImpl.setPublicationID(publicationID);
		publicationImpl.setGroupId(groupId);
		publicationImpl.setCompanyId(companyId);
		publicationImpl.setUserId(userId);

		if (userName == null) {
			publicationImpl.setUserName("");
		}
		else {
			publicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			publicationImpl.setCreateDate(null);
		}
		else {
			publicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			publicationImpl.setModifiedDate(null);
		}
		else {
			publicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (publicationName == null) {
			publicationImpl.setPublicationName("");
		}
		else {
			publicationImpl.setPublicationName(publicationName);
		}

		if (addressLine1 == null) {
			publicationImpl.setAddressLine1("");
		}
		else {
			publicationImpl.setAddressLine1(addressLine1);
		}

		if (addressLine2 == null) {
			publicationImpl.setAddressLine2("");
		}
		else {
			publicationImpl.setAddressLine2(addressLine2);
		}

		if (city == null) {
			publicationImpl.setCity("");
		}
		else {
			publicationImpl.setCity(city);
		}

		if (zip == null) {
			publicationImpl.setZip("");
		}
		else {
			publicationImpl.setZip(zip);
		}

		if (state == null) {
			publicationImpl.setState("");
		}
		else {
			publicationImpl.setState(state);
		}

		if (country == null) {
			publicationImpl.setCountry("");
		}
		else {
			publicationImpl.setCountry(country);
		}

		publicationImpl.resetOriginalValues();

		return publicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		publicationID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		publicationName = objectInput.readUTF();
		addressLine1 = objectInput.readUTF();
		addressLine2 = objectInput.readUTF();
		city = objectInput.readUTF();
		zip = objectInput.readUTF();
		state = objectInput.readUTF();
		country = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(publicationID);

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

		if (publicationName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(publicationName);
		}

		if (addressLine1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressLine1);
		}

		if (addressLine2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressLine2);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (zip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zip);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}
	}

	public String uuid;
	public long publicationID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String publicationName;
	public String addressLine1;
	public String addressLine2;
	public String city;
	public String zip;
	public String state;
	public String country;

}