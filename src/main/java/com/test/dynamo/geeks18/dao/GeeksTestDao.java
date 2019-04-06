/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * -- Geeks18 Confidential
 * ***************************************************************************
 * $Author$ $Id$ $DateTime$
 * ***************************************************************************/

package com.test.dynamo.geeks18.dao;

import com.test.dynamo.geeks18.repository.RequestDto;

/** 
 * <code>GeeksTestDao</code> is the Dao class <br>
 *
 * @version <1.0> 
 * @author dmahapatra
 */
public interface GeeksTestDao {

    /**
     * addRequest is the method for adding the request in the DB
     * 
     * @param requestDto
     * @return RequestDto
     */
    RequestDto addRequest(RequestDto requestDto);

}
