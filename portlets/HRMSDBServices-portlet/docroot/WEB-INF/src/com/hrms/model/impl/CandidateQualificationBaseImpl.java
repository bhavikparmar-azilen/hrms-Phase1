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

import com.hrms.model.CandidateQualification;

import com.hrms.service.CandidateQualificationLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the CandidateQualification service. Represents a row in the &quot;HRMS_CandidateQualification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CandidateQualificationImpl}.
 * </p>
 *
 * @author bhavik
 * @see CandidateQualificationImpl
 * @see com.hrms.model.CandidateQualification
 * @generated
 */
public abstract class CandidateQualificationBaseImpl
	extends CandidateQualificationModelImpl implements CandidateQualification {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a candidate qualification model instance should use the {@link CandidateQualification} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CandidateQualificationLocalServiceUtil.addCandidateQualification(this);
		}
		else {
			CandidateQualificationLocalServiceUtil.updateCandidateQualification(this);
		}
	}
}