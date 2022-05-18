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
 * This class is a wrapper for {@link lending}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see lending
 * @generated
 */
@ProviderType
public class lendingWrapper
	extends BaseModelWrapper<lending>
	implements lending, ModelWrapper<lending> {

	public lendingWrapper(lending lending) {
		super(lending);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("lendingID", getLendingID());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bookTitle", getBookTitle());
		attributes.put("bookId", getBookId());
		attributes.put("studentId", getStudentId());
		attributes.put("staffId", getStaffId());
		attributes.put("dueDate", getDueDate());
		attributes.put("lateFee", getLateFee());
		attributes.put("checkoutDate", getCheckoutDate());
		attributes.put("loanPeriod", getLoanPeriod());
		attributes.put("checkinDate", getCheckinDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long lendingID = (Long)attributes.get("lendingID");

		if (lendingID != null) {
			setLendingID(lendingID);
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

		Long bookTitle = (Long)attributes.get("bookTitle");

		if (bookTitle != null) {
			setBookTitle(bookTitle);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		Long staffId = (Long)attributes.get("staffId");

		if (staffId != null) {
			setStaffId(staffId);
		}

		Date dueDate = (Date)attributes.get("dueDate");

		if (dueDate != null) {
			setDueDate(dueDate);
		}

		Float lateFee = (Float)attributes.get("lateFee");

		if (lateFee != null) {
			setLateFee(lateFee);
		}

		Date checkoutDate = (Date)attributes.get("checkoutDate");

		if (checkoutDate != null) {
			setCheckoutDate(checkoutDate);
		}

		Long loanPeriod = (Long)attributes.get("loanPeriod");

		if (loanPeriod != null) {
			setLoanPeriod(loanPeriod);
		}

		Date checkinDate = (Date)attributes.get("checkinDate");

		if (checkinDate != null) {
			setCheckinDate(checkinDate);
		}
	}

	/**
	 * Returns the book ID of this lending.
	 *
	 * @return the book ID of this lending
	 */
	@Override
	public long getBookId() {
		return model.getBookId();
	}

	/**
	 * Returns the book title of this lending.
	 *
	 * @return the book title of this lending
	 */
	@Override
	public long getBookTitle() {
		return model.getBookTitle();
	}

	/**
	 * Returns the checkin date of this lending.
	 *
	 * @return the checkin date of this lending
	 */
	@Override
	public Date getCheckinDate() {
		return model.getCheckinDate();
	}

	/**
	 * Returns the checkout date of this lending.
	 *
	 * @return the checkout date of this lending
	 */
	@Override
	public Date getCheckoutDate() {
		return model.getCheckoutDate();
	}

	/**
	 * Returns the company ID of this lending.
	 *
	 * @return the company ID of this lending
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this lending.
	 *
	 * @return the create date of this lending
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the due date of this lending.
	 *
	 * @return the due date of this lending
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the group ID of this lending.
	 *
	 * @return the group ID of this lending
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the late fee of this lending.
	 *
	 * @return the late fee of this lending
	 */
	@Override
	public float getLateFee() {
		return model.getLateFee();
	}

	/**
	 * Returns the lending ID of this lending.
	 *
	 * @return the lending ID of this lending
	 */
	@Override
	public long getLendingID() {
		return model.getLendingID();
	}

	/**
	 * Returns the loan period of this lending.
	 *
	 * @return the loan period of this lending
	 */
	@Override
	public long getLoanPeriod() {
		return model.getLoanPeriod();
	}

	/**
	 * Returns the modified date of this lending.
	 *
	 * @return the modified date of this lending
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this lending.
	 *
	 * @return the primary key of this lending
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the staff ID of this lending.
	 *
	 * @return the staff ID of this lending
	 */
	@Override
	public long getStaffId() {
		return model.getStaffId();
	}

	/**
	 * Returns the student ID of this lending.
	 *
	 * @return the student ID of this lending
	 */
	@Override
	public long getStudentId() {
		return model.getStudentId();
	}

	/**
	 * Returns the user ID of this lending.
	 *
	 * @return the user ID of this lending
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this lending.
	 *
	 * @return the user name of this lending
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this lending.
	 *
	 * @return the user uuid of this lending
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this lending.
	 *
	 * @return the uuid of this lending
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
	 * Sets the book ID of this lending.
	 *
	 * @param bookId the book ID of this lending
	 */
	@Override
	public void setBookId(long bookId) {
		model.setBookId(bookId);
	}

	/**
	 * Sets the book title of this lending.
	 *
	 * @param bookTitle the book title of this lending
	 */
	@Override
	public void setBookTitle(long bookTitle) {
		model.setBookTitle(bookTitle);
	}

	/**
	 * Sets the checkin date of this lending.
	 *
	 * @param checkinDate the checkin date of this lending
	 */
	@Override
	public void setCheckinDate(Date checkinDate) {
		model.setCheckinDate(checkinDate);
	}

	/**
	 * Sets the checkout date of this lending.
	 *
	 * @param checkoutDate the checkout date of this lending
	 */
	@Override
	public void setCheckoutDate(Date checkoutDate) {
		model.setCheckoutDate(checkoutDate);
	}

	/**
	 * Sets the company ID of this lending.
	 *
	 * @param companyId the company ID of this lending
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this lending.
	 *
	 * @param createDate the create date of this lending
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the due date of this lending.
	 *
	 * @param dueDate the due date of this lending
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the group ID of this lending.
	 *
	 * @param groupId the group ID of this lending
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the late fee of this lending.
	 *
	 * @param lateFee the late fee of this lending
	 */
	@Override
	public void setLateFee(float lateFee) {
		model.setLateFee(lateFee);
	}

	/**
	 * Sets the lending ID of this lending.
	 *
	 * @param lendingID the lending ID of this lending
	 */
	@Override
	public void setLendingID(long lendingID) {
		model.setLendingID(lendingID);
	}

	/**
	 * Sets the loan period of this lending.
	 *
	 * @param loanPeriod the loan period of this lending
	 */
	@Override
	public void setLoanPeriod(long loanPeriod) {
		model.setLoanPeriod(loanPeriod);
	}

	/**
	 * Sets the modified date of this lending.
	 *
	 * @param modifiedDate the modified date of this lending
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this lending.
	 *
	 * @param primaryKey the primary key of this lending
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the staff ID of this lending.
	 *
	 * @param staffId the staff ID of this lending
	 */
	@Override
	public void setStaffId(long staffId) {
		model.setStaffId(staffId);
	}

	/**
	 * Sets the student ID of this lending.
	 *
	 * @param studentId the student ID of this lending
	 */
	@Override
	public void setStudentId(long studentId) {
		model.setStudentId(studentId);
	}

	/**
	 * Sets the user ID of this lending.
	 *
	 * @param userId the user ID of this lending
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this lending.
	 *
	 * @param userName the user name of this lending
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this lending.
	 *
	 * @param userUuid the user uuid of this lending
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this lending.
	 *
	 * @param uuid the uuid of this lending
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
	protected lendingWrapper wrap(lending lending) {
		return new lendingWrapper(lending);
	}

}