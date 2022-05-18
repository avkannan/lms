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

package com.um.lms.sb.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.um.lms.sb.model.lookup;
import com.um.lms.sb.service.lookupService;
import com.um.lms.sb.service.persistence.authorPersistence;
import com.um.lms.sb.service.persistence.bookPersistence;
import com.um.lms.sb.service.persistence.lookupPersistence;
import com.um.lms.sb.service.persistence.publicationPersistence;
import com.um.lms.sb.service.persistence.staffPersistence;
import com.um.lms.sb.service.persistence.studentPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the lookup remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.um.lms.sb.service.impl.lookupServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.um.lms.sb.service.impl.lookupServiceImpl
 * @generated
 */
public abstract class lookupServiceBaseImpl
	extends BaseServiceImpl
	implements lookupService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>lookupService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.um.lms.sb.service.lookupServiceUtil</code>.
	 */
	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			lookupService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		lookupService = (lookupService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return lookupService.class.getName();
	}

	protected Class<?> getModelClass() {
		return lookup.class;
	}

	protected String getModelClassName() {
		return lookup.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = lookupPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@Reference
	protected authorPersistence authorPersistence;

	@Reference
	protected bookPersistence bookPersistence;

	@Reference
	protected com.um.lms.sb.service.lookupLocalService lookupLocalService;

	protected lookupService lookupService;

	@Reference
	protected lookupPersistence lookupPersistence;

	@Reference
	protected publicationPersistence publicationPersistence;

	@Reference
	protected staffPersistence staffPersistence;

	@Reference
	protected studentPersistence studentPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

}