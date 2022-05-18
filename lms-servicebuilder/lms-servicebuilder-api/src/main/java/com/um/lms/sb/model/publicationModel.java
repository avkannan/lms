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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the publication service. Represents a row in the &quot;lms_publication&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.um.lms.sb.model.impl.publicationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.um.lms.sb.model.impl.publicationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see publication
 * @generated
 */
@ProviderType
public interface publicationModel
	extends BaseModel<publication>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a publication model instance should use the {@link publication} interface instead.
	 */

	/**
	 * Returns the primary key of this publication.
	 *
	 * @return the primary key of this publication
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this publication.
	 *
	 * @param primaryKey the primary key of this publication
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this publication.
	 *
	 * @return the uuid of this publication
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this publication.
	 *
	 * @param uuid the uuid of this publication
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the publication ID of this publication.
	 *
	 * @return the publication ID of this publication
	 */
	public long getPublicationID();

	/**
	 * Sets the publication ID of this publication.
	 *
	 * @param publicationID the publication ID of this publication
	 */
	public void setPublicationID(long publicationID);

	/**
	 * Returns the group ID of this publication.
	 *
	 * @return the group ID of this publication
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this publication.
	 *
	 * @param groupId the group ID of this publication
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this publication.
	 *
	 * @return the company ID of this publication
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this publication.
	 *
	 * @param companyId the company ID of this publication
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this publication.
	 *
	 * @return the user ID of this publication
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this publication.
	 *
	 * @param userId the user ID of this publication
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this publication.
	 *
	 * @return the user uuid of this publication
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this publication.
	 *
	 * @param userUuid the user uuid of this publication
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this publication.
	 *
	 * @return the user name of this publication
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this publication.
	 *
	 * @param userName the user name of this publication
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this publication.
	 *
	 * @return the create date of this publication
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this publication.
	 *
	 * @param createDate the create date of this publication
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this publication.
	 *
	 * @return the modified date of this publication
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this publication.
	 *
	 * @param modifiedDate the modified date of this publication
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the publication name of this publication.
	 *
	 * @return the publication name of this publication
	 */
	@AutoEscape
	public String getPublicationName();

	/**
	 * Sets the publication name of this publication.
	 *
	 * @param publicationName the publication name of this publication
	 */
	public void setPublicationName(String publicationName);

	/**
	 * Returns the address line1 of this publication.
	 *
	 * @return the address line1 of this publication
	 */
	@AutoEscape
	public String getAddressLine1();

	/**
	 * Sets the address line1 of this publication.
	 *
	 * @param addressLine1 the address line1 of this publication
	 */
	public void setAddressLine1(String addressLine1);

	/**
	 * Returns the address line2 of this publication.
	 *
	 * @return the address line2 of this publication
	 */
	@AutoEscape
	public String getAddressLine2();

	/**
	 * Sets the address line2 of this publication.
	 *
	 * @param addressLine2 the address line2 of this publication
	 */
	public void setAddressLine2(String addressLine2);

	/**
	 * Returns the city of this publication.
	 *
	 * @return the city of this publication
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this publication.
	 *
	 * @param city the city of this publication
	 */
	public void setCity(String city);

	/**
	 * Returns the zip of this publication.
	 *
	 * @return the zip of this publication
	 */
	@AutoEscape
	public String getZip();

	/**
	 * Sets the zip of this publication.
	 *
	 * @param zip the zip of this publication
	 */
	public void setZip(String zip);

	/**
	 * Returns the state of this publication.
	 *
	 * @return the state of this publication
	 */
	@AutoEscape
	public String getState();

	/**
	 * Sets the state of this publication.
	 *
	 * @param state the state of this publication
	 */
	public void setState(String state);

	/**
	 * Returns the country of this publication.
	 *
	 * @return the country of this publication
	 */
	@AutoEscape
	public String getCountry();

	/**
	 * Sets the country of this publication.
	 *
	 * @param country the country of this publication
	 */
	public void setCountry(String country);

}