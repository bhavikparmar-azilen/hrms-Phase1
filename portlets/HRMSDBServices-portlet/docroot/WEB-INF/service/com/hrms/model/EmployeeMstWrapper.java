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

package com.hrms.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeMst}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeMst
 * @generated
 */
public class EmployeeMstWrapper implements EmployeeMst,
	ModelWrapper<EmployeeMst> {
	public EmployeeMstWrapper(EmployeeMst employeeMst) {
		_employeeMst = employeeMst;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeMst.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeMst.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeMstId", getEmployeeMstId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("gender", getGender());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("joiningDate", getJoiningDate());
		attributes.put("leavingDate", getLeavingDate());
		attributes.put("maritualStatus", getMaritualStatus());
		attributes.put("nationality", getNationality());
		attributes.put("employeeDesignationId", getEmployeeDesignationId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("employeeTypeId", getEmployeeTypeId());
		attributes.put("employeeProofId", getEmployeeProofId());
		attributes.put("proofNumber", getProofNumber());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeMstId = (Long)attributes.get("employeeMstId");

		if (employeeMstId != null) {
			setEmployeeMstId(employeeMstId);
		}

		String employeeId = (String)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer gender = (Integer)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		Date joiningDate = (Date)attributes.get("joiningDate");

		if (joiningDate != null) {
			setJoiningDate(joiningDate);
		}

		Date leavingDate = (Date)attributes.get("leavingDate");

		if (leavingDate != null) {
			setLeavingDate(leavingDate);
		}

		Integer maritualStatus = (Integer)attributes.get("maritualStatus");

		if (maritualStatus != null) {
			setMaritualStatus(maritualStatus);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		Integer employeeDesignationId = (Integer)attributes.get(
				"employeeDesignationId");

		if (employeeDesignationId != null) {
			setEmployeeDesignationId(employeeDesignationId);
		}

		Integer employeeDepartmentId = (Integer)attributes.get(
				"employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		Integer employeeTypeId = (Integer)attributes.get("employeeTypeId");

		if (employeeTypeId != null) {
			setEmployeeTypeId(employeeTypeId);
		}

		Integer employeeProofId = (Integer)attributes.get("employeeProofId");

		if (employeeProofId != null) {
			setEmployeeProofId(employeeProofId);
		}

		String proofNumber = (String)attributes.get("proofNumber");

		if (proofNumber != null) {
			setProofNumber(proofNumber);
		}

		Integer createBy = (Integer)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		Integer modifiedBy = (Integer)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	/**
	* Returns the primary key of this employee mst.
	*
	* @return the primary key of this employee mst
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeMst.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee mst.
	*
	* @param primaryKey the primary key of this employee mst
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeMst.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee mst ID of this employee mst.
	*
	* @return the employee mst ID of this employee mst
	*/
	@Override
	public long getEmployeeMstId() {
		return _employeeMst.getEmployeeMstId();
	}

	/**
	* Sets the employee mst ID of this employee mst.
	*
	* @param employeeMstId the employee mst ID of this employee mst
	*/
	@Override
	public void setEmployeeMstId(long employeeMstId) {
		_employeeMst.setEmployeeMstId(employeeMstId);
	}

	/**
	* Returns the employee ID of this employee mst.
	*
	* @return the employee ID of this employee mst
	*/
	@Override
	public java.lang.String getEmployeeId() {
		return _employeeMst.getEmployeeId();
	}

	/**
	* Sets the employee ID of this employee mst.
	*
	* @param employeeId the employee ID of this employee mst
	*/
	@Override
	public void setEmployeeId(java.lang.String employeeId) {
		_employeeMst.setEmployeeId(employeeId);
	}

	/**
	* Returns the user ID of this employee mst.
	*
	* @return the user ID of this employee mst
	*/
	@Override
	public long getUserId() {
		return _employeeMst.getUserId();
	}

	/**
	* Sets the user ID of this employee mst.
	*
	* @param userId the user ID of this employee mst
	*/
	@Override
	public void setUserId(long userId) {
		_employeeMst.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee mst.
	*
	* @return the user uuid of this employee mst
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeMst.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee mst.
	*
	* @param userUuid the user uuid of this employee mst
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeMst.setUserUuid(userUuid);
	}

	/**
	* Returns the gender of this employee mst.
	*
	* @return the gender of this employee mst
	*/
	@Override
	public int getGender() {
		return _employeeMst.getGender();
	}

	/**
	* Sets the gender of this employee mst.
	*
	* @param gender the gender of this employee mst
	*/
	@Override
	public void setGender(int gender) {
		_employeeMst.setGender(gender);
	}

	/**
	* Returns the date of birth of this employee mst.
	*
	* @return the date of birth of this employee mst
	*/
	@Override
	public java.util.Date getDateOfBirth() {
		return _employeeMst.getDateOfBirth();
	}

	/**
	* Sets the date of birth of this employee mst.
	*
	* @param dateOfBirth the date of birth of this employee mst
	*/
	@Override
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		_employeeMst.setDateOfBirth(dateOfBirth);
	}

	/**
	* Returns the joining date of this employee mst.
	*
	* @return the joining date of this employee mst
	*/
	@Override
	public java.util.Date getJoiningDate() {
		return _employeeMst.getJoiningDate();
	}

	/**
	* Sets the joining date of this employee mst.
	*
	* @param joiningDate the joining date of this employee mst
	*/
	@Override
	public void setJoiningDate(java.util.Date joiningDate) {
		_employeeMst.setJoiningDate(joiningDate);
	}

	/**
	* Returns the leaving date of this employee mst.
	*
	* @return the leaving date of this employee mst
	*/
	@Override
	public java.util.Date getLeavingDate() {
		return _employeeMst.getLeavingDate();
	}

	/**
	* Sets the leaving date of this employee mst.
	*
	* @param leavingDate the leaving date of this employee mst
	*/
	@Override
	public void setLeavingDate(java.util.Date leavingDate) {
		_employeeMst.setLeavingDate(leavingDate);
	}

	/**
	* Returns the maritual status of this employee mst.
	*
	* @return the maritual status of this employee mst
	*/
	@Override
	public int getMaritualStatus() {
		return _employeeMst.getMaritualStatus();
	}

	/**
	* Sets the maritual status of this employee mst.
	*
	* @param maritualStatus the maritual status of this employee mst
	*/
	@Override
	public void setMaritualStatus(int maritualStatus) {
		_employeeMst.setMaritualStatus(maritualStatus);
	}

	/**
	* Returns the nationality of this employee mst.
	*
	* @return the nationality of this employee mst
	*/
	@Override
	public java.lang.String getNationality() {
		return _employeeMst.getNationality();
	}

	/**
	* Sets the nationality of this employee mst.
	*
	* @param nationality the nationality of this employee mst
	*/
	@Override
	public void setNationality(java.lang.String nationality) {
		_employeeMst.setNationality(nationality);
	}

	/**
	* Returns the employee designation ID of this employee mst.
	*
	* @return the employee designation ID of this employee mst
	*/
	@Override
	public int getEmployeeDesignationId() {
		return _employeeMst.getEmployeeDesignationId();
	}

	/**
	* Sets the employee designation ID of this employee mst.
	*
	* @param employeeDesignationId the employee designation ID of this employee mst
	*/
	@Override
	public void setEmployeeDesignationId(int employeeDesignationId) {
		_employeeMst.setEmployeeDesignationId(employeeDesignationId);
	}

	/**
	* Returns the employee department ID of this employee mst.
	*
	* @return the employee department ID of this employee mst
	*/
	@Override
	public int getEmployeeDepartmentId() {
		return _employeeMst.getEmployeeDepartmentId();
	}

	/**
	* Sets the employee department ID of this employee mst.
	*
	* @param employeeDepartmentId the employee department ID of this employee mst
	*/
	@Override
	public void setEmployeeDepartmentId(int employeeDepartmentId) {
		_employeeMst.setEmployeeDepartmentId(employeeDepartmentId);
	}

	/**
	* Returns the employee type ID of this employee mst.
	*
	* @return the employee type ID of this employee mst
	*/
	@Override
	public int getEmployeeTypeId() {
		return _employeeMst.getEmployeeTypeId();
	}

	/**
	* Sets the employee type ID of this employee mst.
	*
	* @param employeeTypeId the employee type ID of this employee mst
	*/
	@Override
	public void setEmployeeTypeId(int employeeTypeId) {
		_employeeMst.setEmployeeTypeId(employeeTypeId);
	}

	/**
	* Returns the employee proof ID of this employee mst.
	*
	* @return the employee proof ID of this employee mst
	*/
	@Override
	public int getEmployeeProofId() {
		return _employeeMst.getEmployeeProofId();
	}

	/**
	* Sets the employee proof ID of this employee mst.
	*
	* @param employeeProofId the employee proof ID of this employee mst
	*/
	@Override
	public void setEmployeeProofId(int employeeProofId) {
		_employeeMst.setEmployeeProofId(employeeProofId);
	}

	/**
	* Returns the proof number of this employee mst.
	*
	* @return the proof number of this employee mst
	*/
	@Override
	public java.lang.String getProofNumber() {
		return _employeeMst.getProofNumber();
	}

	/**
	* Sets the proof number of this employee mst.
	*
	* @param proofNumber the proof number of this employee mst
	*/
	@Override
	public void setProofNumber(java.lang.String proofNumber) {
		_employeeMst.setProofNumber(proofNumber);
	}

	/**
	* Returns the create by of this employee mst.
	*
	* @return the create by of this employee mst
	*/
	@Override
	public int getCreateBy() {
		return _employeeMst.getCreateBy();
	}

	/**
	* Sets the create by of this employee mst.
	*
	* @param createBy the create by of this employee mst
	*/
	@Override
	public void setCreateBy(int createBy) {
		_employeeMst.setCreateBy(createBy);
	}

	/**
	* Returns the modified by of this employee mst.
	*
	* @return the modified by of this employee mst
	*/
	@Override
	public int getModifiedBy() {
		return _employeeMst.getModifiedBy();
	}

	/**
	* Sets the modified by of this employee mst.
	*
	* @param modifiedBy the modified by of this employee mst
	*/
	@Override
	public void setModifiedBy(int modifiedBy) {
		_employeeMst.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _employeeMst.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeMst.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeMst.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeMst.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeMst.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeMst.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeMst.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeMst.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeMst.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeMst.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeMst.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeMstWrapper((EmployeeMst)_employeeMst.clone());
	}

	@Override
	public int compareTo(com.hrms.model.EmployeeMst employeeMst) {
		return _employeeMst.compareTo(employeeMst);
	}

	@Override
	public int hashCode() {
		return _employeeMst.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hrms.model.EmployeeMst> toCacheModel() {
		return _employeeMst.toCacheModel();
	}

	@Override
	public com.hrms.model.EmployeeMst toEscapedModel() {
		return new EmployeeMstWrapper(_employeeMst.toEscapedModel());
	}

	@Override
	public com.hrms.model.EmployeeMst toUnescapedModel() {
		return new EmployeeMstWrapper(_employeeMst.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeMst.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeMst.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeMst.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeMstWrapper)) {
			return false;
		}

		EmployeeMstWrapper employeeMstWrapper = (EmployeeMstWrapper)obj;

		if (Validator.equals(_employeeMst, employeeMstWrapper._employeeMst)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeMst getWrappedEmployeeMst() {
		return _employeeMst;
	}

	@Override
	public EmployeeMst getWrappedModel() {
		return _employeeMst;
	}

	@Override
	public void resetOriginalValues() {
		_employeeMst.resetOriginalValues();
	}

	private EmployeeMst _employeeMst;
}