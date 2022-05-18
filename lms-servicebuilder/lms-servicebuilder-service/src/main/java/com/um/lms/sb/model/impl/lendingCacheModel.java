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

import com.um.lms.sb.model.lending;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing lending in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class lendingCacheModel implements CacheModel<lending>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof lendingCacheModel)) {
			return false;
		}

		lendingCacheModel lendingCacheModel = (lendingCacheModel)obj;

		if (lendingID == lendingCacheModel.lendingID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, lendingID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", lendingID=");
		sb.append(lendingID);
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
		sb.append(", bookTitle=");
		sb.append(bookTitle);
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", studentId=");
		sb.append(studentId);
		sb.append(", staffId=");
		sb.append(staffId);
		sb.append(", dueDate=");
		sb.append(dueDate);
		sb.append(", lateFee=");
		sb.append(lateFee);
		sb.append(", checkoutDate=");
		sb.append(checkoutDate);
		sb.append(", loanPeriod=");
		sb.append(loanPeriod);
		sb.append(", checkinDate=");
		sb.append(checkinDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public lending toEntityModel() {
		lendingImpl lendingImpl = new lendingImpl();

		if (uuid == null) {
			lendingImpl.setUuid("");
		}
		else {
			lendingImpl.setUuid(uuid);
		}

		lendingImpl.setLendingID(lendingID);
		lendingImpl.setGroupId(groupId);
		lendingImpl.setCompanyId(companyId);
		lendingImpl.setUserId(userId);

		if (userName == null) {
			lendingImpl.setUserName("");
		}
		else {
			lendingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			lendingImpl.setCreateDate(null);
		}
		else {
			lendingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			lendingImpl.setModifiedDate(null);
		}
		else {
			lendingImpl.setModifiedDate(new Date(modifiedDate));
		}

		lendingImpl.setBookTitle(bookTitle);
		lendingImpl.setBookId(bookId);
		lendingImpl.setStudentId(studentId);
		lendingImpl.setStaffId(staffId);

		if (dueDate == Long.MIN_VALUE) {
			lendingImpl.setDueDate(null);
		}
		else {
			lendingImpl.setDueDate(new Date(dueDate));
		}

		lendingImpl.setLateFee(lateFee);

		if (checkoutDate == Long.MIN_VALUE) {
			lendingImpl.setCheckoutDate(null);
		}
		else {
			lendingImpl.setCheckoutDate(new Date(checkoutDate));
		}

		lendingImpl.setLoanPeriod(loanPeriod);

		if (checkinDate == Long.MIN_VALUE) {
			lendingImpl.setCheckinDate(null);
		}
		else {
			lendingImpl.setCheckinDate(new Date(checkinDate));
		}

		lendingImpl.resetOriginalValues();

		return lendingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		lendingID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		bookTitle = objectInput.readLong();

		bookId = objectInput.readLong();

		studentId = objectInput.readLong();

		staffId = objectInput.readLong();
		dueDate = objectInput.readLong();

		lateFee = objectInput.readFloat();
		checkoutDate = objectInput.readLong();

		loanPeriod = objectInput.readLong();
		checkinDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(lendingID);

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

		objectOutput.writeLong(bookTitle);

		objectOutput.writeLong(bookId);

		objectOutput.writeLong(studentId);

		objectOutput.writeLong(staffId);
		objectOutput.writeLong(dueDate);

		objectOutput.writeFloat(lateFee);
		objectOutput.writeLong(checkoutDate);

		objectOutput.writeLong(loanPeriod);
		objectOutput.writeLong(checkinDate);
	}

	public String uuid;
	public long lendingID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long bookTitle;
	public long bookId;
	public long studentId;
	public long staffId;
	public long dueDate;
	public float lateFee;
	public long checkoutDate;
	public long loanPeriod;
	public long checkinDate;

}