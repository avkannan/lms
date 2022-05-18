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
 * This class is used by SOAP remote services, specifically {@link com.um.lms.sb.service.http.bookServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class bookSoap implements Serializable {

	public static bookSoap toSoapModel(book model) {
		bookSoap soapModel = new bookSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBookID(model.getBookID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAuthorID(model.getAuthorID());
		soapModel.setPublicationID(model.getPublicationID());
		soapModel.setEdition(model.getEdition());
		soapModel.setTitle(model.getTitle());
		soapModel.setQuantity(model.getQuantity());

		return soapModel;
	}

	public static bookSoap[] toSoapModels(book[] models) {
		bookSoap[] soapModels = new bookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static bookSoap[][] toSoapModels(book[][] models) {
		bookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new bookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new bookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static bookSoap[] toSoapModels(List<book> models) {
		List<bookSoap> soapModels = new ArrayList<bookSoap>(models.size());

		for (book model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new bookSoap[soapModels.size()]);
	}

	public bookSoap() {
	}

	public long getPrimaryKey() {
		return _bookID;
	}

	public void setPrimaryKey(long pk) {
		setBookID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBookID() {
		return _bookID;
	}

	public void setBookID(long bookID) {
		_bookID = bookID;
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

	public long getAuthorID() {
		return _authorID;
	}

	public void setAuthorID(long authorID) {
		_authorID = authorID;
	}

	public long getPublicationID() {
		return _publicationID;
	}

	public void setPublicationID(long publicationID) {
		_publicationID = publicationID;
	}

	public String getEdition() {
		return _edition;
	}

	public void setEdition(String edition) {
		_edition = edition;
	}

	public int getTitle() {
		return _title;
	}

	public void setTitle(int title) {
		_title = title;
	}

	public int getQuantity() {
		return _quantity;
	}

	public void setQuantity(int quantity) {
		_quantity = quantity;
	}

	private String _uuid;
	private long _bookID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _authorID;
	private long _publicationID;
	private String _edition;
	private int _title;
	private int _quantity;

}