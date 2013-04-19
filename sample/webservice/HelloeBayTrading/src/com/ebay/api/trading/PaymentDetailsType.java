// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>PaymentDetails</b> container, which is used by the seller to
 * specify amounts and due dates for deposits and full payment on motor vehicle listings.
 * 
 */
public class PaymentDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "HoursToDeposit")
	@Order(value=0)
	public Integer hoursToDeposit;	
	
	@Element(name = "DaysToFullPayment")
	@Order(value=1)
	public Integer daysToFullPayment;	
	
	@Element(name = "DepositAmount")
	@Order(value=2)
	public AmountType depositAmount;	
	
	@Element(name = "DepositType")
	@Order(value=3)
	public DepositTypeCodeType depositType;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}