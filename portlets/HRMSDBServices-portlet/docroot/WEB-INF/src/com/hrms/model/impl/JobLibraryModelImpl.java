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

import com.hrms.model.JobLibrary;
import com.hrms.model.JobLibraryModel;
import com.hrms.model.JobLibrarySoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the JobLibrary service. Represents a row in the &quot;HRMS_JobLibrary&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hrms.model.JobLibraryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JobLibraryImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see JobLibraryImpl
 * @see com.hrms.model.JobLibrary
 * @see com.hrms.model.JobLibraryModel
 * @generated
 */
@JSON(strict = true)
public class JobLibraryModelImpl extends BaseModelImpl<JobLibrary>
	implements JobLibraryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a job library model instance should use the {@link com.hrms.model.JobLibrary} interface instead.
	 */
	public static final String TABLE_NAME = "HRMS_JobLibrary";
	public static final Object[][] TABLE_COLUMNS = {
			{ "jobLibraryId", Types.BIGINT },
			{ "employeeDepartmentId", Types.BIGINT },
			{ "jobTitle", Types.VARCHAR },
			{ "jobDescription", Types.VARCHAR },
			{ "responsibility", Types.VARCHAR },
			{ "qualifications", Types.VARCHAR },
			{ "numberOfPosition", Types.INTEGER },
			{ "experience", Types.VARCHAR },
			{ "salaryStartRange", Types.BIGINT },
			{ "salaryEndRange", Types.BIGINT },
			{ "benefits", Types.VARCHAR },
			{ "reportsToId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "createBy", Types.BIGINT },
			{ "modifiedBy", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table HRMS_JobLibrary (jobLibraryId LONG not null primary key,employeeDepartmentId LONG,jobTitle VARCHAR(75) null,jobDescription VARCHAR(75) null,responsibility VARCHAR(75) null,qualifications VARCHAR(75) null,numberOfPosition INTEGER,experience VARCHAR(75) null,salaryStartRange LONG,salaryEndRange LONG,benefits VARCHAR(75) null,reportsToId LONG,createDate DATE null,modifiedDate DATE null,createBy LONG,modifiedBy LONG)";
	public static final String TABLE_SQL_DROP = "drop table HRMS_JobLibrary";
	public static final String ORDER_BY_JPQL = " ORDER BY jobLibrary.jobLibraryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HRMS_JobLibrary.jobLibraryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hrms.model.JobLibrary"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hrms.model.JobLibrary"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static JobLibrary toModel(JobLibrarySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		JobLibrary model = new JobLibraryImpl();

		model.setJobLibraryId(soapModel.getJobLibraryId());
		model.setEmployeeDepartmentId(soapModel.getEmployeeDepartmentId());
		model.setJobTitle(soapModel.getJobTitle());
		model.setJobDescription(soapModel.getJobDescription());
		model.setResponsibility(soapModel.getResponsibility());
		model.setQualifications(soapModel.getQualifications());
		model.setNumberOfPosition(soapModel.getNumberOfPosition());
		model.setExperience(soapModel.getExperience());
		model.setSalaryStartRange(soapModel.getSalaryStartRange());
		model.setSalaryEndRange(soapModel.getSalaryEndRange());
		model.setBenefits(soapModel.getBenefits());
		model.setReportsToId(soapModel.getReportsToId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCreateBy(soapModel.getCreateBy());
		model.setModifiedBy(soapModel.getModifiedBy());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<JobLibrary> toModels(JobLibrarySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<JobLibrary> models = new ArrayList<JobLibrary>(soapModels.length);

		for (JobLibrarySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hrms.model.JobLibrary"));

	public JobLibraryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _jobLibraryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJobLibraryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jobLibraryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return JobLibrary.class;
	}

	@Override
	public String getModelClassName() {
		return JobLibrary.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobLibraryId", getJobLibraryId());
		attributes.put("employeeDepartmentId", getEmployeeDepartmentId());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("jobDescription", getJobDescription());
		attributes.put("responsibility", getResponsibility());
		attributes.put("qualifications", getQualifications());
		attributes.put("numberOfPosition", getNumberOfPosition());
		attributes.put("experience", getExperience());
		attributes.put("salaryStartRange", getSalaryStartRange());
		attributes.put("salaryEndRange", getSalaryEndRange());
		attributes.put("benefits", getBenefits());
		attributes.put("reportsToId", getReportsToId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobLibraryId = (Long)attributes.get("jobLibraryId");

		if (jobLibraryId != null) {
			setJobLibraryId(jobLibraryId);
		}

		Long employeeDepartmentId = (Long)attributes.get("employeeDepartmentId");

		if (employeeDepartmentId != null) {
			setEmployeeDepartmentId(employeeDepartmentId);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String jobDescription = (String)attributes.get("jobDescription");

		if (jobDescription != null) {
			setJobDescription(jobDescription);
		}

		String responsibility = (String)attributes.get("responsibility");

		if (responsibility != null) {
			setResponsibility(responsibility);
		}

		String qualifications = (String)attributes.get("qualifications");

		if (qualifications != null) {
			setQualifications(qualifications);
		}

		Integer numberOfPosition = (Integer)attributes.get("numberOfPosition");

		if (numberOfPosition != null) {
			setNumberOfPosition(numberOfPosition);
		}

		String experience = (String)attributes.get("experience");

		if (experience != null) {
			setExperience(experience);
		}

		Long salaryStartRange = (Long)attributes.get("salaryStartRange");

		if (salaryStartRange != null) {
			setSalaryStartRange(salaryStartRange);
		}

		Long salaryEndRange = (Long)attributes.get("salaryEndRange");

		if (salaryEndRange != null) {
			setSalaryEndRange(salaryEndRange);
		}

		String benefits = (String)attributes.get("benefits");

		if (benefits != null) {
			setBenefits(benefits);
		}

		Long reportsToId = (Long)attributes.get("reportsToId");

		if (reportsToId != null) {
			setReportsToId(reportsToId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long createBy = (Long)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	@JSON
	@Override
	public long getJobLibraryId() {
		return _jobLibraryId;
	}

	@Override
	public void setJobLibraryId(long jobLibraryId) {
		_jobLibraryId = jobLibraryId;
	}

	@JSON
	@Override
	public long getEmployeeDepartmentId() {
		return _employeeDepartmentId;
	}

	@Override
	public void setEmployeeDepartmentId(long employeeDepartmentId) {
		_employeeDepartmentId = employeeDepartmentId;
	}

	@JSON
	@Override
	public String getJobTitle() {
		if (_jobTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _jobTitle;
		}
	}

	@Override
	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	@JSON
	@Override
	public String getJobDescription() {
		if (_jobDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _jobDescription;
		}
	}

	@Override
	public void setJobDescription(String jobDescription) {
		_jobDescription = jobDescription;
	}

	@JSON
	@Override
	public String getResponsibility() {
		if (_responsibility == null) {
			return StringPool.BLANK;
		}
		else {
			return _responsibility;
		}
	}

	@Override
	public void setResponsibility(String responsibility) {
		_responsibility = responsibility;
	}

	@JSON
	@Override
	public String getQualifications() {
		if (_qualifications == null) {
			return StringPool.BLANK;
		}
		else {
			return _qualifications;
		}
	}

	@Override
	public void setQualifications(String qualifications) {
		_qualifications = qualifications;
	}

	@JSON
	@Override
	public int getNumberOfPosition() {
		return _numberOfPosition;
	}

	@Override
	public void setNumberOfPosition(int numberOfPosition) {
		_numberOfPosition = numberOfPosition;
	}

	@JSON
	@Override
	public String getExperience() {
		if (_experience == null) {
			return StringPool.BLANK;
		}
		else {
			return _experience;
		}
	}

	@Override
	public void setExperience(String experience) {
		_experience = experience;
	}

	@JSON
	@Override
	public long getSalaryStartRange() {
		return _salaryStartRange;
	}

	@Override
	public void setSalaryStartRange(long salaryStartRange) {
		_salaryStartRange = salaryStartRange;
	}

	@JSON
	@Override
	public long getSalaryEndRange() {
		return _salaryEndRange;
	}

	@Override
	public void setSalaryEndRange(long salaryEndRange) {
		_salaryEndRange = salaryEndRange;
	}

	@JSON
	@Override
	public String getBenefits() {
		if (_benefits == null) {
			return StringPool.BLANK;
		}
		else {
			return _benefits;
		}
	}

	@Override
	public void setBenefits(String benefits) {
		_benefits = benefits;
	}

	@JSON
	@Override
	public long getReportsToId() {
		return _reportsToId;
	}

	@Override
	public void setReportsToId(long reportsToId) {
		_reportsToId = reportsToId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getCreateBy() {
		return _createBy;
	}

	@Override
	public void setCreateBy(long createBy) {
		_createBy = createBy;
	}

	@JSON
	@Override
	public long getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			JobLibrary.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public JobLibrary toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (JobLibrary)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		JobLibraryImpl jobLibraryImpl = new JobLibraryImpl();

		jobLibraryImpl.setJobLibraryId(getJobLibraryId());
		jobLibraryImpl.setEmployeeDepartmentId(getEmployeeDepartmentId());
		jobLibraryImpl.setJobTitle(getJobTitle());
		jobLibraryImpl.setJobDescription(getJobDescription());
		jobLibraryImpl.setResponsibility(getResponsibility());
		jobLibraryImpl.setQualifications(getQualifications());
		jobLibraryImpl.setNumberOfPosition(getNumberOfPosition());
		jobLibraryImpl.setExperience(getExperience());
		jobLibraryImpl.setSalaryStartRange(getSalaryStartRange());
		jobLibraryImpl.setSalaryEndRange(getSalaryEndRange());
		jobLibraryImpl.setBenefits(getBenefits());
		jobLibraryImpl.setReportsToId(getReportsToId());
		jobLibraryImpl.setCreateDate(getCreateDate());
		jobLibraryImpl.setModifiedDate(getModifiedDate());
		jobLibraryImpl.setCreateBy(getCreateBy());
		jobLibraryImpl.setModifiedBy(getModifiedBy());

		jobLibraryImpl.resetOriginalValues();

		return jobLibraryImpl;
	}

	@Override
	public int compareTo(JobLibrary jobLibrary) {
		long primaryKey = jobLibrary.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobLibrary)) {
			return false;
		}

		JobLibrary jobLibrary = (JobLibrary)obj;

		long primaryKey = jobLibrary.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<JobLibrary> toCacheModel() {
		JobLibraryCacheModel jobLibraryCacheModel = new JobLibraryCacheModel();

		jobLibraryCacheModel.jobLibraryId = getJobLibraryId();

		jobLibraryCacheModel.employeeDepartmentId = getEmployeeDepartmentId();

		jobLibraryCacheModel.jobTitle = getJobTitle();

		String jobTitle = jobLibraryCacheModel.jobTitle;

		if ((jobTitle != null) && (jobTitle.length() == 0)) {
			jobLibraryCacheModel.jobTitle = null;
		}

		jobLibraryCacheModel.jobDescription = getJobDescription();

		String jobDescription = jobLibraryCacheModel.jobDescription;

		if ((jobDescription != null) && (jobDescription.length() == 0)) {
			jobLibraryCacheModel.jobDescription = null;
		}

		jobLibraryCacheModel.responsibility = getResponsibility();

		String responsibility = jobLibraryCacheModel.responsibility;

		if ((responsibility != null) && (responsibility.length() == 0)) {
			jobLibraryCacheModel.responsibility = null;
		}

		jobLibraryCacheModel.qualifications = getQualifications();

		String qualifications = jobLibraryCacheModel.qualifications;

		if ((qualifications != null) && (qualifications.length() == 0)) {
			jobLibraryCacheModel.qualifications = null;
		}

		jobLibraryCacheModel.numberOfPosition = getNumberOfPosition();

		jobLibraryCacheModel.experience = getExperience();

		String experience = jobLibraryCacheModel.experience;

		if ((experience != null) && (experience.length() == 0)) {
			jobLibraryCacheModel.experience = null;
		}

		jobLibraryCacheModel.salaryStartRange = getSalaryStartRange();

		jobLibraryCacheModel.salaryEndRange = getSalaryEndRange();

		jobLibraryCacheModel.benefits = getBenefits();

		String benefits = jobLibraryCacheModel.benefits;

		if ((benefits != null) && (benefits.length() == 0)) {
			jobLibraryCacheModel.benefits = null;
		}

		jobLibraryCacheModel.reportsToId = getReportsToId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			jobLibraryCacheModel.createDate = createDate.getTime();
		}
		else {
			jobLibraryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			jobLibraryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			jobLibraryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		jobLibraryCacheModel.createBy = getCreateBy();

		jobLibraryCacheModel.modifiedBy = getModifiedBy();

		return jobLibraryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{jobLibraryId=");
		sb.append(getJobLibraryId());
		sb.append(", employeeDepartmentId=");
		sb.append(getEmployeeDepartmentId());
		sb.append(", jobTitle=");
		sb.append(getJobTitle());
		sb.append(", jobDescription=");
		sb.append(getJobDescription());
		sb.append(", responsibility=");
		sb.append(getResponsibility());
		sb.append(", qualifications=");
		sb.append(getQualifications());
		sb.append(", numberOfPosition=");
		sb.append(getNumberOfPosition());
		sb.append(", experience=");
		sb.append(getExperience());
		sb.append(", salaryStartRange=");
		sb.append(getSalaryStartRange());
		sb.append(", salaryEndRange=");
		sb.append(getSalaryEndRange());
		sb.append(", benefits=");
		sb.append(getBenefits());
		sb.append(", reportsToId=");
		sb.append(getReportsToId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", createBy=");
		sb.append(getCreateBy());
		sb.append(", modifiedBy=");
		sb.append(getModifiedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.JobLibrary");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jobLibraryId</column-name><column-value><![CDATA[");
		sb.append(getJobLibraryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeDepartmentId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobTitle</column-name><column-value><![CDATA[");
		sb.append(getJobTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobDescription</column-name><column-value><![CDATA[");
		sb.append(getJobDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responsibility</column-name><column-value><![CDATA[");
		sb.append(getResponsibility());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>qualifications</column-name><column-value><![CDATA[");
		sb.append(getQualifications());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPosition</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>experience</column-name><column-value><![CDATA[");
		sb.append(getExperience());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salaryStartRange</column-name><column-value><![CDATA[");
		sb.append(getSalaryStartRange());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salaryEndRange</column-name><column-value><![CDATA[");
		sb.append(getSalaryEndRange());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefits</column-name><column-value><![CDATA[");
		sb.append(getBenefits());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportsToId</column-name><column-value><![CDATA[");
		sb.append(getReportsToId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createBy</column-name><column-value><![CDATA[");
		sb.append(getCreateBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = JobLibrary.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			JobLibrary.class
		};
	private long _jobLibraryId;
	private long _employeeDepartmentId;
	private String _jobTitle;
	private String _jobDescription;
	private String _responsibility;
	private String _qualifications;
	private int _numberOfPosition;
	private String _experience;
	private long _salaryStartRange;
	private long _salaryEndRange;
	private String _benefits;
	private long _reportsToId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private JobLibrary _escapedModel;
}