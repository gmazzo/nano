// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Type to contain the data for one eBay user. Depending on the context, the user
 * might be the seller or the buyer on either side of an order, or the bidder or winning bidder
 * in a listing. An object of this type is returned by a number of calls, including
 * the GetUser call.
 * 
 */
public class UserType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AboutMePage")
	@Order(value=0)
	public Boolean aboutMePage;	
	
	@Element(name = "EIASToken")
	@Order(value=1)
	public String eiasToken;	
	
	@Element(name = "Email")
	@Order(value=2)
	public String email;	
	
	@Element(name = "FeedbackScore")
	@Order(value=3)
	public Integer feedbackScore;	
	
	@Element(name = "UniqueNegativeFeedbackCount")
	@Order(value=4)
	public Integer uniqueNegativeFeedbackCount;	
	
	@Element(name = "UniquePositiveFeedbackCount")
	@Order(value=5)
	public Integer uniquePositiveFeedbackCount;	
	
	@Element(name = "PositiveFeedbackPercent")
	@Order(value=6)
	public Float positiveFeedbackPercent;	
	
	@Element(name = "FeedbackPrivate")
	@Order(value=7)
	public Boolean feedbackPrivate;	
	
	@Element(name = "FeedbackRatingStar")
	@Order(value=8)
	public FeedbackRatingStarCodeType feedbackRatingStar;	
	
	@Element(name = "IDVerified")
	@Order(value=9)
	public Boolean idVerified;	
	
	@Element
	@Order(value=10)
	public Boolean eBayGoodStanding;	
	
	@Element(name = "NewUser")
	@Order(value=11)
	public Boolean newUser;	
	
	@Element(name = "RegistrationAddress")
	@Order(value=12)
	public AddressType registrationAddress;	
	
	@Element(name = "RegistrationDate")
	@Order(value=13)
	public Date registrationDate;	
	
	@Element(name = "Site")
	@Order(value=14)
	public SiteCodeType site;	
	
	@Element(name = "Status")
	@Order(value=15)
	public UserStatusCodeType status;	
	
	@Element(name = "UserID")
	@Order(value=16)
	public String userID;	
	
	@Element(name = "UserIDChanged")
	@Order(value=17)
	public Boolean userIDChanged;	
	
	@Element(name = "UserIDLastChanged")
	@Order(value=18)
	public Date userIDLastChanged;	
	
	@Element(name = "VATStatus")
	@Order(value=19)
	public VATStatusCodeType vatStatus;	
	
	@Element(name = "BuyerInfo")
	@Order(value=20)
	public BuyerType buyerInfo;	
	
	@Element(name = "SellerInfo")
	@Order(value=21)
	public SellerType sellerInfo;	
	
	@Element(name = "BusinessRole")
	@Order(value=22)
	public BusinessRoleType businessRole;	
	
	@Element(name = "CharityAffiliations")
	@Order(value=23)
	public CharityAffiliationsType charityAffiliations;	
	
	@Element(name = "PayPalAccountLevel")
	@Order(value=24)
	public PayPalAccountLevelCodeType payPalAccountLevel;	
	
	@Element(name = "PayPalAccountType")
	@Order(value=25)
	public PayPalAccountTypeCodeType payPalAccountType;	
	
	@Element(name = "PayPalAccountStatus")
	@Order(value=26)
	public PayPalAccountStatusCodeType payPalAccountStatus;	
	
	@Element(name = "UserSubscription")
	@Order(value=27)
	public List<EBaySubscriptionTypeCodeType> userSubscription;	
	
	@Element(name = "SiteVerified")
	@Order(value=28)
	public Boolean siteVerified;	
	
	@Element(name = "SkypeID")
	@Order(value=29)
	public List<String> skypeID;	
	
	@Element
	@Order(value=30)
	public Boolean eBayWikiReadOnly;	
	
	@Element(name = "TUVLevel")
	@Order(value=31)
	public Integer tuvLevel;	
	
	@Element(name = "VATID")
	@Order(value=32)
	public String vatid;	
	
	@Element(name = "MotorsDealer")
	@Order(value=33)
	public Boolean motorsDealer;	
	
	@Element(name = "SellerPaymentMethod")
	@Order(value=34)
	public SellerPaymentMethodCodeType sellerPaymentMethod;	
	
	@Element(name = "BiddingSummary")
	@Order(value=35)
	public BiddingSummaryType biddingSummary;	
	
	@Element(name = "UserAnonymized")
	@Order(value=36)
	public Boolean userAnonymized;	
	
	@Element(name = "UniqueNeutralFeedbackCount")
	@Order(value=37)
	public Integer uniqueNeutralFeedbackCount;	
	
	@Element(name = "EnterpriseSeller")
	@Order(value=38)
	public Boolean enterpriseSeller;	
	
	@Element(name = "BillingEmail")
	@Order(value=39)
	public String billingEmail;	
	
	@Element(name = "QualifiesForSelling")
	@Order(value=40)
	public Boolean qualifiesForSelling;	
	
	@Element(name = "StaticAlias")
	@Order(value=41)
	public String staticAlias;	
	
	@AnyElement
	@Order(value=42)
	public List<Object> any;	
	
    
}