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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.um.lms.sb.service.http.publicationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class publicationSoap implements Serializable {

	public static publicationSoap toSoapModel(publication model) {
		publicationSoap soapModel = new publicationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPublicationID(model.getPublicationID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPublicationName(model.getPublicationName());
		soapModel.setAddressLine1(model.getAddressLine1());
		soapModel.setAddressLine2(model.getAddressLine2());
		soapModel.setCity(model.getCity());
		soapModel.setZip(model.getZip());
		soapModel.setState(model.getState());
		soapModel.setCountry(model.getCountry());

		return soapModel;
	}

	public static publicationSoap[] toSoapModels(publication[] models) {
		publicationSoap[] soapModels = new publicationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static publicationSoap[][] toSoapModels(publication[][] models) {
		publicationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new publicationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new publicationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static publicationSoap[] toSoapModels(List<publication> models) {
		List<publicationSoap> soapModels = new ArrayList<publicationSoap>(
			models.size());

		for (publication model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new publicationSoap[soapModels.size()]);
	}

	public publicationSoap() {
	}

	public long getPrimaryKey() {
		return _publicationID;
	}

	public void setPrimaryKey(long pk) {
		setPublicationID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPublicationID() {
		return _publicationID;
	}

	public void setPublicationID(long publicationID) {
		_publicationID = publicationID;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getPublicationName() {
		return _publicationName;
	}

	public void setPublicationName(String publicationName) {
		_publicationName = publicationName;
	}

	public String getAddressLine1() {
		return _addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		_addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return _addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		_addressLine2 = addressLine2;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getZip() {
		return _zip;
	}

	public void setZip(String zip) {
		_zip = zip;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	private String _uuid;
	private long _publicationID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _publicationName;
	private String _addressLine1;
	private String _addressLine2;
	private String _city;
	private String _zip;
	private String _state;
	private String _country;

}