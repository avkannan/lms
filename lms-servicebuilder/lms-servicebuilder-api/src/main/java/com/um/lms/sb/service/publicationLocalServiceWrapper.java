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
 * Provides a wrapper for {@link publicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see publicationLocalService
 * @generated
 */
@ProviderType
public class publicationLocalServiceWrapper
	implements publicationLocalService,
			   ServiceWrapper<publicationLocalService> {

	public publicationLocalServiceWrapper(
		publicationLocalService publicationLocalService) {

		_publicationLocalService = publicationLocalService;
	}

	/**
	 * Adds the publication to the database. Also notifies the appropriate model listeners.
	 *
	 * @param publication the publication
	 * @return the publication that was added
	 */
	@Override
	public com.um.lms.sb.model.publication addpublication(
		com.um.lms.sb.model.publication publication) {

		return _publicationLocalService.addpublication(publication);
	}

	/**
	 * Creates a new publication with the primary key. Does not add the publication to the database.
	 *
	 * @param publicationID the primary key for the new publication
	 * @return the new publication
	 */
	@Override
	public com.um.lms.sb.model.publication createpublication(
		long publicationID) {

		return _publicationLocalService.createpublication(publicationID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _publicationLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the publication with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param publicationID the primary key of the publication
	 * @return the publication that was removed
	 * @throws PortalException if a publication with the primary key could not be found
	 */
	@Override
	public com.um.lms.sb.model.publication deletepublication(long publicationID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _publicationLocalService.deletepublication(publicationID);
	}

	/**
	 * Deletes the publication from the database. Also notifies the appropriate model listeners.
	 *
	 * @param publication the publication
	 * @return the publication that was removed
	 */
	@Override
	public com.um.lms.sb.model.publication deletepublication(
		com.um.lms.sb.model.publication publication) {

		return _publicationLocalService.deletepublication(publication);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _publicationLocalService.dynamicQuery();
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

		return _publicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _publicationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _publicationLocalService.dynamicQuery(
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

		return _publicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _publicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.um.lms.sb.model.publication fetchpublication(
		long publicationID) {

		return _publicationLocalService.fetchpublication(publicationID);
	}

	/**
	 * Returns the publication matching the UUID and group.
	 *
	 * @param uuid the publication's UUID
	 * @param groupId the primary key of the group
	 * @return the matching publication, or <code>null</code> if a matching publication could not be found
	 */
	@Override
	public com.um.lms.sb.model.publication fetchpublicationByUuidAndGroupId(
		String uuid, long groupId) {

		return _publicationLocalService.fetchpublicationByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _publicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _publicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _publicationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _publicationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _publicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the publication with the primary key.
	 *
	 * @param publicationID the primary key of the publication
	 * @return the publication
	 * @throws PortalException if a publication with the primary key could not be found
	 */
	@Override
	public com.um.lms.sb.model.publication getpublication(long publicationID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _publicationLocalService.getpublication(publicationID);
	}

	/**
	 * Returns the publication matching the UUID and group.
	 *
	 * @param uuid the publication's UUID
	 * @param groupId the primary key of the group
	 * @return the matching publication
	 * @throws PortalException if a matching publication could not be found
	 */
	@Override
	public com.um.lms.sb.model.publication getpublicationByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _publicationLocalService.getpublicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the publications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @return the range of publications
	 */
	@Override
	public java.util.List<com.um.lms.sb.model.publication> getpublications(
		int start, int end) {

		return _publicationLocalService.getpublications(start, end);
	}

	/**
	 * Returns all the publications matching the UUID and company.
	 *
	 * @param uuid the UUID of the publications
	 * @param companyId the primary key of the company
	 * @return the matching publications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.lms.sb.model.publication>
		getpublicationsByUuidAndCompanyId(String uuid, long companyId) {

		return _publicationLocalService.getpublicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of publications matching the UUID and company.
	 *
	 * @param uuid the UUID of the publications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching publications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.lms.sb.model.publication>
		getpublicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.lms.sb.model.publication> orderByComparator) {

		return _publicationLocalService.getpublicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of publications.
	 *
	 * @return the number of publications
	 */
	@Override
	public int getpublicationsCount() {
		return _publicationLocalService.getpublicationsCount();
	}

	/**
	 * Updates the publication in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param publication the publication
	 * @return the publication that was updated
	 */
	@Override
	public com.um.lms.sb.model.publication updatepublication(
		com.um.lms.sb.model.publication publication) {

		return _publicationLocalService.updatepublication(publication);
	}

	@Override
	public publicationLocalService getWrappedService() {
		return _publicationLocalService;
	}

	@Override
	public void setWrappedService(
		publicationLocalService publicationLocalService) {

		_publicationLocalService = publicationLocalService;
	}

	private publicationLocalService _publicationLocalService;

}