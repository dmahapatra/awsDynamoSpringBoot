/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * -- Geeks18 Confidential
 * ***************************************************************************
 * $Author$ $Id$ $DateTime$
 * ***************************************************************************/

package com.test.dynamo.geeks18.repository;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

/** 
 * <code>RequestId</code> is Key class <br>
 *
 * @version <1.0> 
 * @author dmahapatra
 */
public class RequestId implements Serializable{
    @DynamoDBHashKey(attributeName = "req_id")
    private String reqId;
    @DynamoDBRangeKey(attributeName = "req_name")
    private String regName;
    public String getReqId() {
        return reqId;
    }
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }
    public String getRegName() {
        return regName;
    }
    public void setRegName(String regName) {
        this.regName = regName;
    }
}
