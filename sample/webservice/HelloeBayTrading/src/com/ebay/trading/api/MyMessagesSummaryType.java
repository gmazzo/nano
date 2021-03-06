// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Summary data for a given user's alerts and messages.
 * This includes the numbers of new alerts and messages,
 * unresolved alerts, flagged messages, and total alerts
 * and messages.
 * 
 */
public class MyMessagesSummaryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FolderSummary")
	@Order(value=0)
	public List<MyMessagesFolderSummaryType> folderSummary;	
	
	@Element(name = "NewAlertCount")
	@Order(value=1)
	public Integer newAlertCount;	
	
	@Element(name = "NewMessageCount")
	@Order(value=2)
	public Integer newMessageCount;	
	
	@Element(name = "UnresolvedAlertCount")
	@Order(value=3)
	public Integer unresolvedAlertCount;	
	
	@Element(name = "FlaggedMessageCount")
	@Order(value=4)
	public Integer flaggedMessageCount;	
	
	@Element(name = "TotalAlertCount")
	@Order(value=5)
	public Integer totalAlertCount;	
	
	@Element(name = "TotalMessageCount")
	@Order(value=6)
	public Integer totalMessageCount;	
	
	@Element(name = "NewHighPriorityCount")
	@Order(value=7)
	public Integer newHighPriorityCount;	
	
	@Element(name = "TotalHighPriorityCount")
	@Order(value=8)
	public Integer totalHighPriorityCount;	
	
    
}