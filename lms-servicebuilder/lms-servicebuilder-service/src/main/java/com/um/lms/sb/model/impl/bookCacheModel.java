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

import com.um.lms.sb.model.book;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing book in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class bookCacheModel implements CacheModel<book>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookCacheModel)) {
			return false;
		}

		bookCacheModel bookCacheModel = (bookCacheModel)obj;

		if (bookID == bookCacheModel.bookID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bookID=");
		sb.append(bookID);
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
		sb.append(", authorID=");
		sb.append(authorID);
		sb.append(", publicationID=");
		sb.append(publicationID);
		sb.append(", edition=");
		sb.append(edition);
		sb.append(", title=");
		sb.append(title);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public book toEntityModel() {
		bookImpl bookImpl = new bookImpl();

		if (uuid == null) {
			bookImpl.setUuid("");
		}
		else {
			bookImpl.setUuid(uuid);
		}

		bookImpl.setBookID(bookID);
		bookImpl.setGroupId(groupId);
		bookImpl.setCompanyId(companyId);
		bookImpl.setUserId(userId);

		if (userName == null) {
			bookImpl.setUserName("");
		}
		else {
			bookImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			bookImpl.setCreateDate(null);
		}
		else {
			bookImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bookImpl.setModifiedDate(null);
		}
		else {
			bookImpl.setModifiedDate(new Date(modifiedDate));
		}

		bookImpl.setAuthorID(authorID);
		bookImpl.setPublicationID(publicationID);

		if (edition == null) {
			bookImpl.setEdition("");
		}
		else {
			bookImpl.setEdition(edition);
		}

		bookImpl.setTitle(title);
		bookImpl.setQuantity(quantity);

		bookImpl.resetOriginalValues();

		return bookImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bookID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		authorID = objectInput.readLong();

		publicationID = objectInput.readLong();
		edition = objectInput.readUTF();

		title = objectInput.readInt();

		quantity = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(bookID);

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

		objectOutput.writeLong(authorID);

		objectOutput.writeLong(publicationID);

		if (edition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(edition);
		}

		objectOutput.writeInt(title);

		objectOutput.writeInt(quantity);
	}

	public String uuid;
	public long bookID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long authorID;
	public long publicationID;
	public String edition;
	public int title;
	public int quantity;

}