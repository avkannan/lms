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
 * Provides a wrapper for {@link studentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see studentLocalService
 * @generated
 */
@ProviderType
public class studentLocalServiceWrapper
	implements studentLocalService, ServiceWrapper<studentLocalService> {

	public studentLocalServiceWrapper(studentLocalService studentLocalService) {
		_studentLocalService = studentLocalService;
	}

	/**
	 * Adds the student to the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was added
	 */
	@Override
	public com.um.lms.sb.model.student addstudent(
		com.um.lms.sb.model.student student) {

		return _studentLocalService.addstudent(student);
	}

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param studentID the primary key for the new student
	 * @return the new student
	 */
	@Override
	public com.um.lms.sb.model.student createstudent(long studentID) {
		return _studentLocalService.createstudent(studentID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentID the primary key of the student
	 * @return the student that was removed
	 * @throws PortalException if a student with the primary key could not be found
	 */
	@Override
	public com.um.lms.sb.model.student deletestudent(long studentID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.deletestudent(studentID);
	}

	/**
	 * Deletes the student from the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was removed
	 */
	@Override
	public com.um.lms.sb.model.student deletestudent(
		com.um.lms.sb.model.student student) {

		return _studentLocalService.deletestudent(student);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _studentLocalService.dynamicQuery();
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

		return _studentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.studentModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _studentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.studentModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _studentLocalService.dynamicQuery(
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

		return _studentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _studentLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.um.lms.sb.model.student fetchstudent(long studentID) {
		return _studentLocalService.fetchstudent(studentID);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	@Override
	public com.um.lms.sb.model.student fetchstudentByUuidAndGroupId(
		String uuid, long groupId) {

		return _studentLocalService.fetchstudentByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _studentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _studentLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _studentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _studentLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the student with the primary key.
	 *
	 * @param studentID the primary key of the student
	 * @return the student
	 * @throws PortalException if a student with the primary key could not be found
	 */
	@Override
	public com.um.lms.sb.model.student getstudent(long studentID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.getstudent(studentID);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student
	 * @throws PortalException if a matching student could not be found
	 */
	@Override
	public com.um.lms.sb.model.student getstudentByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.getstudentByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.lms.sb.model.impl.studentModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of students
	 */
	@Override
	public java.util.List<com.um.lms.sb.model.student> getstudents(
		int start, int end) {

		return _studentLocalService.getstudents(start, end);
	}

	/**
	 * Returns all the students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @return the matching students, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.lms.sb.model.student>
		getstudentsByUuidAndCompanyId(String uuid, long companyId) {

		return _studentLocalService.getstudentsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching students, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.lms.sb.model.student>
		getstudentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.lms.sb.model.student> orderByComparator) {

		return _studentLocalService.getstudentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
	 */
	@Override
	public int getstudentsCount() {
		return _studentLocalService.getstudentsCount();
	}

	/**
	 * Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was updated
	 */
	@Override
	public com.um.lms.sb.model.student updatestudent(
		com.um.lms.sb.model.student student) {

		return _studentLocalService.updatestudent(student);
	}

	@Override
	public studentLocalService getWrappedService() {
		return _studentLocalService;
	}

	@Override
	public void setWrappedService(studentLocalService studentLocalService) {
		_studentLocalService = studentLocalService;
	}

	private studentLocalService _studentLocalService;

}