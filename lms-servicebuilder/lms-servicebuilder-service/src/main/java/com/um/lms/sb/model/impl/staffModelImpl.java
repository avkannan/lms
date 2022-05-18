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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.um.lms.sb.model.staff;
import com.um.lms.sb.model.staffModel;
import com.um.lms.sb.model.staffSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the staff service. Represents a row in the &quot;lms_staff&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>staffModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link staffImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see staffImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class staffModelImpl extends BaseModelImpl<staff> implements staffModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a staff model instance should use the <code>staff</code> interface instead.
	 */
	public static final String TABLE_NAME = "lms_staff";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"staffID", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"firstName", Types.VARCHAR}, {"middleName", Types.VARCHAR},
		{"lastName", Types.VARCHAR}, {"displayName", Types.VARCHAR},
		{"salutation", Types.VARCHAR}, {"departmentID", Types.VARCHAR},
		{"staffType", Types.VARCHAR}, {"designation", Types.VARCHAR},
		{"expertise", Types.VARCHAR}, {"qualifcation", Types.VARCHAR},
		{"experience", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("staffID", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("firstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("middleName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("displayName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("salutation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("departmentID", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("staffType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("designation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("expertise", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("qualifcation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("experience", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table lms_staff (uuid_ VARCHAR(75) null,staffID LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,firstName VARCHAR(75) null,middleName VARCHAR(75) null,lastName VARCHAR(75) null,displayName VARCHAR(75) null,salutation VARCHAR(75) null,departmentID VARCHAR(75) null,staffType VARCHAR(75) null,designation VARCHAR(75) null,expertise VARCHAR(75) null,qualifcation VARCHAR(75) null,experience LONG)";

	public static final String TABLE_SQL_DROP = "drop table lms_staff";

	public static final String ORDER_BY_JPQL =
		" ORDER BY staff.displayName ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY lms_staff.displayName ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long DISPLAYNAME_COLUMN_BITMASK = 8L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static staff toModel(staffSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		staff model = new staffImpl();

		model.setUuid(soapModel.getUuid());
		model.setStaffID(soapModel.getStaffID());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setFirstName(soapModel.getFirstName());
		model.setMiddleName(soapModel.getMiddleName());
		model.setLastName(soapModel.getLastName());
		model.setDisplayName(soapModel.getDisplayName());
		model.setSalutation(soapModel.getSalutation());
		model.setDepartmentID(soapModel.getDepartmentID());
		model.setStaffType(soapModel.getStaffType());
		model.setDesignation(soapModel.getDesignation());
		model.setExpertise(soapModel.getExpertise());
		model.setQualifcation(soapModel.getQualifcation());
		model.setExperience(soapModel.getExperience());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<staff> toModels(staffSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<staff> models = new ArrayList<staff>(soapModels.length);

		for (staffSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public staffModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _staffID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStaffID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _staffID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return staff.class;
	}

	@Override
	public String getModelClassName() {
		return staff.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<staff, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<staff, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<staff, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((staff)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<staff, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<staff, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((staff)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<staff, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<staff, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<staff, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<staff, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<staff, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<staff, Object>>();
		Map<String, BiConsumer<staff, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<staff, ?>>();

		attributeGetterFunctions.put("uuid", staff::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<staff, String>)staff::setUuid);
		attributeGetterFunctions.put("staffID", staff::getStaffID);
		attributeSetterBiConsumers.put(
			"staffID", (BiConsumer<staff, Long>)staff::setStaffID);
		attributeGetterFunctions.put("groupId", staff::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<staff, Long>)staff::setGroupId);
		attributeGetterFunctions.put("companyId", staff::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<staff, Long>)staff::setCompanyId);
		attributeGetterFunctions.put("userId", staff::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<staff, Long>)staff::setUserId);
		attributeGetterFunctions.put("userName", staff::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<staff, String>)staff::setUserName);
		attributeGetterFunctions.put("createDate", staff::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<staff, Date>)staff::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", staff::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<staff, Date>)staff::setModifiedDate);
		attributeGetterFunctions.put("firstName", staff::getFirstName);
		attributeSetterBiConsumers.put(
			"firstName", (BiConsumer<staff, String>)staff::setFirstName);
		attributeGetterFunctions.put("middleName", staff::getMiddleName);
		attributeSetterBiConsumers.put(
			"middleName", (BiConsumer<staff, String>)staff::setMiddleName);
		attributeGetterFunctions.put("lastName", staff::getLastName);
		attributeSetterBiConsumers.put(
			"lastName", (BiConsumer<staff, String>)staff::setLastName);
		attributeGetterFunctions.put("displayName", staff::getDisplayName);
		attributeSetterBiConsumers.put(
			"displayName", (BiConsumer<staff, String>)staff::setDisplayName);
		attributeGetterFunctions.put("salutation", staff::getSalutation);
		attributeSetterBiConsumers.put(
			"salutation", (BiConsumer<staff, String>)staff::setSalutation);
		attributeGetterFunctions.put("departmentID", staff::getDepartmentID);
		attributeSetterBiConsumers.put(
			"departmentID", (BiConsumer<staff, String>)staff::setDepartmentID);
		attributeGetterFunctions.put("staffType", staff::getStaffType);
		attributeSetterBiConsumers.put(
			"staffType", (BiConsumer<staff, String>)staff::setStaffType);
		attributeGetterFunctions.put("designation", staff::getDesignation);
		attributeSetterBiConsumers.put(
			"designation", (BiConsumer<staff, String>)staff::setDesignation);
		attributeGetterFunctions.put("expertise", staff::getExpertise);
		attributeSetterBiConsumers.put(
			"expertise", (BiConsumer<staff, String>)staff::setExpertise);
		attributeGetterFunctions.put("qualifcation", staff::getQualifcation);
		attributeSetterBiConsumers.put(
			"qualifcation", (BiConsumer<staff, String>)staff::setQualifcation);
		attributeGetterFunctions.put("experience", staff::getExperience);
		attributeSetterBiConsumers.put(
			"experience", (BiConsumer<staff, Long>)staff::setExperience);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getStaffID() {
		return _staffID;
	}

	@Override
	public void setStaffID(long staffID) {
		_staffID = staffID;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return "";
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	@JSON
	@Override
	public String getMiddleName() {
		if (_middleName == null) {
			return "";
		}
		else {
			return _middleName;
		}
	}

	@Override
	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	@JSON
	@Override
	public String getLastName() {
		if (_lastName == null) {
			return "";
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	@JSON
	@Override
	public String getDisplayName() {
		if (_displayName == null) {
			return "";
		}
		else {
			return _displayName;
		}
	}

	@Override
	public void setDisplayName(String displayName) {
		_columnBitmask = -1L;

		_displayName = displayName;
	}

	@JSON
	@Override
	public String getSalutation() {
		if (_salutation == null) {
			return "";
		}
		else {
			return _salutation;
		}
	}

	@Override
	public void setSalutation(String salutation) {
		_salutation = salutation;
	}

	@JSON
	@Override
	public String getDepartmentID() {
		if (_departmentID == null) {
			return "";
		}
		else {
			return _departmentID;
		}
	}

	@Override
	public void setDepartmentID(String departmentID) {
		_departmentID = departmentID;
	}

	@JSON
	@Override
	public String getStaffType() {
		if (_staffType == null) {
			return "";
		}
		else {
			return _staffType;
		}
	}

	@Override
	public void setStaffType(String staffType) {
		_staffType = staffType;
	}

	@JSON
	@Override
	public String getDesignation() {
		if (_designation == null) {
			return "";
		}
		else {
			return _designation;
		}
	}

	@Override
	public void setDesignation(String designation) {
		_designation = designation;
	}

	@JSON
	@Override
	public String getExpertise() {
		if (_expertise == null) {
			return "";
		}
		else {
			return _expertise;
		}
	}

	@Override
	public void setExpertise(String expertise) {
		_expertise = expertise;
	}

	@JSON
	@Override
	public String getQualifcation() {
		if (_qualifcation == null) {
			return "";
		}
		else {
			return _qualifcation;
		}
	}

	@Override
	public void setQualifcation(String qualifcation) {
		_qualifcation = qualifcation;
	}

	@JSON
	@Override
	public long getExperience() {
		return _experience;
	}

	@Override
	public void setExperience(long experience) {
		_experience = experience;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(staff.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), staff.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public staff toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (staff)ProxyUtil.newProxyInstance(
				_classLoader, _escapedModelInterfaces,
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		staffImpl staffImpl = new staffImpl();

		staffImpl.setUuid(getUuid());
		staffImpl.setStaffID(getStaffID());
		staffImpl.setGroupId(getGroupId());
		staffImpl.setCompanyId(getCompanyId());
		staffImpl.setUserId(getUserId());
		staffImpl.setUserName(getUserName());
		staffImpl.setCreateDate(getCreateDate());
		staffImpl.setModifiedDate(getModifiedDate());
		staffImpl.setFirstName(getFirstName());
		staffImpl.setMiddleName(getMiddleName());
		staffImpl.setLastName(getLastName());
		staffImpl.setDisplayName(getDisplayName());
		staffImpl.setSalutation(getSalutation());
		staffImpl.setDepartmentID(getDepartmentID());
		staffImpl.setStaffType(getStaffType());
		staffImpl.setDesignation(getDesignation());
		staffImpl.setExpertise(getExpertise());
		staffImpl.setQualifcation(getQualifcation());
		staffImpl.setExperience(getExperience());

		staffImpl.resetOriginalValues();

		return staffImpl;
	}

	@Override
	public int compareTo(staff staff) {
		int value = 0;

		value = getDisplayName().compareTo(staff.getDisplayName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof staff)) {
			return false;
		}

		staff staff = (staff)obj;

		long primaryKey = staff.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		staffModelImpl staffModelImpl = this;

		staffModelImpl._originalUuid = staffModelImpl._uuid;

		staffModelImpl._originalGroupId = staffModelImpl._groupId;

		staffModelImpl._setOriginalGroupId = false;

		staffModelImpl._originalCompanyId = staffModelImpl._companyId;

		staffModelImpl._setOriginalCompanyId = false;

		staffModelImpl._setModifiedDate = false;

		staffModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<staff> toCacheModel() {
		staffCacheModel staffCacheModel = new staffCacheModel();

		staffCacheModel.uuid = getUuid();

		String uuid = staffCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			staffCacheModel.uuid = null;
		}

		staffCacheModel.staffID = getStaffID();

		staffCacheModel.groupId = getGroupId();

		staffCacheModel.companyId = getCompanyId();

		staffCacheModel.userId = getUserId();

		staffCacheModel.userName = getUserName();

		String userName = staffCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			staffCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			staffCacheModel.createDate = createDate.getTime();
		}
		else {
			staffCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			staffCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			staffCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		staffCacheModel.firstName = getFirstName();

		String firstName = staffCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			staffCacheModel.firstName = null;
		}

		staffCacheModel.middleName = getMiddleName();

		String middleName = staffCacheModel.middleName;

		if ((middleName != null) && (middleName.length() == 0)) {
			staffCacheModel.middleName = null;
		}

		staffCacheModel.lastName = getLastName();

		String lastName = staffCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			staffCacheModel.lastName = null;
		}

		staffCacheModel.displayName = getDisplayName();

		String displayName = staffCacheModel.displayName;

		if ((displayName != null) && (displayName.length() == 0)) {
			staffCacheModel.displayName = null;
		}

		staffCacheModel.salutation = getSalutation();

		String salutation = staffCacheModel.salutation;

		if ((salutation != null) && (salutation.length() == 0)) {
			staffCacheModel.salutation = null;
		}

		staffCacheModel.departmentID = getDepartmentID();

		String departmentID = staffCacheModel.departmentID;

		if ((departmentID != null) && (departmentID.length() == 0)) {
			staffCacheModel.departmentID = null;
		}

		staffCacheModel.staffType = getStaffType();

		String staffType = staffCacheModel.staffType;

		if ((staffType != null) && (staffType.length() == 0)) {
			staffCacheModel.staffType = null;
		}

		staffCacheModel.designation = getDesignation();

		String designation = staffCacheModel.designation;

		if ((designation != null) && (designation.length() == 0)) {
			staffCacheModel.designation = null;
		}

		staffCacheModel.expertise = getExpertise();

		String expertise = staffCacheModel.expertise;

		if ((expertise != null) && (expertise.length() == 0)) {
			staffCacheModel.expertise = null;
		}

		staffCacheModel.qualifcation = getQualifcation();

		String qualifcation = staffCacheModel.qualifcation;

		if ((qualifcation != null) && (qualifcation.length() == 0)) {
			staffCacheModel.qualifcation = null;
		}

		staffCacheModel.experience = getExperience();

		return staffCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<staff, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<staff, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<staff, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((staff)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<staff, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<staff, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<staff, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((staff)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader =
		staff.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
		staff.class, ModelWrapper.class
	};
	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _staffID;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private String _displayName;
	private String _salutation;
	private String _departmentID;
	private String _staffType;
	private String _designation;
	private String _expertise;
	private String _qualifcation;
	private long _experience;
	private long _columnBitmask;
	private staff _escapedModel;

}