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
 * This class is a wrapper for {@link author}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see author
 * @generated
 */
@ProviderType
public class authorWrapper
	extends BaseModelWrapper<author> implements author, ModelWrapper<author> {

	public authorWrapper(author author) {
		super(author);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("authorID", getAuthorID());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("displayName", getDisplayName());
		attributes.put("salutation", getSalutation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long authorID = (Long)attributes.get("authorID");

		if (authorID != null) {
			setAuthorID(authorID);
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

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String displayName = (String)attributes.get("displayName");

		if (displayName != null) {
			setDisplayName(displayName);
		}

		String salutation = (String)attributes.get("salutation");

		if (salutation != null) {
			setSalutation(salutation);
		}
	}

	/**
	 * Returns the author ID of this author.
	 *
	 * @return the author ID of this author
	 */
	@Override
	public long getAuthorID() {
		return model.getAuthorID();
	}

	/**
	 * Returns the company ID of this author.
	 *
	 * @return the company ID of this author
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this author.
	 *
	 * @return the create date of this author
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the display name of this author.
	 *
	 * @return the display name of this author
	 */
	@Override
	public String getDisplayName() {
		return model.getDisplayName();
	}

	/**
	 * Returns the first name of this author.
	 *
	 * @return the first name of this author
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this author.
	 *
	 * @return the group ID of this author
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last name of this author.
	 *
	 * @return the last name of this author
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the middle name of this author.
	 *
	 * @return the middle name of this author
	 */
	@Override
	public String getMiddleName() {
		return model.getMiddleName();
	}

	/**
	 * Returns the modified date of this author.
	 *
	 * @return the modified date of this author
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this author.
	 *
	 * @return the primary key of this author
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the salutation of this author.
	 *
	 * @return the salutation of this author
	 */
	@Override
	public String getSalutation() {
		return model.getSalutation();
	}

	/**
	 * Returns the user ID of this author.
	 *
	 * @return the user ID of this author
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this author.
	 *
	 * @return the user name of this author
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this author.
	 *
	 * @return the user uuid of this author
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this author.
	 *
	 * @return the uuid of this author
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
	 * Sets the author ID of this author.
	 *
	 * @param authorID the author ID of this author
	 */
	@Override
	public void setAuthorID(long authorID) {
		model.setAuthorID(authorID);
	}

	/**
	 * Sets the company ID of this author.
	 *
	 * @param companyId the company ID of this author
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this author.
	 *
	 * @param createDate the create date of this author
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the display name of this author.
	 *
	 * @param displayName the display name of this author
	 */
	@Override
	public void setDisplayName(String displayName) {
		model.setDisplayName(displayName);
	}

	/**
	 * Sets the first name of this author.
	 *
	 * @param firstName the first name of this author
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this author.
	 *
	 * @param groupId the group ID of this author
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this author.
	 *
	 * @param lastName the last name of this author
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the middle name of this author.
	 *
	 * @param middleName the middle name of this author
	 */
	@Override
	public void setMiddleName(String middleName) {
		model.setMiddleName(middleName);
	}

	/**
	 * Sets the modified date of this author.
	 *
	 * @param modifiedDate the modified date of this author
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this author.
	 *
	 * @param primaryKey the primary key of this author
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the salutation of this author.
	 *
	 * @param salutation the salutation of this author
	 */
	@Override
	public void setSalutation(String salutation) {
		model.setSalutation(salutation);
	}

	/**
	 * Sets the user ID of this author.
	 *
	 * @param userId the user ID of this author
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this author.
	 *
	 * @param userName the user name of this author
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this author.
	 *
	 * @param userUuid the user uuid of this author
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this author.
	 *
	 * @param uuid the uuid of this author
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
	protected authorWrapper wrap(author author) {
		return new authorWrapper(author);
	}

}