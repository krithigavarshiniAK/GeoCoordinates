package com.testing.coordinates.hibernate;

/**
 * <B><I>Copyright (C)2019-2029 OGS Paylab pvt ltd. All Rights Reserved</I></B><BR><BR>
 * <p>
 * This Is Unpublished Proprietary Source Code Of OGS Paylab Pvt Ltd.
 *
 * The copyright notice above does not evidence any actual or intended
 * publication of such Source code.
 * </p>
 **/

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.testing.coordinates.constants.ValidationResult;

/**
 *
 * <p>
 * Hibernate Mapping class for institution_terminal_config
 * </p>
 *
 */
@Entity
@Table(name = "institution_terminal_config")
public class InstitutionTerminalConfig implements Serializable {

    /**
     * <p>
     * serialVersionUID - Unique identifier for class
     * </p>
     */
    private final static long serialVersionUID = 1581071999581L;
    /**
     * <p>
     * institutionId - Institution identifier
     * </p>
     */
    private String institutionId;
    /**
     * <p>
     * versionNo - Version number
     * </p>
     */
    private Integer versionNo;
    /**
     * <p>
     * terminalsSupported - Terminal Supported for institution
     * </p>
     */
    private Integer terminalsSupported;
    /**
     * <p>
     * terminalAggregatorId - Terminal Aggregator identifier
     * </p>
     */
    private String terminalAggregatorId;
    /**
     * <p>
     * tmkLevel - Terminal key mapping level
     * </p>
     */
    private Boolean tmkLevel;
    /**
     * <p>
     * ksnId - Key serial number
     * </p>
     */
    private Integer ksnId;
    /**
     * <p>
     * bdkRange - BDK key range
     * </p>
     */
    private Integer bdkRange;
    /**
     * <p>
     * lastBdkCount - Currently available BDK ranges
     * </p>
     */
    private Integer lastBdkCount;
    /**
     * <p>
     * supportedValidations - Terminal validations supports
     * </p>
     */
    private Integer supportedValidations;
    /**
     * <p>
     * merchantRuleId - Merchant validation rule identifier
     * </p>
     */
    private String merchantRuleId;
    /**
     * <p>
     * validationResult - validation results
     * </p>
     */
    private ValidationResult validationResult;
    /**
     * <p>
     * glAccountNo - GL account number
     * </p>
     */
    private String glAccountNo;
    /**
     * <p>
     * reconciliationMode - Settlement mode
     * </p>
     */
    private Boolean reconciliationMode;

    /**
     * <p>
     * isMerchantValidate - Merchant Validate
     * </p>
     */
    private Boolean isMerchantValidate;

    /**
     * <p>
     * merchantTokenizationEnabled - Based on this flag there is a check for getting the username and password from network_merchant_cerdentials
     * </p>
     */

    private Boolean isMerchantTokenizationEnabled;

    /**
     * Creates a new InstitutionTerminalConfig.
     *
     */

    private Integer TerminalGEORange;
    /**
     * <p>
     *     Contains Range.
     * </p>
     */


    public InstitutionTerminalConfig() {
        super();
    }

    /**
     * <p>
     * Full fields constructor
     * </p>
     * @param institutionId
     * @param versionNo
     * @param terminalsSupported
     * @param terminalAggregatorId
     * @param tmkLevel
     * @param ksnId
     * @param bdkRange
     * @param lastBdkCount
     * @param supportedValidations
     * @param merchantRuleId
     * @param validationResult
     * @param glAccountNo
     * @param reconMode
     */
    public InstitutionTerminalConfig(final String institutionId, final Integer versionNo, final Integer terminalsSupported,
                                     final String terminalAggregatorId, final Boolean tmkLevel, final Integer ksnId, final Integer bdkRange, final Integer lastBdkCount,
                                     final Integer supportedValidations, final String merchantRuleId, final ValidationResult validationResult,
                                     final String glAccountNo, final Boolean reconMode, final Boolean isMerchantValidate) {
        this.institutionId = institutionId;
        this.versionNo = versionNo;
        this.terminalsSupported = terminalsSupported;
        this.terminalAggregatorId = terminalAggregatorId;
        this.tmkLevel = tmkLevel;
        this.ksnId = ksnId;
        this.bdkRange = bdkRange;
        this.lastBdkCount = lastBdkCount;
        this.supportedValidations = supportedValidations;
        this.merchantRuleId = merchantRuleId;
        this.validationResult = validationResult;
        this.glAccountNo = glAccountNo;
        this.reconciliationMode = reconMode;
        this.isMerchantValidate = isMerchantValidate;
    }

    /**
     * Returns the institutionId
     *
     * @return institutionId
     */
    @Id
    @Column(name = "InstitutionId", nullable = false, length = 11)
    public String getInstitutionId() {
        return institutionId;
    }

    /**
     * Set the institutionId
     *
     * @param institutionId the new institutionId
     */
    public void setInstitutionId(final String institutionId) {
        this.institutionId = institutionId;
    }

    /**
     * Returns the versionNo
     *
     * @return versionNo
     */
    @Column(name = "VersionNo", nullable = false, length = 11)
    public Integer getVersionNo() {
        return versionNo;
    }

    /**
     * Set the versionNo
     *
     * @param versionNo the new versionNo
     */
    public void setVersionNo(final Integer versionNo) {
        this.versionNo = versionNo;
    }

    /**
     * Returns the terminalsSupported
     *
     * @return terminalsSupported
     */
    @Column(name = "TerminalsSupported", nullable = false, length = 11)
    public Integer getTerminalsSupported() {
        return terminalsSupported;
    }

    /**
     * Set the terminalsSupported
     *
     * @param terminalsSupported the new terminalsSupported
     */
    public void setTerminalsSupported(final Integer terminalsSupported) {
        this.terminalsSupported = terminalsSupported;
    }

    /**
     * Returns the terminalAggregatorId
     *
     * @return terminalAggregatorId
     */
    @Column(name = "TerminalAggregatorId", nullable = false, length = 11)
    public String getTerminalAggregatorId() {
        return terminalAggregatorId;
    }

    /**
     * Set the terminalAggregatorId
     *
     * @param terminalAggregatorId the new terminalAggregatorId
     */
    public void setTerminalAggregatorId(final String terminalAggregatorId) {
        this.terminalAggregatorId = terminalAggregatorId;
    }

    /**
     * Returns the tmkLevel
     *
     * @return tmkLevel
     */
    @Column(name = "TmkLevel", nullable = false, length = 1)
    public Boolean getTmkLevel() {
        return tmkLevel;
    }

    /**
     * Set the tmkLevel
     *
     * @param tmkLevel the new tmkLevel
     */
    public void setTmkLevel(final Boolean tmkLevel) {
        this.tmkLevel = tmkLevel;
    }

    /**
     * Returns the ksnId
     *
     * @return ksnId
     */
    @Column(name = "KsnId", nullable = false, length = 11)
    public Integer getKsnId() {
        return ksnId;
    }

    /**
     * Set the ksnId
     *
     * @param ksnId the new ksnId
     */
    public void setKsnId(final Integer ksnId) {
        this.ksnId = ksnId;
    }

    /**
     * Returns the bdkRange
     *
     * @return bdkRange
     */
    @Column(name = "BdkRange", nullable = false, length = 11)
    public Integer getBdkRange() {
        return bdkRange;
    }

    /**
     * Set the bdkRange
     *
     * @param bdkRange the new bdkRange
     */
    public void setBdkRange(final Integer bdkRange) {
        this.bdkRange = bdkRange;
    }

    /**
     * Returns the lastBdkCount
     *
     * @return lastBdkCount
     */
    @Column(name = "LastBdkCount", nullable = false, length = 11)
    public Integer getLastBdkCount() {
        return lastBdkCount;
    }

    /**
     * Set the lastBdkCount
     *
     * @param lastBdkCount the new lastBdkCount
     */
    public void setLastBdkCount(final Integer lastBdkCount) {
        this.lastBdkCount = lastBdkCount;
    }

    /**
     * Returns the supportedValidations
     *
     * @return supportedValidations
     */
    @Column(name = "SupportedValidations", nullable = false, length = 11)
    public Integer getSupportedValidations() {
        return supportedValidations;
    }

    /**
     * Set the supportedValidations
     *
     * @param supportedValidations the new supportedValidations
     */
    public void setSupportedValidations(final Integer supportedValidations) {
        this.supportedValidations = supportedValidations;
    }

    /**
     * Returns the merchantRuleId
     *
     * @return merchantRuleId
     */
    @Column(name = "MerchantRuleId", nullable = true, length = 11)
    public String getMerchantRuleId() {
        return merchantRuleId;
    }

    /**
     * Set the merchantRuleId
     *
     * @param merchantRuleId the new merchantRuleId
     */
    public void setMerchantRuleId(final String merchantRuleId) {
        this.merchantRuleId = merchantRuleId;
    }

    /**
     * Returns the validationResult
     *
     * @return validationResult
     */
    @Column(name = "ValidationResult", nullable = false, length = 1)
    @Enumerated(EnumType.ORDINAL)
    public ValidationResult getValidationResult() {
        return validationResult;
    }

    /**
     * Set the validationResult
     *
     * @param validationResult the new validationResult
     */
    public void setValidationResult(final ValidationResult validationResult) {
        this.validationResult = validationResult;
    }

    /**
     * Returns the glAccountNo
     *
     * @return glAccountNo
     */
    @Column(name = "GlAccountNo", nullable = true, length = 45)
    public String getGlAccountNo() {
        return glAccountNo;
    }

    /**
     * Set the glAccountNo
     *
     * @param glAccountNo the new glAccountNo
     */
    public void setGlAccountNo(final String glAccountNo) {
        this.glAccountNo = glAccountNo;
    }

    /**
     * @return the reconciliationMode
     */
    @Column(name = "ReconciliationMode", nullable = false, length = 1)
    public Boolean getReconciliationMode() {
        return reconciliationMode;
    }

    /**
     * @param reconciliationMode the reconciliationMode to set
     */
    public void setReconciliationMode(final Boolean reconciliationMode) {
        this.reconciliationMode = reconciliationMode;
    }

    /**
     * @param isMerchantValidate
     */
    public void setIsMerchantValidate(final Boolean isMerchantValidate) {
        this.isMerchantValidate = isMerchantValidate;
    }

    /**
     * @return
     */
    @Column(name = "IsMerchantValidate", nullable = false, length = 1)
    public Boolean getIsMerchantValidate() {
        return isMerchantValidate;
    }

    /**
     * @return
     */
    @Column(name = "IsNetworkTokenEnabled", nullable = false, length = 1)
    public Boolean getIsMerchantTokenizationEnabled() {
        return isMerchantTokenizationEnabled;
    }

    /**
     * @param isMerchantTokenizationEnabled
     */
    public void setIsMerchantTokenizationEnabled(final Boolean isMerchantTokenizationEnabled) {
        this.isMerchantTokenizationEnabled = isMerchantTokenizationEnabled;
    }

    public void setTerminalGEORange(String terminalGEORange) {
        this.TerminalGEORange = TerminalGEORange;
    }

    public Integer getTerminalGEORange() {
        return TerminalGEORange;
    }
}
