/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * -- Geeks18 Confidential
 * ***************************************************************************
 * $Author$ $Id$ $DateTime$
 * ***************************************************************************/

package com.test.dynamo.geeks18.dao.entity;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.test.dynamo.geeks18.repository.RequestDto;
import com.test.dynamo.geeks18.repository.RequestId;

/** 
 * <code>RequestRepository</code> is the repository class <br>
 *
 * @version <1.0> 
 * @author dmahapatra
 */
@EnableScan
public interface RequestRepository extends CrudRepository<RequestDto, RequestId>{

}
