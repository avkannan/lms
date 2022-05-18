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

package com.um.lms.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link staffLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see staffLocalService
 * @generated
 */
@ProviderType
public class staffLocalServiceWrapper
	implements staffLocalService, ServiceWrapper<staffLocalService> {

	public staffLocalServiceWrapper(staffLocalService staffLocalService) {
		_staffLocalService = staffLocalService;
	}

	/**
	 * Adds the staff to the database. Also notifies the appropriate model listeners.
	 *
	 * @param staff the staff
	 * @return the staff that was added
	 */
	@Override
	public com.um.lms.sb.model.staff addstaff(com.um.lms.sb.model.staff staff) {
		return _staffLocalService.addstaff(staff);
	}

	/**
	 * Creates a new staff with the primary key. Does not add the staff to the database.
	 *
	 * @param staffID the primary key for the new staff
	 * @return the new staff
	 */
	@Override
	public com.um.lms.sb.model.staff createstaff(long staffID) {
		return _staffLocalService.createstaff(staffID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staffLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param staffID the primary key of the staff
	 * @return the staff that was removed
	 * @throws PortalException if a staff with the primary key could not be found
	 */
	@Override
	public com.um.lms.sb.model.staff deletestaff(long staffID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staffLocalService.deletestaff(staffID);
	}

	/**
	 * Deletes the staff from the database. Also notifies the appropriate model listeners.
	 *
	 * @param staff the staff
	 * @return the staff that was removed
	 */
	@Override
	public com.um.lms.sb.model.staff deletestaff(
		com.um.lms.sb.model.staff staff) {

		return _staffLocalService.deletestaff(staff);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _staffLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _staffLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _staffLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _staffLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _staffLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _staffLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.um.lms.sb.model.staff fetchstaff(long staffID) {
		return _staffLocalService.fetchstaff(staffID);
	}

	/**
	 * Returns the staff matching the UUID and group.
	 *
	 * @param uuid the staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching staff, or <code>null</code> if a matching staff could not be found
	 */
	@Override
	public com.um.lms.sb.model.staff fetchstaffByUuidAndGroupId(
		String uuid, long groupId) {

		return _staffLocalService.fetchstaffByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _staffLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _staffLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _staffLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _staffLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staffLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the staff with the primary key.
	 *
	 * @param staffID the primary key of the staff
	 * @return the staff
	 * @throws PortalException if a staff with the primary key could not be found
	 */
	@Override
	public com.um.lms.sb.model.staff getstaff(long staffID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staffLocalService.getstaff(staffID);
	}

	/**
	 * Returns the staff matching the UUID and group.
	 *
	 * @param uuid the staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching staff
	 * @throws PortalException if a matching staff could not be found
	 */
	@Override
	public com.um.lms.sb.model.staff getstaffByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staffLocalService.getstaffByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @return the range of staffs
	 */
	@Override
	public java.util.List<com.um.lms.sb.model.staff> getstaffs(
		int start, int end) {

		return _staffLocalService.getstaffs(start, end);
	}

	/**
	 * Returns all the staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the staffs
	 * @param companyId the primary key of the company
	 * @return the matching staffs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.lms.sb.model.staff>
		getstaffsByUuidAndCompanyId(String uuid, long companyId) {

		return _staffLocalService.getstaffsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the staffs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching staffs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.lms.sb.model.staff>
		getstaffsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.lms.sb.model.staff> orderByComparator) {

		return _staffLocalService.getstaffsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of staffs.
	 *
	 * @return the number of staffs
	 */
	@Override
	public int getstaffsCount() {
		return _staffLocalService.getstaffsCount();
	}

	/**
	 * Updates the staff in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param staff the staff
	 * @return the staff that was updated
	 */
	@Override
	public com.um.lms.sb.model.staff updatestaff(
		com.um.lms.sb.model.staff staff) {

		return _staffLocalService.updatestaff(staff);
	}

	@Override
	public staffLocalService getWrappedService() {
		return _staffLocalService;
	}

	@Override
	public void setWrappedService(staffLocalService staffLocalService) {
		_staffLocalService = staffLocalService;
	}

	private staffLocalService _staffLocalService;

}