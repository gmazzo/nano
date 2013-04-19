// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Returns contact information to a seller for both bidders
 * and users who have made offers (via Best Offer) during
 * an active listing.
 * 
 */
@RootElement(name = "GetUserContactDetailsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetUserContactDetailsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "UserID")
	@Order(value=0)
	public String userID;	
	
	@Element(name = "ContactAddress")
	@Order(value=1)
	public AddressType contactAddress;	
	
	@Element(name = "RegistrationDate")
	@Order(value=2)
	public Date registrationDate;	
	
    
}