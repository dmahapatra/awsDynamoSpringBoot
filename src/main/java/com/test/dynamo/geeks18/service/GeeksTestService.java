/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * -- Geeks18 Confidential
 * ***************************************************************************
 * $Author$ $Id$ $DateTime$
 * ***************************************************************************/

package com.test.dynamo.geeks18.service;

import com.test.dynamo.geeks18.repository.RequestDto;

/** 
 * <code>GeeksTestService</code> is the service layer of application <br>
 *
 * @version <1.0> 
 * @author dmahapatra
 */
public interface GeeksTestService {
    /**
     * Service Layer to add the request Dto
     * 
     * @param requestDto
     * @return Object
     */
    public Object addRequest(RequestDto requestDto);
}
