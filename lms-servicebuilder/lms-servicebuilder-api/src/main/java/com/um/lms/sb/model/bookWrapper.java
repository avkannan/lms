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
 * This class is a wrapper for {@link book}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see book
 * @generated
 */
@ProviderType
public class bookWrapper
	extends BaseModelWrapper<book> implements book, ModelWrapper<book> {

	public bookWrapper(book book) {
		super(book);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookID", getBookID());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("authorID", getAuthorID());
		attributes.put("publicationID", getPublicationID());
		attributes.put("edition", getEdition());
		attributes.put("title", getTitle());
		attributes.put("quantity", getQuantity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookID = (Long)attributes.get("bookID");

		if (bookID != null) {
			setBookID(bookID);
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

		Long authorID = (Long)attributes.get("authorID");

		if (authorID != null) {
			setAuthorID(authorID);
		}

		Long publicationID = (Long)attributes.get("publicationID");

		if (publicationID != null) {
			setPublicationID(publicationID);
		}

		String edition = (String)attributes.get("edition");

		if (edition != null) {
			setEdition(edition);
		}

		Integer title = (Integer)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}
	}

	/**
	 * Returns the author ID of this book.
	 *
	 * @return the author ID of this book
	 */
	@Override
	public long getAuthorID() {
		return model.getAuthorID();
	}

	/**
	 * Returns the book ID of this book.
	 *
	 * @return the book ID of this book
	 */
	@Override
	public long getBookID() {
		return model.getBookID();
	}

	/**
	 * Returns the company ID of this book.
	 *
	 * @return the company ID of this book
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this book.
	 *
	 * @return the create date of this book
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the edition of this book.
	 *
	 * @return the edition of this book
	 */
	@Override
	public String getEdition() {
		return model.getEdition();
	}

	/**
	 * Returns the group ID of this book.
	 *
	 * @return the group ID of this book
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this book.
	 *
	 * @return the modified date of this book
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this book.
	 *
	 * @return the primary key of this book
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the publication ID of this book.
	 *
	 * @return the publication ID of this book
	 */
	@Override
	public long getPublicationID() {
		return model.getPublicationID();
	}

	/**
	 * Returns the quantity of this book.
	 *
	 * @return the quantity of this book
	 */
	@Override
	public int getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the title of this book.
	 *
	 * @return the title of this book
	 */
	@Override
	public int getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this book.
	 *
	 * @return the user ID of this book
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this book.
	 *
	 * @return the user name of this book
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this book.
	 *
	 * @return the user uuid of this book
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this book.
	 *
	 * @return the uuid of this book
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
	 * Sets the author ID of this book.
	 *
	 * @param authorID the author ID of this book
	 */
	@Override
	public void setAuthorID(long authorID) {
		model.setAuthorID(authorID);
	}

	/**
	 * Sets the book ID of this book.
	 *
	 * @param bookID the book ID of this book
	 */
	@Override
	public void setBookID(long bookID) {
		model.setBookID(bookID);
	}

	/**
	 * Sets the company ID of this book.
	 *
	 * @param companyId the company ID of this book
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this book.
	 *
	 * @param createDate the create date of this book
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the edition of this book.
	 *
	 * @param edition the edition of this book
	 */
	@Override
	public void setEdition(String edition) {
		model.setEdition(edition);
	}

	/**
	 * Sets the group ID of this book.
	 *
	 * @param groupId the group ID of this book
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this book.
	 *
	 * @param modifiedDate the modified date of this book
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this book.
	 *
	 * @param primaryKey the primary key of this book
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the publication ID of this book.
	 *
	 * @param publicationID the publication ID of this book
	 */
	@Override
	public void setPublicationID(long publicationID) {
		model.setPublicationID(publicationID);
	}

	/**
	 * Sets the quantity of this book.
	 *
	 * @param quantity the quantity of this book
	 */
	@Override
	public void setQuantity(int quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the title of this book.
	 *
	 * @param title the title of this book
	 */
	@Override
	public void setTitle(int title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this book.
	 *
	 * @param userId the user ID of this book
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this book.
	 *
	 * @param userName the user name of this book
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this book.
	 *
	 * @param userUuid the user uuid of this book
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this book.
	 *
	 * @param uuid the uuid of this book
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
	protected bookWrapper wrap(book book) {
		return new bookWrapper(book);
	}

}