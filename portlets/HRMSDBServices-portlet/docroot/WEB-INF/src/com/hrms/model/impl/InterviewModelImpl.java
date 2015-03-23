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

import com.hrms.model.Interview;
import com.hrms.model.InterviewModel;
import com.hrms.model.InterviewSoap;

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
 * The base model implementation for the Interview service. Represents a row in the &quot;HRMS_Interview&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hrms.model.InterviewModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InterviewImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see InterviewImpl
 * @see com.hrms.model.Interview
 * @see com.hrms.model.InterviewModel
 * @generated
 */
@JSON(strict = true)
public class InterviewModelImpl extends BaseModelImpl<Interview>
	implements InterviewModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a interview model instance should use the {@link com.hrms.model.Interview} interface instead.
	 */
	public static final String TABLE_NAME = "HRMS_Interview";
	public static final Object[][] TABLE_COLUMNS = {
			{ "InterviewId", Types.BIGINT },
			{ "candidateId", Types.BIGINT },
			{ "jobLibraryId", Types.BIGINT },
			{ "roundNumber", Types.BIGINT },
			{ "roundType", Types.VARCHAR },
			{ "InterviewerId", Types.BIGINT },
			{ "interviewDate", Types.TIMESTAMP },
			{ "result", Types.BOOLEAN },
			{ "remarks", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "createBy", Types.BIGINT },
			{ "modifiedBy", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table HRMS_Interview (InterviewId LONG not null primary key,candidateId LONG,jobLibraryId LONG,roundNumber LONG,roundType VARCHAR(75) null,InterviewerId LONG,interviewDate DATE null,result BOOLEAN,remarks VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,createBy LONG,modifiedBy LONG)";
	public static final String TABLE_SQL_DROP = "drop table HRMS_Interview";
	public static final String ORDER_BY_JPQL = " ORDER BY interview.InterviewId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HRMS_Interview.InterviewId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hrms.model.Interview"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hrms.model.Interview"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Interview toModel(InterviewSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Interview model = new InterviewImpl();

		model.setInterviewId(soapModel.getInterviewId());
		model.setCandidateId(soapModel.getCandidateId());
		model.setJobLibraryId(soapModel.getJobLibraryId());
		model.setRoundNumber(soapModel.getRoundNumber());
		model.setRoundType(soapModel.getRoundType());
		model.setInterviewerId(soapModel.getInterviewerId());
		model.setInterviewDate(soapModel.getInterviewDate());
		model.setResult(soapModel.getResult());
		model.setRemarks(soapModel.getRemarks());
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
	public static List<Interview> toModels(InterviewSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Interview> models = new ArrayList<Interview>(soapModels.length);

		for (InterviewSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hrms.model.Interview"));

	public InterviewModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _InterviewId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInterviewId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _InterviewId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Interview.class;
	}

	@Override
	public String getModelClassName() {
		return Interview.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("InterviewId", getInterviewId());
		attributes.put("candidateId", getCandidateId());
		attributes.put("jobLibraryId", getJobLibraryId());
		attributes.put("roundNumber", getRoundNumber());
		attributes.put("roundType", getRoundType());
		attributes.put("InterviewerId", getInterviewerId());
		attributes.put("interviewDate", getInterviewDate());
		attributes.put("result", getResult());
		attributes.put("remarks", getRemarks());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long InterviewId = (Long)attributes.get("InterviewId");

		if (InterviewId != null) {
			setInterviewId(InterviewId);
		}

		Long candidateId = (Long)attributes.get("candidateId");

		if (candidateId != null) {
			setCandidateId(candidateId);
		}

		Long jobLibraryId = (Long)attributes.get("jobLibraryId");

		if (jobLibraryId != null) {
			setJobLibraryId(jobLibraryId);
		}

		Long roundNumber = (Long)attributes.get("roundNumber");

		if (roundNumber != null) {
			setRoundNumber(roundNumber);
		}

		String roundType = (String)attributes.get("roundType");

		if (roundType != null) {
			setRoundType(roundType);
		}

		Long InterviewerId = (Long)attributes.get("InterviewerId");

		if (InterviewerId != null) {
			setInterviewerId(InterviewerId);
		}

		Date interviewDate = (Date)attributes.get("interviewDate");

		if (interviewDate != null) {
			setInterviewDate(interviewDate);
		}

		Boolean result = (Boolean)attributes.get("result");

		if (result != null) {
			setResult(result);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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
	public long getInterviewId() {
		return _InterviewId;
	}

	@Override
	public void setInterviewId(long InterviewId) {
		_InterviewId = InterviewId;
	}

	@JSON
	@Override
	public long getCandidateId() {
		return _candidateId;
	}

	@Override
	public void setCandidateId(long candidateId) {
		_candidateId = candidateId;
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
	public long getRoundNumber() {
		return _roundNumber;
	}

	@Override
	public void setRoundNumber(long roundNumber) {
		_roundNumber = roundNumber;
	}

	@JSON
	@Override
	public String getRoundType() {
		if (_roundType == null) {
			return StringPool.BLANK;
		}
		else {
			return _roundType;
		}
	}

	@Override
	public void setRoundType(String roundType) {
		_roundType = roundType;
	}

	@JSON
	@Override
	public long getInterviewerId() {
		return _InterviewerId;
	}

	@Override
	public void setInterviewerId(long InterviewerId) {
		_InterviewerId = InterviewerId;
	}

	@JSON
	@Override
	public Date getInterviewDate() {
		return _interviewDate;
	}

	@Override
	public void setInterviewDate(Date interviewDate) {
		_interviewDate = interviewDate;
	}

	@JSON
	@Override
	public boolean getResult() {
		return _result;
	}

	@Override
	public boolean isResult() {
		return _result;
	}

	@Override
	public void setResult(boolean result) {
		_result = result;
	}

	@JSON
	@Override
	public String getRemarks() {
		if (_remarks == null) {
			return StringPool.BLANK;
		}
		else {
			return _remarks;
		}
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;
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
			Interview.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Interview toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Interview)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		InterviewImpl interviewImpl = new InterviewImpl();

		interviewImpl.setInterviewId(getInterviewId());
		interviewImpl.setCandidateId(getCandidateId());
		interviewImpl.setJobLibraryId(getJobLibraryId());
		interviewImpl.setRoundNumber(getRoundNumber());
		interviewImpl.setRoundType(getRoundType());
		interviewImpl.setInterviewerId(getInterviewerId());
		interviewImpl.setInterviewDate(getInterviewDate());
		interviewImpl.setResult(getResult());
		interviewImpl.setRemarks(getRemarks());
		interviewImpl.setCreateDate(getCreateDate());
		interviewImpl.setModifiedDate(getModifiedDate());
		interviewImpl.setCreateBy(getCreateBy());
		interviewImpl.setModifiedBy(getModifiedBy());

		interviewImpl.resetOriginalValues();

		return interviewImpl;
	}

	@Override
	public int compareTo(Interview interview) {
		long primaryKey = interview.getPrimaryKey();

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

		if (!(obj instanceof Interview)) {
			return false;
		}

		Interview interview = (Interview)obj;

		long primaryKey = interview.getPrimaryKey();

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
	public CacheModel<Interview> toCacheModel() {
		InterviewCacheModel interviewCacheModel = new InterviewCacheModel();

		interviewCacheModel.InterviewId = getInterviewId();

		interviewCacheModel.candidateId = getCandidateId();

		interviewCacheModel.jobLibraryId = getJobLibraryId();

		interviewCacheModel.roundNumber = getRoundNumber();

		interviewCacheModel.roundType = getRoundType();

		String roundType = interviewCacheModel.roundType;

		if ((roundType != null) && (roundType.length() == 0)) {
			interviewCacheModel.roundType = null;
		}

		interviewCacheModel.InterviewerId = getInterviewerId();

		Date interviewDate = getInterviewDate();

		if (interviewDate != null) {
			interviewCacheModel.interviewDate = interviewDate.getTime();
		}
		else {
			interviewCacheModel.interviewDate = Long.MIN_VALUE;
		}

		interviewCacheModel.result = getResult();

		interviewCacheModel.remarks = getRemarks();

		String remarks = interviewCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			interviewCacheModel.remarks = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			interviewCacheModel.createDate = createDate.getTime();
		}
		else {
			interviewCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			interviewCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			interviewCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		interviewCacheModel.createBy = getCreateBy();

		interviewCacheModel.modifiedBy = getModifiedBy();

		return interviewCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{InterviewId=");
		sb.append(getInterviewId());
		sb.append(", candidateId=");
		sb.append(getCandidateId());
		sb.append(", jobLibraryId=");
		sb.append(getJobLibraryId());
		sb.append(", roundNumber=");
		sb.append(getRoundNumber());
		sb.append(", roundType=");
		sb.append(getRoundType());
		sb.append(", InterviewerId=");
		sb.append(getInterviewerId());
		sb.append(", interviewDate=");
		sb.append(getInterviewDate());
		sb.append(", result=");
		sb.append(getResult());
		sb.append(", remarks=");
		sb.append(getRemarks());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.Interview");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>InterviewId</column-name><column-value><![CDATA[");
		sb.append(getInterviewId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>candidateId</column-name><column-value><![CDATA[");
		sb.append(getCandidateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobLibraryId</column-name><column-value><![CDATA[");
		sb.append(getJobLibraryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roundNumber</column-name><column-value><![CDATA[");
		sb.append(getRoundNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roundType</column-name><column-value><![CDATA[");
		sb.append(getRoundType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>InterviewerId</column-name><column-value><![CDATA[");
		sb.append(getInterviewerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>interviewDate</column-name><column-value><![CDATA[");
		sb.append(getInterviewDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>result</column-name><column-value><![CDATA[");
		sb.append(getResult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
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

	private static ClassLoader _classLoader = Interview.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Interview.class
		};
	private long _InterviewId;
	private long _candidateId;
	private long _jobLibraryId;
	private long _roundNumber;
	private String _roundType;
	private long _InterviewerId;
	private Date _interviewDate;
	private boolean _result;
	private String _remarks;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private Interview _escapedModel;
}