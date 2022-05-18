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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for lending. This utility wraps
 * <code>com.um.lms.sb.service.impl.lendingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see lendingLocalService
 * @generated
 */
@ProviderType
public class lendingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.um.lms.sb.service.impl.lendingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the lending to the database. Also notifies the appropriate model listeners.
	 *
	 * @param lending the lending
	 * @return the lending that was added
	 */
	public static com.um.lms.sb.model.lending addlending(
		com.um.lms.sb.model.lending lending) {

		return getService().addlending(lending);
	}

	/**
	 * Creates a new lending with the primary key. Does not add the lending to the database.
	 *
	 * @param lendingID the primary key for the new lending
	 * @return the new lending
	 */
	public static com.um.lms.sb.model.lending createlending(long lendingID) {
		return getService().createlending(lendingID);
	}

	/**
	 * Deletes the lending from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lending the lending
	 * @return the lending that was removed
	 */
	public static com.um.lms.sb.model.lending deletelending(
		com.um.lms.sb.model.lending lending) {

		return getService().deletelending(lending);
	}

	/**
	 * Deletes the lending with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lendingID the primary key of the lending
	 * @return the lending that was removed
	 * @throws PortalException if a lending with the primary key could not be found
	 */
	public static com.um.lms.sb.model.lending deletelending(long lendingID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletelending(lendingID);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.um.lms.sb.model.lending fetchlending(long lendingID) {
		return getService().fetchlending(lendingID);
	}

	/**
	 * Returns the lending matching the UUID and group.
	 *
	 * @param uuid the lending's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lending, or <code>null</code> if a matching lending could not be found
	 */
	public static com.um.lms.sb.model.lending fetchlendingByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchlendingByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the lending with the primary key.
	 *
	 * @param lendingID the primary key of the lending
	 * @return the lending
	 * @throws PortalException if a lending with the primary key could not be found
	 */
	public static com.um.lms.sb.model.lending getlending(long lendingID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getlending(lendingID);
	}

	/**
	 * Returns the lending matching the UUID and group.
	 *
	 * @param uuid the lending's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lending
	 * @throws PortalException if a matching lending could not be found
	 */
	public static com.um.lms.sb.model.lending getlendingByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getlendingByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the lendings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @return the range of lendings
	 */
	public static java.util.List<com.um.lms.sb.model.lending> getlendings(
		int start, int end) {

		return getService().getlendings(start, end);
	}

	/**
	 * Returns all the lendings matching the UUID and company.
	 *
	 * @param uuid the UUID of the lendings
	 * @param companyId the primary key of the company
	 * @return the matching lendings, or an empty list if no matches were found
	 */
	public static java.util.List<com.um.lms.sb.model.lending>
		getlendingsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getlendingsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of lendings matching the UUID and company.
	 *
	 * @param uuid the UUID of the lendings
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching lendings, or an empty list if no matches were found
	 */
	public static java.util.List<com.um.lms.sb.model.lending>
		getlendingsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.lms.sb.model.lending> orderByComparator) {

		return getService().getlendingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of lendings.
	 *
	 * @return the number of lendings
	 */
	public static int getlendingsCount() {
		return getService().getlendingsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the lending in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param lending the lending
	 * @return the lending that was updated
	 */
	public static com.um.lms.sb.model.lending updatelending(
		com.um.lms.sb.model.lending lending) {

		return getService().updatelending(lending);
	}

	public static lendingLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<lendingLocalService, lendingLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(lendingLocalService.class);

		ServiceTracker<lendingLocalService, lendingLocalService>
			serviceTracker =
				new ServiceTracker<lendingLocalService, lendingLocalService>(
					bundle.getBundleContext(), lendingLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}