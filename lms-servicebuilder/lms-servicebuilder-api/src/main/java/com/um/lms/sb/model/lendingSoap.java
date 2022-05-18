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
 * This class is used by SOAP remote services, specifically {@link com.um.lms.sb.service.http.lendingServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class lendingSoap implements Serializable {

	public static lendingSoap toSoapModel(lending model) {
		lendingSoap soapModel = new lendingSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLendingID(model.getLendingID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setBookTitle(model.getBookTitle());
		soapModel.setBookId(model.getBookId());
		soapModel.setStudentId(model.getStudentId());
		soapModel.setStaffId(model.getStaffId());
		soapModel.setDueDate(model.getDueDate());
		soapModel.setLateFee(model.getLateFee());
		soapModel.setCheckoutDate(model.getCheckoutDate());
		soapModel.setLoanPeriod(model.getLoanPeriod());
		soapModel.setCheckinDate(model.getCheckinDate());

		return soapModel;
	}

	public static lendingSoap[] toSoapModels(lending[] models) {
		lendingSoap[] soapModels = new lendingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static lendingSoap[][] toSoapModels(lending[][] models) {
		lendingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new lendingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new lendingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static lendingSoap[] toSoapModels(List<lending> models) {
		List<lendingSoap> soapModels = new ArrayList<lendingSoap>(
			models.size());

		for (lending model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new lendingSoap[soapModels.size()]);
	}

	public lendingSoap() {
	}

	public long getPrimaryKey() {
		return _lendingID;
	}

	public void setPrimaryKey(long pk) {
		setLendingID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLendingID() {
		return _lendingID;
	}

	public void setLendingID(long lendingID) {
		_lendingID = lendingID;
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

	public long getBookTitle() {
		return _bookTitle;
	}

	public void setBookTitle(long bookTitle) {
		_bookTitle = bookTitle;
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public long getStaffId() {
		return _staffId;
	}

	public void setStaffId(long staffId) {
		_staffId = staffId;
	}

	public Date getDueDate() {
		return _dueDate;
	}

	public void setDueDate(Date dueDate) {
		_dueDate = dueDate;
	}

	public float getLateFee() {
		return _lateFee;
	}

	public void setLateFee(float lateFee) {
		_lateFee = lateFee;
	}

	public Date getCheckoutDate() {
		return _checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		_checkoutDate = checkoutDate;
	}

	public long getLoanPeriod() {
		return _loanPeriod;
	}

	public void setLoanPeriod(long loanPeriod) {
		_loanPeriod = loanPeriod;
	}

	public Date getCheckinDate() {
		return _checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		_checkinDate = checkinDate;
	}

	private String _uuid;
	private long _lendingID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _bookTitle;
	private long _bookId;
	private long _studentId;
	private long _staffId;
	private Date _dueDate;
	private float _lateFee;
	private Date _checkoutDate;
	private long _loanPeriod;
	private Date _checkinDate;

}