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

package com.um.lms.sb.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.um.lms.sb.exception.NoSuchpublicationException;
import com.um.lms.sb.model.publication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the publication service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see publicationUtil
 * @generated
 */
@ProviderType
public interface publicationPersistence extends BasePersistence<publication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link publicationUtil} to access the publication persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the publications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching publications
	 */
	public java.util.List<publication> findByUuid(String uuid);

	/**
	 * Returns a range of all the publications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @return the range of matching publications
	 */
	public java.util.List<publication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the publications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching publications
	 */
	public java.util.List<publication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the publications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching publications
	 */
	public java.util.List<publication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first publication in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching publication
	 * @throws NoSuchpublicationException if a matching publication could not be found
	 */
	public publication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<publication>
				orderByComparator)
		throws NoSuchpublicationException;

	/**
	 * Returns the first publication in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching publication, or <code>null</code> if a matching publication could not be found
	 */
	public publication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator);

	/**
	 * Returns the last publication in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching publication
	 * @throws NoSuchpublicationException if a matching publication could not be found
	 */
	public publication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<publication>
				orderByComparator)
		throws NoSuchpublicationException;

	/**
	 * Returns the last publication in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching publication, or <code>null</code> if a matching publication could not be found
	 */
	public publication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator);

	/**
	 * Returns the publications before and after the current publication in the ordered set where uuid = &#63;.
	 *
	 * @param publicationID the primary key of the current publication
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next publication
	 * @throws NoSuchpublicationException if a publication with the primary key could not be found
	 */
	public publication[] findByUuid_PrevAndNext(
			long publicationID, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<publication>
				orderByComparator)
		throws NoSuchpublicationException;

	/**
	 * Removes all the publications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of publications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching publications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the publication where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchpublicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching publication
	 * @throws NoSuchpublicationException if a matching publication could not be found
	 */
	public publication findByUUID_G(String uuid, long groupId)
		throws NoSuchpublicationException;

	/**
	 * Returns the publication where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching publication, or <code>null</code> if a matching publication could not be found
	 */
	public publication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the publication where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching publication, or <code>null</code> if a matching publication could not be found
	 */
	public publication fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the publication where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the publication that was removed
	 */
	public publication removeByUUID_G(String uuid, long groupId)
		throws NoSuchpublicationException;

	/**
	 * Returns the number of publications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching publications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the publications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching publications
	 */
	public java.util.List<publication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the publications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @return the range of matching publications
	 */
	public java.util.List<publication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the publications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching publications
	 */
	public java.util.List<publication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the publications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching publications
	 */
	public java.util.List<publication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first publication in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching publication
	 * @throws NoSuchpublicationException if a matching publication could not be found
	 */
	public publication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<publication>
				orderByComparator)
		throws NoSuchpublicationException;

	/**
	 * Returns the first publication in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching publication, or <code>null</code> if a matching publication could not be found
	 */
	public publication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator);

	/**
	 * Returns the last publication in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching publication
	 * @throws NoSuchpublicationException if a matching publication could not be found
	 */
	public publication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<publication>
				orderByComparator)
		throws NoSuchpublicationException;

	/**
	 * Returns the last publication in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching publication, or <code>null</code> if a matching publication could not be found
	 */
	public publication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator);

	/**
	 * Returns the publications before and after the current publication in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param publicationID the primary key of the current publication
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next publication
	 * @throws NoSuchpublicationException if a publication with the primary key could not be found
	 */
	public publication[] findByUuid_C_PrevAndNext(
			long publicationID, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<publication>
				orderByComparator)
		throws NoSuchpublicationException;

	/**
	 * Removes all the publications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of publications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching publications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the publication in the entity cache if it is enabled.
	 *
	 * @param publication the publication
	 */
	public void cacheResult(publication publication);

	/**
	 * Caches the publications in the entity cache if it is enabled.
	 *
	 * @param publications the publications
	 */
	public void cacheResult(java.util.List<publication> publications);

	/**
	 * Creates a new publication with the primary key. Does not add the publication to the database.
	 *
	 * @param publicationID the primary key for the new publication
	 * @return the new publication
	 */
	public publication create(long publicationID);

	/**
	 * Removes the publication with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param publicationID the primary key of the publication
	 * @return the publication that was removed
	 * @throws NoSuchpublicationException if a publication with the primary key could not be found
	 */
	public publication remove(long publicationID)
		throws NoSuchpublicationException;

	public publication updateImpl(publication publication);

	/**
	 * Returns the publication with the primary key or throws a <code>NoSuchpublicationException</code> if it could not be found.
	 *
	 * @param publicationID the primary key of the publication
	 * @return the publication
	 * @throws NoSuchpublicationException if a publication with the primary key could not be found
	 */
	public publication findByPrimaryKey(long publicationID)
		throws NoSuchpublicationException;

	/**
	 * Returns the publication with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param publicationID the primary key of the publication
	 * @return the publication, or <code>null</code> if a publication with the primary key could not be found
	 */
	public publication fetchByPrimaryKey(long publicationID);

	/**
	 * Returns all the publications.
	 *
	 * @return the publications
	 */
	public java.util.List<publication> findAll();

	/**
	 * Returns a range of all the publications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @return the range of publications
	 */
	public java.util.List<publication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the publications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of publications
	 */
	public java.util.List<publication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the publications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>publicationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of publications
	 * @param end the upper bound of the range of publications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of publications
	 */
	public java.util.List<publication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<publication>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the publications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of publications.
	 *
	 * @return the number of publications
	 */
	public int countAll();

}