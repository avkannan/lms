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
 * This class is a wrapper for {@link publication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see publication
 * @generated
 */
@ProviderType
public class publicationWrapper
	extends BaseModelWrapper<publication>
	implements publication, ModelWrapper<publication> {

	public publicationWrapper(publication publication) {
		super(publication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("publicationID", getPublicationID());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("publicationName", getPublicationName());
		attributes.put("addressLine1", getAddressLine1());
		attributes.put("addressLine2", getAddressLine2());
		attributes.put("city", getCity());
		attributes.put("zip", getZip());
		attributes.put("state", getState());
		attributes.put("country", getCountry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long publicationID = (Long)attributes.get("publicationID");

		if (publicationID != null) {
			setPublicationID(publicationID);
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

		String publicationName = (String)attributes.get("publicationName");

		if (publicationName != null) {
			setPublicationName(publicationName);
		}

		String addressLine1 = (String)attributes.get("addressLine1");

		if (addressLine1 != null) {
			setAddressLine1(addressLine1);
		}

		String addressLine2 = (String)attributes.get("addressLine2");

		if (addressLine2 != null) {
			setAddressLine2(addressLine2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}
	}

	/**
	 * Returns the address line1 of this publication.
	 *
	 * @return the address line1 of this publication
	 */
	@Override
	public String getAddressLine1() {
		return model.getAddressLine1();
	}

	/**
	 * Returns the address line2 of this publication.
	 *
	 * @return the address line2 of this publication
	 */
	@Override
	public String getAddressLine2() {
		return model.getAddressLine2();
	}

	/**
	 * Returns the city of this publication.
	 *
	 * @return the city of this publication
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this publication.
	 *
	 * @return the company ID of this publication
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country of this publication.
	 *
	 * @return the country of this publication
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this publication.
	 *
	 * @return the create date of this publication
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this publication.
	 *
	 * @return the group ID of this publication
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this publication.
	 *
	 * @return the modified date of this publication
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this publication.
	 *
	 * @return the primary key of this publication
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the publication ID of this publication.
	 *
	 * @return the publication ID of this publication
	 */
	@Override
	public long getPublicationID() {
		return model.getPublicationID();
	}

	/**
	 * Returns the publication name of this publication.
	 *
	 * @return the publication name of this publication
	 */
	@Override
	public String getPublicationName() {
		return model.getPublicationName();
	}

	/**
	 * Returns the state of this publication.
	 *
	 * @return the state of this publication
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the user ID of this publication.
	 *
	 * @return the user ID of this publication
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this publication.
	 *
	 * @return the user name of this publication
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this publication.
	 *
	 * @return the user uuid of this publication
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this publication.
	 *
	 * @return the uuid of this publication
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the zip of this publication.
	 *
	 * @return the zip of this publication
	 */
	@Override
	public String getZip() {
		return model.getZip();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address line1 of this publication.
	 *
	 * @param addressLine1 the address line1 of this publication
	 */
	@Override
	public void setAddressLine1(String addressLine1) {
		model.setAddressLine1(addressLine1);
	}

	/**
	 * Sets the address line2 of this publication.
	 *
	 * @param addressLine2 the address line2 of this publication
	 */
	@Override
	public void setAddressLine2(String addressLine2) {
		model.setAddressLine2(addressLine2);
	}

	/**
	 * Sets the city of this publication.
	 *
	 * @param city the city of this publication
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this publication.
	 *
	 * @param companyId the company ID of this publication
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country of this publication.
	 *
	 * @param country the country of this publication
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this publication.
	 *
	 * @param createDate the create date of this publication
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this publication.
	 *
	 * @param groupId the group ID of this publication
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this publication.
	 *
	 * @param modifiedDate the modified date of this publication
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this publication.
	 *
	 * @param primaryKey the primary key of this publication
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the publication ID of this publication.
	 *
	 * @param publicationID the publication ID of this publication
	 */
	@Override
	public void setPublicationID(long publicationID) {
		model.setPublicationID(publicationID);
	}

	/**
	 * Sets the publication name of this publication.
	 *
	 * @param publicationName the publication name of this publication
	 */
	@Override
	public void setPublicationName(String publicationName) {
		model.setPublicationName(publicationName);
	}

	/**
	 * Sets the state of this publication.
	 *
	 * @param state the state of this publication
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the user ID of this publication.
	 *
	 * @param userId the user ID of this publication
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this publication.
	 *
	 * @param userName the user name of this publication
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this publication.
	 *
	 * @param userUuid the user uuid of this publication
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this publication.
	 *
	 * @param uuid the uuid of this publication
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the zip of this publication.
	 *
	 * @param zip the zip of this publication
	 */
	@Override
	public void setZip(String zip) {
		model.setZip(zip);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected publicationWrapper wrap(publication publication) {
		return new publicationWrapper(publication);
	}

}