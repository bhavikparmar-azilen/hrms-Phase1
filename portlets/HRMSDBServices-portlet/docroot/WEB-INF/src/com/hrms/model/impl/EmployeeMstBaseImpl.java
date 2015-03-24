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

package com.hrms.model.impl;

import com.hrms.model.EmployeeMst;

import com.hrms.service.EmployeeMstLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the EmployeeMst service. Represents a row in the &quot;HRMS_EmployeeMst&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeMstImpl}.
 * </p>
 *
 * @author bhavik
 * @see EmployeeMstImpl
 * @see com.hrms.model.EmployeeMst
 * @generated
 */
public abstract class EmployeeMstBaseImpl extends EmployeeMstModelImpl
	implements EmployeeMst {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee mst model instance should use the {@link EmployeeMst} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeMstLocalServiceUtil.addEmployeeMst(this);
		}
		else {
			EmployeeMstLocalServiceUtil.updateEmployeeMst(this);
		}
	}
}