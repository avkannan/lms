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

import com.um.lms.sb.exception.NoSuchlendingException;
import com.um.lms.sb.model.lending;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the lending service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see lendingUtil
 * @generated
 */
@ProviderType
public interface lendingPersistence extends BasePersistence<lending> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link lendingUtil} to access the lending persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the lendings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching lendings
	 */
	public java.util.List<lending> findByUuid(String uuid);

	/**
	 * Returns a range of all the lendings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @return the range of matching lendings
	 */
	public java.util.List<lending> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the lendings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lendings
	 */
	public java.util.List<lending> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lendings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching lendings
	 */
	public java.util.List<lending> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first lending in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lending
	 * @throws NoSuchlendingException if a matching lending could not be found
	 */
	public lending findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<lending>
				orderByComparator)
		throws NoSuchlendingException;

	/**
	 * Returns the first lending in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lending, or <code>null</code> if a matching lending could not be found
	 */
	public lending fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator);

	/**
	 * Returns the last lending in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lending
	 * @throws NoSuchlendingException if a matching lending could not be found
	 */
	public lending findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<lending>
				orderByComparator)
		throws NoSuchlendingException;

	/**
	 * Returns the last lending in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lending, or <code>null</code> if a matching lending could not be found
	 */
	public lending fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator);

	/**
	 * Returns the lendings before and after the current lending in the ordered set where uuid = &#63;.
	 *
	 * @param lendingID the primary key of the current lending
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lending
	 * @throws NoSuchlendingException if a lending with the primary key could not be found
	 */
	public lending[] findByUuid_PrevAndNext(
			long lendingID, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<lending>
				orderByComparator)
		throws NoSuchlendingException;

	/**
	 * Removes all the lendings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of lendings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching lendings
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the lending where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchlendingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lending
	 * @throws NoSuchlendingException if a matching lending could not be found
	 */
	public lending findByUUID_G(String uuid, long groupId)
		throws NoSuchlendingException;

	/**
	 * Returns the lending where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lending, or <code>null</code> if a matching lending could not be found
	 */
	public lending fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the lending where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching lending, or <code>null</code> if a matching lending could not be found
	 */
	public lending fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the lending where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the lending that was removed
	 */
	public lending removeByUUID_G(String uuid, long groupId)
		throws NoSuchlendingException;

	/**
	 * Returns the number of lendings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching lendings
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the lendings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching lendings
	 */
	public java.util.List<lending> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the lendings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @return the range of matching lendings
	 */
	public java.util.List<lending> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the lendings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lendings
	 */
	public java.util.List<lending> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lendings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching lendings
	 */
	public java.util.List<lending> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first lending in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lending
	 * @throws NoSuchlendingException if a matching lending could not be found
	 */
	public lending findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<lending>
				orderByComparator)
		throws NoSuchlendingException;

	/**
	 * Returns the first lending in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lending, or <code>null</code> if a matching lending could not be found
	 */
	public lending fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator);

	/**
	 * Returns the last lending in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lending
	 * @throws NoSuchlendingException if a matching lending could not be found
	 */
	public lending findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<lending>
				orderByComparator)
		throws NoSuchlendingException;

	/**
	 * Returns the last lending in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lending, or <code>null</code> if a matching lending could not be found
	 */
	public lending fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator);

	/**
	 * Returns the lendings before and after the current lending in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param lendingID the primary key of the current lending
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lending
	 * @throws NoSuchlendingException if a lending with the primary key could not be found
	 */
	public lending[] findByUuid_C_PrevAndNext(
			long lendingID, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<lending>
				orderByComparator)
		throws NoSuchlendingException;

	/**
	 * Removes all the lendings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of lendings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching lendings
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the lending in the entity cache if it is enabled.
	 *
	 * @param lending the lending
	 */
	public void cacheResult(lending lending);

	/**
	 * Caches the lendings in the entity cache if it is enabled.
	 *
	 * @param lendings the lendings
	 */
	public void cacheResult(java.util.List<lending> lendings);

	/**
	 * Creates a new lending with the primary key. Does not add the lending to the database.
	 *
	 * @param lendingID the primary key for the new lending
	 * @return the new lending
	 */
	public lending create(long lendingID);

	/**
	 * Removes the lending with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lendingID the primary key of the lending
	 * @return the lending that was removed
	 * @throws NoSuchlendingException if a lending with the primary key could not be found
	 */
	public lending remove(long lendingID) throws NoSuchlendingException;

	public lending updateImpl(lending lending);

	/**
	 * Returns the lending with the primary key or throws a <code>NoSuchlendingException</code> if it could not be found.
	 *
	 * @param lendingID the primary key of the lending
	 * @return the lending
	 * @throws NoSuchlendingException if a lending with the primary key could not be found
	 */
	public lending findByPrimaryKey(long lendingID)
		throws NoSuchlendingException;

	/**
	 * Returns the lending with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lendingID the primary key of the lending
	 * @return the lending, or <code>null</code> if a lending with the primary key could not be found
	 */
	public lending fetchByPrimaryKey(long lendingID);

	/**
	 * Returns all the lendings.
	 *
	 * @return the lendings
	 */
	public java.util.List<lending> findAll();

	/**
	 * Returns a range of all the lendings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @return the range of lendings
	 */
	public java.util.List<lending> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the lendings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lendings
	 */
	public java.util.List<lending> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lendings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lendingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lendings
	 * @param end the upper bound of the range of lendings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of lendings
	 */
	public java.util.List<lending> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lending>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the lendings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of lendings.
	 *
	 * @return the number of lendings
	 */
	public int countAll();

}