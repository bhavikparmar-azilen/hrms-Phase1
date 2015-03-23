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

import com.hrms.model.EmployeeWarning;
import com.hrms.model.EmployeeWarningModel;
import com.hrms.model.EmployeeWarningSoap;

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
 * The base model implementation for the EmployeeWarning service. Represents a row in the &quot;HRMS_EmployeeWarning&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hrms.model.EmployeeWarningModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeWarningImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeWarningImpl
 * @see com.hrms.model.EmployeeWarning
 * @see com.hrms.model.EmployeeWarningModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeWarningModelImpl extends BaseModelImpl<EmployeeWarning>
	implements EmployeeWarningModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee warning model instance should use the {@link com.hrms.model.EmployeeWarning} interface instead.
	 */
	public static final String TABLE_NAME = "HRMS_EmployeeWarning";
	public static final Object[][] TABLE_COLUMNS = {
			{ "employeeWarningId", Types.BIGINT },
			{ "warningTo", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "warningDate", Types.TIMESTAMP },
			{ "warningSubject", Types.VARCHAR },
			{ "status", Types.BOOLEAN },
			{ "warningBy", Types.BIGINT },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "createBy", Types.BIGINT },
			{ "modifiedBy", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table HRMS_EmployeeWarning (employeeWarningId LONG not null primary key,warningTo LONG,groupId LONG,companyId LONG,warningDate DATE null,warningSubject VARCHAR(75) null,status BOOLEAN,warningBy LONG,modifiedDate DATE null,createBy LONG,modifiedBy LONG)";
	public static final String TABLE_SQL_DROP = "drop table HRMS_EmployeeWarning";
	public static final String ORDER_BY_JPQL = " ORDER BY employeeWarning.employeeWarningId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HRMS_EmployeeWarning.employeeWarningId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hrms.model.EmployeeWarning"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hrms.model.EmployeeWarning"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.hrms.model.EmployeeWarning"),
			true);
	public static long CREATEBY_COLUMN_BITMASK = 1L;
	public static long MODIFIEDBY_COLUMN_BITMASK = 2L;
	public static long EMPLOYEEWARNINGID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmployeeWarning toModel(EmployeeWarningSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmployeeWarning model = new EmployeeWarningImpl();

		model.setEmployeeWarningId(soapModel.getEmployeeWarningId());
		model.setWarningTo(soapModel.getWarningTo());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setWarningDate(soapModel.getWarningDate());
		model.setWarningSubject(soapModel.getWarningSubject());
		model.setStatus(soapModel.getStatus());
		model.setWarningBy(soapModel.getWarningBy());
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
	public static List<EmployeeWarning> toModels(
		EmployeeWarningSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmployeeWarning> models = new ArrayList<EmployeeWarning>(soapModels.length);

		for (EmployeeWarningSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hrms.model.EmployeeWarning"));

	public EmployeeWarningModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employeeWarningId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeWarningId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeWarningId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeWarning.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeWarning.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeWarningId", getEmployeeWarningId());
		attributes.put("warningTo", getWarningTo());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("warningDate", getWarningDate());
		attributes.put("warningSubject", getWarningSubject());
		attributes.put("status", getStatus());
		attributes.put("warningBy", getWarningBy());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeWarningId = (Long)attributes.get("employeeWarningId");

		if (employeeWarningId != null) {
			setEmployeeWarningId(employeeWarningId);
		}

		Long warningTo = (Long)attributes.get("warningTo");

		if (warningTo != null) {
			setWarningTo(warningTo);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date warningDate = (Date)attributes.get("warningDate");

		if (warningDate != null) {
			setWarningDate(warningDate);
		}

		String warningSubject = (String)attributes.get("warningSubject");

		if (warningSubject != null) {
			setWarningSubject(warningSubject);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long warningBy = (Long)attributes.get("warningBy");

		if (warningBy != null) {
			setWarningBy(warningBy);
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
	public long getEmployeeWarningId() {
		return _employeeWarningId;
	}

	@Override
	public void setEmployeeWarningId(long employeeWarningId) {
		_employeeWarningId = employeeWarningId;
	}

	@JSON
	@Override
	public long getWarningTo() {
		return _warningTo;
	}

	@Override
	public void setWarningTo(long warningTo) {
		_warningTo = warningTo;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public Date getWarningDate() {
		return _warningDate;
	}

	@Override
	public void setWarningDate(Date warningDate) {
		_warningDate = warningDate;
	}

	@JSON
	@Override
	public String getWarningSubject() {
		if (_warningSubject == null) {
			return StringPool.BLANK;
		}
		else {
			return _warningSubject;
		}
	}

	@Override
	public void setWarningSubject(String warningSubject) {
		_warningSubject = warningSubject;
	}

	@JSON
	@Override
	public boolean getStatus() {
		return _status;
	}

	@Override
	public boolean isStatus() {
		return _status;
	}

	@Override
	public void setStatus(boolean status) {
		_status = status;
	}

	@JSON
	@Override
	public long getWarningBy() {
		return _warningBy;
	}

	@Override
	public void setWarningBy(long warningBy) {
		_warningBy = warningBy;
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
		_columnBitmask |= CREATEBY_COLUMN_BITMASK;

		if (!_setOriginalCreateBy) {
			_setOriginalCreateBy = true;

			_originalCreateBy = _createBy;
		}

		_createBy = createBy;
	}

	public long getOriginalCreateBy() {
		return _originalCreateBy;
	}

	@JSON
	@Override
	public long getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(long modifiedBy) {
		_columnBitmask |= MODIFIEDBY_COLUMN_BITMASK;

		if (!_setOriginalModifiedBy) {
			_setOriginalModifiedBy = true;

			_originalModifiedBy = _modifiedBy;
		}

		_modifiedBy = modifiedBy;
	}

	public long getOriginalModifiedBy() {
		return _originalModifiedBy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EmployeeWarning.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmployeeWarning toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmployeeWarning)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeWarningImpl employeeWarningImpl = new EmployeeWarningImpl();

		employeeWarningImpl.setEmployeeWarningId(getEmployeeWarningId());
		employeeWarningImpl.setWarningTo(getWarningTo());
		employeeWarningImpl.setGroupId(getGroupId());
		employeeWarningImpl.setCompanyId(getCompanyId());
		employeeWarningImpl.setWarningDate(getWarningDate());
		employeeWarningImpl.setWarningSubject(getWarningSubject());
		employeeWarningImpl.setStatus(getStatus());
		employeeWarningImpl.setWarningBy(getWarningBy());
		employeeWarningImpl.setModifiedDate(getModifiedDate());
		employeeWarningImpl.setCreateBy(getCreateBy());
		employeeWarningImpl.setModifiedBy(getModifiedBy());

		employeeWarningImpl.resetOriginalValues();

		return employeeWarningImpl;
	}

	@Override
	public int compareTo(EmployeeWarning employeeWarning) {
		long primaryKey = employeeWarning.getPrimaryKey();

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

		if (!(obj instanceof EmployeeWarning)) {
			return false;
		}

		EmployeeWarning employeeWarning = (EmployeeWarning)obj;

		long primaryKey = employeeWarning.getPrimaryKey();

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
		EmployeeWarningModelImpl employeeWarningModelImpl = this;

		employeeWarningModelImpl._originalCreateBy = employeeWarningModelImpl._createBy;

		employeeWarningModelImpl._setOriginalCreateBy = false;

		employeeWarningModelImpl._originalModifiedBy = employeeWarningModelImpl._modifiedBy;

		employeeWarningModelImpl._setOriginalModifiedBy = false;

		employeeWarningModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EmployeeWarning> toCacheModel() {
		EmployeeWarningCacheModel employeeWarningCacheModel = new EmployeeWarningCacheModel();

		employeeWarningCacheModel.employeeWarningId = getEmployeeWarningId();

		employeeWarningCacheModel.warningTo = getWarningTo();

		employeeWarningCacheModel.groupId = getGroupId();

		employeeWarningCacheModel.companyId = getCompanyId();

		Date warningDate = getWarningDate();

		if (warningDate != null) {
			employeeWarningCacheModel.warningDate = warningDate.getTime();
		}
		else {
			employeeWarningCacheModel.warningDate = Long.MIN_VALUE;
		}

		employeeWarningCacheModel.warningSubject = getWarningSubject();

		String warningSubject = employeeWarningCacheModel.warningSubject;

		if ((warningSubject != null) && (warningSubject.length() == 0)) {
			employeeWarningCacheModel.warningSubject = null;
		}

		employeeWarningCacheModel.status = getStatus();

		employeeWarningCacheModel.warningBy = getWarningBy();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			employeeWarningCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			employeeWarningCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		employeeWarningCacheModel.createBy = getCreateBy();

		employeeWarningCacheModel.modifiedBy = getModifiedBy();

		return employeeWarningCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{employeeWarningId=");
		sb.append(getEmployeeWarningId());
		sb.append(", warningTo=");
		sb.append(getWarningTo());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", warningDate=");
		sb.append(getWarningDate());
		sb.append(", warningSubject=");
		sb.append(getWarningSubject());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", warningBy=");
		sb.append(getWarningBy());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeWarning");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeWarningId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeWarningId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>warningTo</column-name><column-value><![CDATA[");
		sb.append(getWarningTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>warningDate</column-name><column-value><![CDATA[");
		sb.append(getWarningDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>warningSubject</column-name><column-value><![CDATA[");
		sb.append(getWarningSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>warningBy</column-name><column-value><![CDATA[");
		sb.append(getWarningBy());
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

	private static ClassLoader _classLoader = EmployeeWarning.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmployeeWarning.class
		};
	private long _employeeWarningId;
	private long _warningTo;
	private long _groupId;
	private long _companyId;
	private Date _warningDate;
	private String _warningSubject;
	private boolean _status;
	private long _warningBy;
	private Date _modifiedDate;
	private long _createBy;
	private long _originalCreateBy;
	private boolean _setOriginalCreateBy;
	private long _modifiedBy;
	private long _originalModifiedBy;
	private boolean _setOriginalModifiedBy;
	private long _columnBitmask;
	private EmployeeWarning _escapedModel;
}