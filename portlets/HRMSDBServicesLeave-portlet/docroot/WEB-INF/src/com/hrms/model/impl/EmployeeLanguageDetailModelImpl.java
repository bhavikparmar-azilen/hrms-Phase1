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

import com.hrms.model.EmployeeLanguageDetail;
import com.hrms.model.EmployeeLanguageDetailModel;
import com.hrms.model.EmployeeLanguageDetailSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

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
 * The base model implementation for the EmployeeLanguageDetail service. Represents a row in the &quot;HRMS_EmployeeLanguageDetail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hrms.model.EmployeeLanguageDetailModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeLanguageDetailImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeLanguageDetailImpl
 * @see com.hrms.model.EmployeeLanguageDetail
 * @see com.hrms.model.EmployeeLanguageDetailModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeLanguageDetailModelImpl extends BaseModelImpl<EmployeeLanguageDetail>
	implements EmployeeLanguageDetailModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee language detail model instance should use the {@link com.hrms.model.EmployeeLanguageDetail} interface instead.
	 */
	public static final String TABLE_NAME = "HRMS_EmployeeLanguageDetail";
	public static final Object[][] TABLE_COLUMNS = {
			{ "employeeLanguageDetailId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "languageName", Types.VARCHAR },
			{ "read_", Types.BOOLEAN },
			{ "write_", Types.BOOLEAN },
			{ "speak", Types.BOOLEAN },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "createBy", Types.BIGINT },
			{ "modifiedBy", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table HRMS_EmployeeLanguageDetail (employeeLanguageDetailId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,languageName VARCHAR(75) null,read_ BOOLEAN,write_ BOOLEAN,speak BOOLEAN,createDate DATE null,modifiedDate DATE null,createBy LONG,modifiedBy LONG)";
	public static final String TABLE_SQL_DROP = "drop table HRMS_EmployeeLanguageDetail";
	public static final String ORDER_BY_JPQL = " ORDER BY employeeLanguageDetail.employeeLanguageDetailId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HRMS_EmployeeLanguageDetail.employeeLanguageDetailId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hrms.model.EmployeeLanguageDetail"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hrms.model.EmployeeLanguageDetail"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmployeeLanguageDetail toModel(
		EmployeeLanguageDetailSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmployeeLanguageDetail model = new EmployeeLanguageDetailImpl();

		model.setEmployeeLanguageDetailId(soapModel.getEmployeeLanguageDetailId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setLanguageName(soapModel.getLanguageName());
		model.setRead(soapModel.getRead());
		model.setWrite(soapModel.getWrite());
		model.setSpeak(soapModel.getSpeak());
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
	public static List<EmployeeLanguageDetail> toModels(
		EmployeeLanguageDetailSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmployeeLanguageDetail> models = new ArrayList<EmployeeLanguageDetail>(soapModels.length);

		for (EmployeeLanguageDetailSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hrms.model.EmployeeLanguageDetail"));

	public EmployeeLanguageDetailModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employeeLanguageDetailId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeLanguageDetailId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeLanguageDetailId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeLanguageDetail.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeLanguageDetail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeLanguageDetailId", getEmployeeLanguageDetailId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("languageName", getLanguageName());
		attributes.put("read", getRead());
		attributes.put("write", getWrite());
		attributes.put("speak", getSpeak());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeLanguageDetailId = (Long)attributes.get(
				"employeeLanguageDetailId");

		if (employeeLanguageDetailId != null) {
			setEmployeeLanguageDetailId(employeeLanguageDetailId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String languageName = (String)attributes.get("languageName");

		if (languageName != null) {
			setLanguageName(languageName);
		}

		Boolean read = (Boolean)attributes.get("read");

		if (read != null) {
			setRead(read);
		}

		Boolean write = (Boolean)attributes.get("write");

		if (write != null) {
			setWrite(write);
		}

		Boolean speak = (Boolean)attributes.get("speak");

		if (speak != null) {
			setSpeak(speak);
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
	public long getEmployeeLanguageDetailId() {
		return _employeeLanguageDetailId;
	}

	@Override
	public void setEmployeeLanguageDetailId(long employeeLanguageDetailId) {
		_employeeLanguageDetailId = employeeLanguageDetailId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
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
	public String getLanguageName() {
		if (_languageName == null) {
			return StringPool.BLANK;
		}
		else {
			return _languageName;
		}
	}

	@Override
	public void setLanguageName(String languageName) {
		_languageName = languageName;
	}

	@JSON
	@Override
	public boolean getRead() {
		return _read;
	}

	@Override
	public boolean isRead() {
		return _read;
	}

	@Override
	public void setRead(boolean read) {
		_read = read;
	}

	@JSON
	@Override
	public boolean getWrite() {
		return _write;
	}

	@Override
	public boolean isWrite() {
		return _write;
	}

	@Override
	public void setWrite(boolean write) {
		_write = write;
	}

	@JSON
	@Override
	public boolean getSpeak() {
		return _speak;
	}

	@Override
	public boolean isSpeak() {
		return _speak;
	}

	@Override
	public void setSpeak(boolean speak) {
		_speak = speak;
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
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EmployeeLanguageDetail.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmployeeLanguageDetail toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmployeeLanguageDetail)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeLanguageDetailImpl employeeLanguageDetailImpl = new EmployeeLanguageDetailImpl();

		employeeLanguageDetailImpl.setEmployeeLanguageDetailId(getEmployeeLanguageDetailId());
		employeeLanguageDetailImpl.setUserId(getUserId());
		employeeLanguageDetailImpl.setGroupId(getGroupId());
		employeeLanguageDetailImpl.setCompanyId(getCompanyId());
		employeeLanguageDetailImpl.setLanguageName(getLanguageName());
		employeeLanguageDetailImpl.setRead(getRead());
		employeeLanguageDetailImpl.setWrite(getWrite());
		employeeLanguageDetailImpl.setSpeak(getSpeak());
		employeeLanguageDetailImpl.setCreateDate(getCreateDate());
		employeeLanguageDetailImpl.setModifiedDate(getModifiedDate());
		employeeLanguageDetailImpl.setCreateBy(getCreateBy());
		employeeLanguageDetailImpl.setModifiedBy(getModifiedBy());

		employeeLanguageDetailImpl.resetOriginalValues();

		return employeeLanguageDetailImpl;
	}

	@Override
	public int compareTo(EmployeeLanguageDetail employeeLanguageDetail) {
		long primaryKey = employeeLanguageDetail.getPrimaryKey();

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

		if (!(obj instanceof EmployeeLanguageDetail)) {
			return false;
		}

		EmployeeLanguageDetail employeeLanguageDetail = (EmployeeLanguageDetail)obj;

		long primaryKey = employeeLanguageDetail.getPrimaryKey();

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
	public CacheModel<EmployeeLanguageDetail> toCacheModel() {
		EmployeeLanguageDetailCacheModel employeeLanguageDetailCacheModel = new EmployeeLanguageDetailCacheModel();

		employeeLanguageDetailCacheModel.employeeLanguageDetailId = getEmployeeLanguageDetailId();

		employeeLanguageDetailCacheModel.userId = getUserId();

		employeeLanguageDetailCacheModel.groupId = getGroupId();

		employeeLanguageDetailCacheModel.companyId = getCompanyId();

		employeeLanguageDetailCacheModel.languageName = getLanguageName();

		String languageName = employeeLanguageDetailCacheModel.languageName;

		if ((languageName != null) && (languageName.length() == 0)) {
			employeeLanguageDetailCacheModel.languageName = null;
		}

		employeeLanguageDetailCacheModel.read = getRead();

		employeeLanguageDetailCacheModel.write = getWrite();

		employeeLanguageDetailCacheModel.speak = getSpeak();

		Date createDate = getCreateDate();

		if (createDate != null) {
			employeeLanguageDetailCacheModel.createDate = createDate.getTime();
		}
		else {
			employeeLanguageDetailCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			employeeLanguageDetailCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			employeeLanguageDetailCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		employeeLanguageDetailCacheModel.createBy = getCreateBy();

		employeeLanguageDetailCacheModel.modifiedBy = getModifiedBy();

		return employeeLanguageDetailCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{employeeLanguageDetailId=");
		sb.append(getEmployeeLanguageDetailId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", languageName=");
		sb.append(getLanguageName());
		sb.append(", read=");
		sb.append(getRead());
		sb.append(", write=");
		sb.append(getWrite());
		sb.append(", speak=");
		sb.append(getSpeak());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeLanguageDetail");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeLanguageDetailId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeLanguageDetailId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
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
			"<column><column-name>languageName</column-name><column-value><![CDATA[");
		sb.append(getLanguageName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>read</column-name><column-value><![CDATA[");
		sb.append(getRead());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>write</column-name><column-value><![CDATA[");
		sb.append(getWrite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>speak</column-name><column-value><![CDATA[");
		sb.append(getSpeak());
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

	private static ClassLoader _classLoader = EmployeeLanguageDetail.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmployeeLanguageDetail.class
		};
	private long _employeeLanguageDetailId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private String _languageName;
	private boolean _read;
	private boolean _write;
	private boolean _speak;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private EmployeeLanguageDetail _escapedModel;
}