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

import com.um.lms.sb.exception.NoSuchstaffException;
import com.um.lms.sb.model.staff;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the staff service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see staffUtil
 * @generated
 */
@ProviderType
public interface staffPersistence extends BasePersistence<staff> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link staffUtil} to access the staff persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching staffs
	 */
	public java.util.List<staff> findByUuid(String uuid);

	/**
	 * Returns a range of all the staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @return the range of matching staffs
	 */
	public java.util.List<staff> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching staffs
	 */
	public java.util.List<staff> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator);

	/**
	 * Returns an ordered range of all the staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching staffs
	 */
	public java.util.List<staff> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff
	 * @throws NoSuchstaffException if a matching staff could not be found
	 */
	public staff findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<staff>
				orderByComparator)
		throws NoSuchstaffException;

	/**
	 * Returns the first staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public staff fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator);

	/**
	 * Returns the last staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff
	 * @throws NoSuchstaffException if a matching staff could not be found
	 */
	public staff findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<staff>
				orderByComparator)
		throws NoSuchstaffException;

	/**
	 * Returns the last staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public staff fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator);

	/**
	 * Returns the staffs before and after the current staff in the ordered set where uuid = &#63;.
	 *
	 * @param staffID the primary key of the current staff
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next staff
	 * @throws NoSuchstaffException if a staff with the primary key could not be found
	 */
	public staff[] findByUuid_PrevAndNext(
			long staffID, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<staff>
				orderByComparator)
		throws NoSuchstaffException;

	/**
	 * Removes all the staffs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching staffs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the staff where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchstaffException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching staff
	 * @throws NoSuchstaffException if a matching staff could not be found
	 */
	public staff findByUUID_G(String uuid, long groupId)
		throws NoSuchstaffException;

	/**
	 * Returns the staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public staff fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public staff fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the staff where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the staff that was removed
	 */
	public staff removeByUUID_G(String uuid, long groupId)
		throws NoSuchstaffException;

	/**
	 * Returns the number of staffs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching staffs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching staffs
	 */
	public java.util.List<staff> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @return the range of matching staffs
	 */
	public java.util.List<staff> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching staffs
	 */
	public java.util.List<staff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator);

	/**
	 * Returns an ordered range of all the staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching staffs
	 */
	public java.util.List<staff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff
	 * @throws NoSuchstaffException if a matching staff could not be found
	 */
	public staff findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<staff>
				orderByComparator)
		throws NoSuchstaffException;

	/**
	 * Returns the first staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public staff fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator);

	/**
	 * Returns the last staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff
	 * @throws NoSuchstaffException if a matching staff could not be found
	 */
	public staff findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<staff>
				orderByComparator)
		throws NoSuchstaffException;

	/**
	 * Returns the last staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public staff fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator);

	/**
	 * Returns the staffs before and after the current staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param staffID the primary key of the current staff
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next staff
	 * @throws NoSuchstaffException if a staff with the primary key could not be found
	 */
	public staff[] findByUuid_C_PrevAndNext(
			long staffID, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<staff>
				orderByComparator)
		throws NoSuchstaffException;

	/**
	 * Removes all the staffs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching staffs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the staff in the entity cache if it is enabled.
	 *
	 * @param staff the staff
	 */
	public void cacheResult(staff staff);

	/**
	 * Caches the staffs in the entity cache if it is enabled.
	 *
	 * @param staffs the staffs
	 */
	public void cacheResult(java.util.List<staff> staffs);

	/**
	 * Creates a new staff with the primary key. Does not add the staff to the database.
	 *
	 * @param staffID the primary key for the new staff
	 * @return the new staff
	 */
	public staff create(long staffID);

	/**
	 * Removes the staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param staffID the primary key of the staff
	 * @return the staff that was removed
	 * @throws NoSuchstaffException if a staff with the primary key could not be found
	 */
	public staff remove(long staffID) throws NoSuchstaffException;

	public staff updateImpl(staff staff);

	/**
	 * Returns the staff with the primary key or throws a <code>NoSuchstaffException</code> if it could not be found.
	 *
	 * @param staffID the primary key of the staff
	 * @return the staff
	 * @throws NoSuchstaffException if a staff with the primary key could not be found
	 */
	public staff findByPrimaryKey(long staffID) throws NoSuchstaffException;

	/**
	 * Returns the staff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param staffID the primary key of the staff
	 * @return the staff, or <code>null</code> if a staff with the primary key could not be found
	 */
	public staff fetchByPrimaryKey(long staffID);

	/**
	 * Returns all the staffs.
	 *
	 * @return the staffs
	 */
	public java.util.List<staff> findAll();

	/**
	 * Returns a range of all the staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @return the range of staffs
	 */
	public java.util.List<staff> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of staffs
	 */
	public java.util.List<staff> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator);

	/**
	 * Returns an ordered range of all the staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>staffModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of staffs
	 */
	public java.util.List<staff> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<staff>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the staffs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of staffs.
	 *
	 * @return the number of staffs
	 */
	public int countAll();

}