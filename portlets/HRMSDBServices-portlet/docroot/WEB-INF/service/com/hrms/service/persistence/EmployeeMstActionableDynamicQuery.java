/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.hrms.service.persistence;

import com.hrms.model.EmployeeMst;

import com.hrms.service.EmployeeMstLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author bhavik
 * @generated
 */
public abstract class EmployeeMstActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public EmployeeMstActionableDynamicQuery() throws SystemException {
		setBaseLocalService(EmployeeMstLocalServiceUtil.getService());
		setClass(EmployeeMst.class);

		setClassLoader(com.hrms.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("employeeMstId");
	}
}