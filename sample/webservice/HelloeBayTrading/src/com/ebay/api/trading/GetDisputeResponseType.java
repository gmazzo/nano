// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 *         Returned after calling GetDisputeRequest. Returns the record of
 *       a dispute, including the dispute state and other information.
 *       <br><br>Both Sellers and Buyers can use the SellerClosedDispute in
 *       Platform Notifications to receive a notification when a dispute has been closed.
 *       The notification includes the same data that is returned in the GetDispute response.
 * 
 */
@RootElement(name = "GetDisputeResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetDisputeResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Dispute")
	@Order(value=0)
	public DisputeType dispute;	
	
    
}