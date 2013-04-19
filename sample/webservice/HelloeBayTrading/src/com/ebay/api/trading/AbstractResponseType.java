// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Base type definition of a response payload that can carry any
 * type of payload content with following optional elements:<br>
 * - timestamp of response message<br>
 * - application-level acknowledgement<br>
 * - application-level (business-level) errors and warnings
 * 
 */
public abstract class AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Timestamp")
	@Order(value=0)
	public Date timestamp;	
	
	@Element(name = "Ack")
	@Order(value=1)
	public AckCodeType ack;	
	
	@Element(name = "CorrelationID")
	@Order(value=2)
	public String correlationID;	
	
	@Element(name = "Errors")
	@Order(value=3)
	public List<ErrorType> errors;	
	
	@Element(name = "Message")
	@Order(value=4)
	public String message;	
	
	@Element(name = "Version")
	@Order(value=5)
	public String version;	
	
	@Element(name = "Build")
	@Order(value=6)
	public String build;	
	
	@Element(name = "NotificationEventName")
	@Order(value=7)
	public String notificationEventName;	
	
	@Element(name = "DuplicateInvocationDetails")
	@Order(value=8)
	public DuplicateInvocationDetailsType duplicateInvocationDetails;	
	
	@Element(name = "RecipientUserID")
	@Order(value=9)
	public String recipientUserID;	
	
	@Element(name = "EIASToken")
	@Order(value=10)
	public String eiasToken;	
	
	@Element(name = "NotificationSignature")
	@Order(value=11)
	public String notificationSignature;	
	
	@Element(name = "HardExpirationWarning")
	@Order(value=12)
	public String hardExpirationWarning;	
	
	@Element(name = "BotBlock")
	@Order(value=13)
	public BotBlockResponseType botBlock;	
	
	@Element(name = "ExternalUserData")
	@Order(value=14)
	public String externalUserData;	
	
	@AnyElement
	@Order(value=15)
	public List<Object> any;	
	
    
}