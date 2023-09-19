package Examportal.Common;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class SearchFieldsObj {
    private static final long serialVersionUID = 2909494450651767609L;

    private String searchFor;

    private String withIn;

    private String startDate;

    private String endDate;

    private String compareYear;

    private String status;

    private boolean devApiPullFlag;

    private List<String> statusList;

    private String statusType;

    private String txnStatus;

    private List<Integer> accountIdList;

    private String type;

    private String reportName;

    private String reportName1;

    private String levels;

    private Integer rootLevel;

    // for s3 reports use
    private Integer templateId;
    private Integer reportId;
    private String linkedStatus;
    private String templateName;

    private int taxRateId;

    private Integer contactId;

    private boolean bool;

    private Integer currencyId;

    private String apiAccountId;

    private boolean exactAmount;

    private boolean exactDate;

    private double minimumAmount;

    private double maximumAmount;

    private Integer accountId;

    private String txnType;

    private List<Integer> invoiceIds;

    private List<String> gstnIdList;

    private List<Integer> branchIdList;

    private List<String> groupIdies;

    private Integer itemId;

    private String bankAccount;

    private String hbCode;

    private BigInteger totalRowCount;

    private String contactType;

    private boolean showContra;

    private Boolean isTax;

    private boolean isLedger;

    private boolean isExpenses;

    private Integer gstRate;

    private String gstnType;

    private String voutcherType;

    private String taxrate;

    private String invoiceType;

    private List<Integer> gstRateList;

    private Date parsedStartDate;

    private Date parsedEndDate;

    private Integer branchId;

    private Integer xBranchCode;

    private Integer fromBranchId;

    private Integer toBranchId;

    private boolean branchHoFlag;

    private String branchIds;

    private Integer reportingGroupId;

    private List<Integer> parentHbCatId;

    private boolean fetchMatchList;

    private String branch;

    private String category;

    private String companyGSTIN;

    private double lastRunningBalance;

    private List<String> gstReportCode;

    private String accountType;

    private int decimalsPlaces;

    private Integer exceptTxnId;

    private Integer txnId;

    private List<String> typeCodeList;

    private Integer inventoryId;

    private Integer inventoryBatchId;
    private List<Integer> monthList;

    private String financialYear;

    private String reportType;

    private boolean valuationFlag;

    // PMS
    private Integer projectId;
    private Integer taskId;
    private Integer taskGroupId;
    private Integer remainingTime;
    private Integer taskDelayedBy;

    private List<String> inventoryTypeFilter;
    private List<String> serviceTypeFilter;
    private List<String> inventoryUseAsFilter;
    private List<Integer> preferredVendorFilter;
    private List<String> salesTaxabilityFilter;
    private List<Double> salesGstFilter;
    private List<String> purchaseTaxabilityFilter;
    private List<Double> purchaseGstFilter;
    private List<String> itcEligibilityFilter;
    private Double itcClaimFilter;

    private Integer vendorId;
    private Integer customerId;
    private List<String> gstinErrorFilter;
    private List<String> paymentRemarkFilter;
    private List<String> fileNoFilter;
    private List<String> lotNoFilter;

    private boolean nativeCurrency = true;

    private List<Integer> contactList;
    private boolean allCustomerFlag;
    private String exportReportType;
    private boolean includeExpenseFlag;
    private boolean bulkPanVerify;

    private boolean openingBalanceFlag;
    private boolean closingBalanceFlag;
    private boolean txnBalanceFlag;
    private boolean excludeZeroFlag;

    private List<Integer> inventoryIdList;
    private List<Integer> groupIdList;
    private List<Integer> categoryIdList;
    private Integer attributeId;
    private Integer attributeOptionId;

    private String panStatusFilter;

    private boolean includeChildData;

    private Integer entityId;

    private Integer parentCatOptionId;
    private Integer catId;
    private Integer hbCatId;
    private boolean isHoOnly;
    private boolean isEdit;
    private boolean getAllData;
    //Lazy Export Fields
    private List<String> selectionOfFields;
    private String selectionOfFileType;
    private String matchType;

    private double openingQty;

    private List<String> generalInfoShowList;
    private List<String> manufacturerShowList;
    private List<String> saleGstShowList;
    private List<String> purchaseGstShowList;
    private List<String> priceAccountShowList;
    private List<String> itcShowList;
    private List<String> qtyMovShowList;
    private List<String> qtyLevShowList;

    private List<Integer> trackList;
    private Integer trackId;
    private String requestNo;
    private Integer selectedBranchId;
    private Integer selectedContactId;
    private boolean dropdownFlag;
    private boolean branchListFlag;
    private boolean isDeleted;
    private List<String> companyGstinList;

}
