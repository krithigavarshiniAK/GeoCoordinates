/**
 * <B><I>Copyright (C)2019-2029 OGS Paylab pvt ltd. All Rights Reserved</I></B><BR><BR>
 * <p>
 * This Is Unpublished Proprietary Source Code Of OGS Paylab Pvt Ltd.
 * 
 * The copyright notice above does not evidence any actual or intended
 * publication of such Source code.
 * </p>
 **/

package com.testing.coordinates.hibernate;

import com.testing.coordinates.constants.DataEncMethod;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 * <p>
 * Hibernate Mapping class for terminal_details
 * </p>
 * 
 */
@Entity
@Table(name = "terminal_details")
public class TerminalDetails implements Serializable {

	/**
	 * <p>
	 * serialVersionUID - Unique identifier for class
	 * </p>
	 */
	private final static long serialVersionUID = 1587527281619L;
	/**
	 * <p>
	 * id - Terminal primary key object
	 * </p>
	 *//*
		 * public TerminalDetailsId id;
		 */
	/**
	 * <p>
	 * id - Terminal primary key object
	 * </p>
	 */
	public String id;
	/**
	 * <p>
	 * Merchant
	 * </p>
	 */

	private String terminalId;

	/**
	 * <p>
	 * Merchant
	 * </p>
	 */
	private String merchantId;

	/**
	 * <p>
	 * Super Merchant
	 * </p>
	 */
	private String superMerchantId;

	/**
	 * <p>
	 * group Merchant
	 * </p>
	 */
	private String groupMerchantId;

	/**
	 * Payment Schemes - MADA , VISA , MASTER , RUPAY etc.
	 */
	private Integer paymentSchemes;

	/**
	 * Transaction Class - PG , MOTO , RECURRING
	 */
	private Integer transactionClass;

	/**
	 * <p>
	 * deviceMac - Device MAC address
	 * </p>
	 */
	private String deviceMac;
	/**
	 * <p>
	 * model - Terminal model type
	 * </p>
	 */
	private String model;
	/**
	 * <p>
	 * location - Terminal location
	 * </p>
	 */
	private String location;
	/**
	 * <p>
	 * city - Terminal city
	 * </p>
	 */
	private String city;
	/**
	 * <p>
	 * branch - Terminal branch
	 * </p>
	 */
	private String branch;
	/**
	 * <p>
	 * stateCode - Terminal state code
	 * </p>
	 */
	private String stateCode;
	/**
	 * <p>
	 * countryCode - Terminal country code
	 * </p>
	 */
	private String countryCode;
	/**
	 * <p>
	 * currencyCode - Terminal currency code
	 * </p>
	 */
	private String currencyCode;
	/**
	 * <p>
	 * ksnId - KSN identifier
	 * </p>
	 */
	private String ksnId;
	/**
	 * <p>
	 * bdkId - BDK Identifier
	 * </p>
	 */
	private String bdkId;
	/**
	 * <p>
	 * ksnIndex - Current KSN index
	 * </p>
	 */
	private String ksnIndex;
	/**
	 * <p>
	 * counterA - Txn counter A data
	 * </p>
	 */
	private Integer counterA;
	/**
	 * <p>
	 * counterB - Txn counter B data
	 * </p>
	 */
	private Integer counterB;
	/**
	 * <p>
	 * ipekKcv - IPEK Key check value
	 * </p>
	 */
	private String ipekKcv;
	/**
	 * <p>
	 * keyExchangeStatus - key exchange completed or not
	 * </p>
	 */
	private Boolean keyExchangeStatus;
	/**
	 * <p>
	 * keyExchangeDate - Key exchange trace history date
	 * </p>
	 */
	private Date keyExchangeDate = new Date();
	/**
	 * <p>
	 * creationDate - Terminal Creation date
	 * </p>
	 */
	private Date creationDate = new Date();
	/**
	 * <p>
	 * installationDate - Terminal Installation date
	 * </p>
	 */
	private Date installationDate = new Date();
	/**
	 * <p>
	 * activationDate - Activation date
	 * </p>
	 */
	private Date activationDate = new Date();
	/**
	 * <p>
	 * dailyFloorLimit - Terminal txn daily limit
	 * </p>
	 */
	private Long dailyFloorLimit;
	/**
	 * <p>
	 * weeklyFloorLimit - Terminal txn weekly limit
	 * </p>
	 */
	private Long weeklyFloorLimit;
	/**
	 * <p>
	 * monthlyFloorLimit - Terminal txn monthly limit
	 * </p>
	 */
	private Long monthlyFloorLimit;
	/**
	 * <p>
	 * velocityCheckMinutes - Txn minutes check for merchant
	 * </p>
	 */
	private Integer velocityCheckMinutes;
	/**
	 * <p>
	 * velocityCheckTxnCount - Txn count check for merchant
	 * </p>
	 */
	private Integer velocityCheckTxnCount;
	/**
	 * <p>
	 * paymentAddress - Payment address
	 * </p>
	 */
	private String paymentAddress;
	/**
	 * <p>
	 * mobileNumber - Mobile number
	 * </p>
	 */
	private String mobileNumber;
	/**
	 * <p>
	 * dataEncMethod - Terminal data encryption method
	 * </p>
	 */
	private DataEncMethod dataEncMethod;
	/**
	 * <p>
	 * merchantTypeStatus - Merchant type
	 * </p>
	 */
	private String merchantTypeStatus;
	/**
	 * <p>
	 * previousStatus - terminal config previous status
	 * </p>
	 */
	private String previousStatus;
	/**
	 * <p>
	 * status - Terminal config current status
	 * </p>
	 */
	private String status;
	/**
	 * <p>
	 * acquirerId - AcquirerId identifier
	 * </p>
	 */
	private String acquirerId;
	
	/**
	 * <p>
	 * Transaction Invoice number
	 * </p>
	 */
	private Integer invoiceNumber;
	/**
	 * Creates a new TerminalDetails.
	 * 
	 */
	private String GeoCoordinate;
	/**
	 * <p>
	 *     Contains latitude and longitude.
	 * </p>
	 */
	public TerminalDetails() {
		super();
	}

	/**
	 * <p>
	 * Full field constructor
	 * </p>
	 * 
	 * @param id
	 * @param deviceMac
	 * @param model
	 * @param location
	 * @param city
	 * @param branch
	 * @param stateCode
	 * @param countryCode
	 * @param currencyCode
	 * @param ksnId
	 * @param bdkId
	 * @param ksnIndex
	 * @param counterA
	 * @param counterB
	 * @param ipekKcv
	 * @param keyExchangeStatus
	 * @param keyExchangeDate
	 * @param creationDate
	 * @param installationDate
	 * @param activationDate
	 * @param dailyFloorLimit
	 * @param weeklyFloorLimit
	 * @param monthlyFloorLimit
	 * @param velocityCheckMinutes
	 * @param velocityCheckTxnCount
	 * @param paymentAddress
	 * @param dataEncMethod
	 * @param merchantTypeStatus
	 * @param previousStatus
	 * @param status
	 */
	public TerminalDetails(final String id, final String terminalId, final String merchantId,
			final String groupMerchant, final String superMerchantId, final Integer paymentSchemes,
			final Integer transactionClass, final String deviceMac, final String model, final String location,
			final String city, final String branch, final String stateCode, final String countryCode,
			final String currencyCode, final String ksnId, final String bdkId, final String ksnIndex,
			final Integer counterA, final Integer counterB, final String ipekKcv, final Boolean keyExchangeStatus,
			final Date keyExchangeDate, final Date creationDate, final Date installationDate, final Date activationDate,
			final Long dailyFloorLimit, final Long weeklyFloorLimit, final Long monthlyFloorLimit,
			final Integer velocityCheckMinutes, final Integer velocityCheckTxnCount, final String paymentAddress,
			final DataEncMethod dataEncMethod, final String mobileNumber, final String merchantTypeStatus, final String previousStatus,
			final String status, final String acquirerId) {
		this.id = id;
		this.terminalId = terminalId;
		this.merchantId = merchantId;
		this.groupMerchantId = groupMerchant;
		this.superMerchantId = superMerchantId;
		this.paymentSchemes = paymentSchemes;
		this.transactionClass = transactionClass;
		this.deviceMac = deviceMac;
		this.model = model;
		this.location = location;
		this.city = city;
		this.branch = branch;
		this.stateCode = stateCode;
		this.countryCode = countryCode;
		this.currencyCode = currencyCode;
		this.ksnId = ksnId;
		this.bdkId = bdkId;
		this.ksnIndex = ksnIndex;
		this.counterA = counterA;
		this.counterB = counterB;
		this.ipekKcv = ipekKcv;
		this.keyExchangeStatus = keyExchangeStatus;
		this.keyExchangeDate = keyExchangeDate;
		this.creationDate = creationDate;
		this.installationDate = installationDate;
		this.activationDate = activationDate;
		this.dailyFloorLimit = dailyFloorLimit;
		this.weeklyFloorLimit = weeklyFloorLimit;
		this.monthlyFloorLimit = monthlyFloorLimit;
		this.velocityCheckMinutes = velocityCheckMinutes;
		this.velocityCheckTxnCount = velocityCheckTxnCount;
		this.paymentAddress = paymentAddress;
		this.mobileNumber = mobileNumber;
		this.dataEncMethod = dataEncMethod;
		this.merchantTypeStatus = merchantTypeStatus;
		this.previousStatus = previousStatus;
		this.status = status;
		this.acquirerId = acquirerId;
	}

	/*
	 * @EmbeddedId
	 * 
	 * @AttributeOverrides({ @AttributeOverride(name = "Id", column = @Column(name =
	 * "Id", nullable = false, length = 15))}) public TerminalDetailsId getId() {
	 * return this.id; }
	 * 
	 * public void setId(final TerminalDetailsId id) { this.id = id; }
	 */
	@Id
	@Column(name = "Id", unique = true,nullable = false, length = 15)
	public String getId() {
		return id;
	}

	public void setId(final String id1) {
		this.id= id1;
	}

	/**
	 * @return
	 */
	@Column(name = "TerminalId", nullable = false)
	public String getTerminalId() {
		return terminalId;
	}

	/**
	 * @param terminalId
	 */
	public void setTerminalId(final String terminalId) {
		this.terminalId = terminalId;
	}

	/**
	 * @return
	 */
	@Column(name = "MerchantId", nullable = false)
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchant
	 */
	public void setMerchantId(final String merchant) {
		this.merchantId = merchant;
	}

	/**
	 * @return
	 */
	@Column(name = "SuperMerchantId", nullable = false)
	public String getSuperMerchantId() {
		return superMerchantId;
	}

	/**
	 * @param superMerchant
	 */
	public void setSuperMerchantId(final String superMerchant) {
		this.superMerchantId = superMerchant;
	}

	/**
	 * @return
	 */
	@Column(name = "MerchantGroupId", nullable = false)
	public String getGroupMerchantId() {
		return groupMerchantId;
	}

	/**
	 * @param groupMerchant
	 */
	public void setGroupMerchantId(final String groupMerchant) {
		this.groupMerchantId = groupMerchant;
	}

	/**
	 * @return
	 */
	@Column(name = "PaymentSchemes", nullable = true)
	public Integer getPaymentSchemes() {
		return paymentSchemes;
	}

	/**
	 * @param paymentSchemes
	 */
	public void setPaymentSchemes(final Integer paymentSchemes) {
		this.paymentSchemes = paymentSchemes;
	}

	/**
	 * @return
	 */
	@Column(name = "TransactionClass", nullable = true)
	public Integer getTransactionClass() {
		return transactionClass;
	}

	/**
	 * @param transactionClass
	 */
	public void setTransactionClass(final Integer transactionClass) {
		this.transactionClass = transactionClass;
	}

	/**
	 * Returns the deviceMac
	 * 
	 * @return deviceMac
	 */
	@Column(name = "DeviceMac", nullable = true)
	public String getDeviceMac() {
		return deviceMac;
	}

	/**
	 * Set the deviceMac
	 * 
	 * @param deviceMac the new deviceMac
	 */
	public void setDeviceMac(final String deviceMac) {
		this.deviceMac = deviceMac;
	}

	/**
	 * Returns the model
	 * 
	 * @return model
	 */
	@Column(name = "Model", nullable = true)
	public String getModel() {
		return model;
	}

	/**
	 * Set the model
	 * 
	 * @param model the new model
	 */
	public void setModel(final String model) {
		this.model = model;
	}

	/**
	 * Returns the location
	 * 
	 * @return location
	 */
	@Column(name = "Location", nullable = true)
	public String getLocation() {
		return location;
	}

	/**
	 * Set the location
	 * 
	 * @param location the new location
	 */
	public void setLocation(final String location) {
		this.location = location;
	}

	/**
	 * Returns the city
	 * 
	 * @return city
	 */
	@Column(name = "City", nullable = true, length = 40)
	public String getCity() {
		return city;
	}

	/**
	 * Set the city
	 * 
	 * @param city the new city
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * Returns the branch
	 * 
	 * @return branch
	 */
	@Column(name = "Branch", nullable = true, length = 40)
	public String getBranch() {
		return branch;
	}

	/**
	 * Set the branch
	 * 
	 * @param branch the new branch
	 */
	public void setBranch(final String branch) {
		this.branch = branch;
	}

	/**
	 * Returns the stateCode
	 * 
	 * @return stateCode
	 */
	@Column(name = "StateCode", nullable = true, length = 2)
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * Set the stateCode
	 * 
	 * @param stateCode the new stateCode
	 */
	public void setStateCode(final String stateCode) {
		this.stateCode = stateCode;
	}

	/**
	 * Returns the countryCode
	 * 
	 * @return countryCode
	 */
	@Column(name = "CountryCode", nullable = true, length = 3)
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Set the countryCode
	 * 
	 * @param countryCode the new countryCode
	 */
	public void setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Returns the currencyCode
	 * 
	 * @return currencyCode
	 */
	@Column(name = "CurrencyCode", nullable = true, length = 3)
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * Set the currencyCode
	 * 
	 * @param currencyCode the new currencyCode
	 */
	public void setCurrencyCode(final String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Returns the ksnId
	 * 
	 * @return ksnId
	 */
	@Column(name = "KsnId", nullable = false, length = 2)
	public String getKsnId() {
		return ksnId;
	}

	/**
	 * Set the ksnId
	 * 
	 * @param ksnId the new ksnId
	 */
	public void setKsnId(final String ksnId) {
		this.ksnId = ksnId;
	}

	/**
	 * Returns the bdkId
	 * 
	 * @return bdkId
	 */
	@Column(name = "BdkId", nullable = false, length = 2)
	public String getBdkId() {
		return bdkId;
	}

	/**
	 * Set the bdkId
	 * 
	 * @param bdkId the new bdkId
	 */
	public void setBdkId(final String bdkId) {
		this.bdkId = bdkId;
	}

	/**
	 * Returns the ksnIndex
	 * 
	 * @return ksnIndex
	 */
	@Column(name = "KsnIndex", nullable = false, length = 8)
	public String getKsnIndex() {
		return ksnIndex;
	}

	/**
	 * Set the ksnIndex
	 * 
	 * @param ksnIndex the new ksnIndex
	 */
	public void setKsnIndex(final String ksnIndex) {
		this.ksnIndex = ksnIndex;
	}

	/**
	 * Returns the counterA
	 * 
	 * @return counterA
	 */
	@Column(name = "CounterA", nullable = false)
	public Integer getCounterA() {
		return counterA;
	}

	/**
	 * Set the counterA
	 * 
	 * @param counterA the new counterA
	 */
	public void setCounterA(final Integer counterA) {
		this.counterA = counterA;
	}

	/**
	 * Returns the counterB
	 * 
	 * @return counterB
	 */
	@Column(name = "CounterB", nullable = false)
	public Integer getCounterB() {
		return counterB;
	}

	/**
	 * Set the counterB
	 * 
	 * @param counterB the new counterB
	 */
	public void setCounterB(final Integer counterB) {
		this.counterB = counterB;
	}

	/**
	 * Returns the ipekKcv
	 * 
	 * @return ipekKcv
	 */
	@Column(name = "IpekKcv", nullable = true, length = 6)
	public String getIpekKcv() {
		return ipekKcv;
	}

	/**
	 * Set the ipekKcv
	 * 
	 * @param ipekKcv the new ipekKcv
	 */
	public void setIpekKcv(final String ipekKcv) {
		this.ipekKcv = ipekKcv;
	}

	/**
	 * Returns the keyExchangeStatus
	 * 
	 * @return keyExchangeStatus
	 */
	@Column(name = "KeyExchangeStatus", nullable = false)
	public Boolean getKeyExchangeStatus() {
		return keyExchangeStatus;
	}

	/**
	 * Set the keyExchangeStatus
	 * 
	 * @param keyExchangeStatus the new keyExchangeStatus
	 */
	public void setKeyExchangeStatus(final Boolean keyExchangeStatus) {
		this.keyExchangeStatus = keyExchangeStatus;
	}

	/**
	 * Returns the keyExchangeDate
	 * 
	 * @return keyExchangeDate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "KeyExchangeDate", nullable = false, insertable = false)
	public Date getKeyExchangeDate() {
		return keyExchangeDate;
	}

	/**
	 * Set the keyExchangeDate
	 * 
	 * @param keyExchangeDate the new keyExchangeDate
	 */
	public void setKeyExchangeDate(final Date keyExchangeDate) {
		this.keyExchangeDate = keyExchangeDate;
	}

	/**
	 * Returns the creationDate
	 * 
	 * @return creationDate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedDate", nullable = false, insertable = false)
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Set the creationDate
	 * 
	 * @param creationDate the new creationDate
	 */
	public void setCreationDate(final Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Returns the installationDate
	 * 
	 * @return installationDate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "InstallationDate", nullable = false, insertable = false)
	public Date getInstallationDate() {
		return installationDate;
	}

	/**
	 * Set the installationDate
	 * 
	 * @param installationDate the new installationDate
	 */
	public void setInstallationDate(final Date installationDate) {
		this.installationDate = installationDate;
	}

	/**
	 * Returns the activationDate
	 * 
	 * @return activationDate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ActivationDate", nullable = false, insertable = false)
	public Date getActivationDate() {
		return activationDate;
	}

	/**
	 * Set the activationDate
	 * 
	 * @param activationDate the new activationDate
	 */
	public void setActivationDate(final Date activationDate) {
		this.activationDate = activationDate;
	}

	/**
	 * Returns the dailyFloorLimit
	 * 
	 * @return dailyFloorLimit
	 */
	@Column(name = "DailyFloorLimit", nullable = false)
	public Long getDailyFloorLimit() {
		return dailyFloorLimit;
	}

	/**
	 * Set the dailyFloorLimit
	 * 
	 * @param dailyFloorLimit the new dailyFloorLimit
	 */
	public void setDailyFloorLimit(final Long dailyFloorLimit) {
		this.dailyFloorLimit = dailyFloorLimit;
	}

	/**
	 * Returns the weeklyFloorLimit
	 * 
	 * @return weeklyFloorLimit
	 */
	@Column(name = "WeeklyFloorLimit", nullable = false)
	public Long getWeeklyFloorLimit() {
		return weeklyFloorLimit;
	}

	/**
	 * Set the weeklyFloorLimit
	 * 
	 * @param weeklyFloorLimit the new weeklyFloorLimit
	 */
	public void setWeeklyFloorLimit(final Long weeklyFloorLimit) {
		this.weeklyFloorLimit = weeklyFloorLimit;
	}

	/**
	 * Returns the monthlyFloorLimit
	 * 
	 * @return monthlyFloorLimit
	 */
	@Column(name = "MonthlyFloorLimit", nullable = false)
	public Long getMonthlyFloorLimit() {
		return monthlyFloorLimit;
	}

	/**
	 * Set the monthlyFloorLimit
	 * 
	 * @param monthlyFloorLimit the new monthlyFloorLimit
	 */
	public void setMonthlyFloorLimit(final Long monthlyFloorLimit) {
		this.monthlyFloorLimit = monthlyFloorLimit;
	}

	/**
	 * Returns the velocityCheckMinutes
	 * 
	 * @return velocityCheckMinutes
	 */
	@Column(name = "VelocityCheckMinutes", nullable = false)
	public Integer getVelocityCheckMinutes() {
		return velocityCheckMinutes;
	}

	/**
	 * Set the velocityCheckMinutes
	 * 
	 * @param velocityCheckMinutes the new velocityCheckMinutes
	 */
	public void setVelocityCheckMinutes(final Integer velocityCheckMinutes) {
		this.velocityCheckMinutes = velocityCheckMinutes;
	}

	/**
	 * Returns the velocityCheckTxnCount
	 * 
	 * @return velocityCheckTxnCount
	 */
	@Column(name = "VelocityCheckTxnCount", nullable = false)
	public Integer getVelocityCheckTxnCount() {
		return velocityCheckTxnCount;
	}

	/**
	 * Set the velocityCheckTxnCount
	 * 
	 * @param velocityCheckTxnCount the new velocityCheckTxnCount
	 */
	public void setVelocityCheckTxnCount(final Integer velocityCheckTxnCount) {
		this.velocityCheckTxnCount = velocityCheckTxnCount;
	}

	/**
	 * Returns the paymentAddress
	 * 
	 * @return paymentAddress
	 */
	@Column(name = "PaymentAddress", nullable = true, length = 100)
	public String getPaymentAddress() {
		return paymentAddress;
	}

	/**
	 * Set the paymentAddress
	 * 
	 * @param paymentAddress the new paymentAddress
	 */
	public void setPaymentAddress(final String paymentAddress) {
		this.paymentAddress = paymentAddress;
	}

	/**
	 * Returns the mobileNumber
	 * 
	 * @return mobileNumber
	 */
	@Column(name = "MobileNumber", nullable = true)
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * Set the mobileNumber
	 * 
	 * @param mobileNumber the new mobileNumber
	 */
	public void setMobileNumber(final String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * Returns the dataEncMethod
	 * 
	 * @return dataEncMethod
	 */
	@Column(name = "DataEncMethod", nullable = false)
	public DataEncMethod getDataEncMethod() {
		return dataEncMethod;
	}

	/**
	 * Set the dataEncMethod
	 * 
	 * @param dataEncMethod the new dataEncMethod
	 */
	public void setDataEncMethod(final DataEncMethod dataEncMethod) {
		this.dataEncMethod = dataEncMethod;
	}

	/**
	 * Returns the merchantTypeStatus
	 * 
	 * @return merchantTypeStatus
	 */
	@Column(name = "MerchantTypeStatus", nullable = true, length = 100)
	public String getMerchantTypeStatus() {
		return merchantTypeStatus;
	}

	/**
	 * Set the merchantTypeStatus
	 * 
	 * @param merchantTypeStatus the new merchantTypeStatus
	 */
	public void setMerchantTypeStatus(final String merchantTypeStatus) {
		this.merchantTypeStatus = merchantTypeStatus;
	}

	/**
	 * Returns the previousStatus
	 * 
	 * @return previousStatus
	 */
	@Column(name = "PreviousStatus", nullable = false, length = 1)
	public String getPreviousStatus() {
		return previousStatus;
	}

	/**
	 * Set the previousStatus
	 * 
	 * @param previousStatus the new previousStatus
	 */
	public void setPreviousStatus(final String previousStatus) {
		this.previousStatus = previousStatus;
	}

	/**
	 * Returns the status
	 * 
	 * @return status
	 */
	@Column(name = "Status", nullable = false, length = 1)
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status
	 * 
	 * @param status the new status
	 */
	public void setStatus(final String status) {
		this.status = status;
	}
	
	/**
	 * Returns the acquirerId
	 * 
	 * @return acquirerId
	 */
	@Column(name = "AcquirerId", nullable = false, length = 11)
	public String getAcquirerId() {
		return acquirerId;
	}

	/**
	 * Set the acquirerId
	 * 
	 * @param acquirerId the new acquirerId
	 */
	public void setAcquirerId(final String acquirerId) {
		this.acquirerId = acquirerId;
	}

	/**
	 * @return the invoiceNumber
	 */
	@Column(name = "InvoiceNumber", nullable = true)
	public Integer getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(final Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public void setGeoCoordinate(String geoCoordinate) {
		this.GeoCoordinate = GeoCoordinate;
	}

	@Column(name = "GeoCoordinate")
	public String getGeoCoordinate() {
		return GeoCoordinate;
	}


	@Override
	public String toString() {
		return "TerminalDetails [id=" + id + ", terminalId=" + terminalId + ", merchantId=" + merchantId
				+ ", superMerchantId=" + superMerchantId + ", groupMerchantId=" + groupMerchantId + ", paymentSchemes="
				+ paymentSchemes + ", transactionClass=" + transactionClass + ", deviceMac=" + deviceMac + ", model="
				+ model + ", location=" + location + ", city=" + city + ", branch=" + branch + ", stateCode="
				+ stateCode + ", countryCode=" + countryCode + ", currencyCode=" + currencyCode + ", ksnId=" + ksnId
				+ ", bdkId=" + bdkId + ", ksnIndex=" + ksnIndex + ", counterA=" + counterA + ", counterB=" + counterB
				+ ", ipekKcv=" + ipekKcv + ", keyExchangeStatus=" + keyExchangeStatus + ", keyExchangeDate="
				+ keyExchangeDate + ", creationDate=" + creationDate + ", installationDate=" + installationDate
				+ ", activationDate=" + activationDate + ", dailyFloorLimit=" + dailyFloorLimit + ", weeklyFloorLimit="
				+ weeklyFloorLimit + ", monthlyFloorLimit=" + monthlyFloorLimit + ", velocityCheckMinutes="
				+ velocityCheckMinutes + ", velocityCheckTxnCount=" + velocityCheckTxnCount + ", paymentAddress="
				+ paymentAddress + ", dataEncMethod=" + dataEncMethod + ", merchantTypeStatus=" + merchantTypeStatus
				+ ", previousStatus=" + previousStatus + ", status=" + status + ", acquirerId=" + acquirerId +"]";
		
	}


}
