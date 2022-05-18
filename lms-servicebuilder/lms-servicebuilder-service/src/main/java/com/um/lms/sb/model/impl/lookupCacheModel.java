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

import com.um.lms.sb.model.lookup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing lookup in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class lookupCacheModel implements CacheModel<lookup>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof lookupCacheModel)) {
			return false;
		}

		lookupCacheModel lookupCacheModel = (lookupCacheModel)obj;

		if (lookupID == lookupCacheModel.lookupID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, lookupID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", lookupID=");
		sb.append(lookupID);
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
		sb.append(", lookupKey=");
		sb.append(lookupKey);
		sb.append(", lookupValue=");
		sb.append(lookupValue);
		sb.append(", lookupName=");
		sb.append(lookupName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public lookup toEntityModel() {
		lookupImpl lookupImpl = new lookupImpl();

		if (uuid == null) {
			lookupImpl.setUuid("");
		}
		else {
			lookupImpl.setUuid(uuid);
		}

		lookupImpl.setLookupID(lookupID);
		lookupImpl.setGroupId(groupId);
		lookupImpl.setCompanyId(companyId);
		lookupImpl.setUserId(userId);

		if (userName == null) {
			lookupImpl.setUserName("");
		}
		else {
			lookupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			lookupImpl.setCreateDate(null);
		}
		else {
			lookupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			lookupImpl.setModifiedDate(null);
		}
		else {
			lookupImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (lookupKey == null) {
			lookupImpl.setLookupKey("");
		}
		else {
			lookupImpl.setLookupKey(lookupKey);
		}

		if (lookupValue == null) {
			lookupImpl.setLookupValue("");
		}
		else {
			lookupImpl.setLookupValue(lookupValue);
		}

		lookupImpl.setLookupName(lookupName);

		lookupImpl.resetOriginalValues();

		return lookupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		lookupID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		lookupKey = objectInput.readUTF();
		lookupValue = objectInput.readUTF();

		lookupName = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(lookupID);

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

		if (lookupKey == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lookupKey);
		}

		if (lookupValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lookupValue);
		}

		objectOutput.writeInt(lookupName);
	}

	public String uuid;
	public long lookupID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String lookupKey;
	public String lookupValue;
	public int lookupName;

}