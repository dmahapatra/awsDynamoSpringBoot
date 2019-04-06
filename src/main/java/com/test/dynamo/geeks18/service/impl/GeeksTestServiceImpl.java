/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * -- Geeks18 Confidential
 * ***************************************************************************
 * $Author$ $Id$ $DateTime$
 * ***************************************************************************/

package com.test.dynamo.geeks18.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dynamo.geeks18.dao.GeeksTestDao;
import com.test.dynamo.geeks18.repository.RequestDto;
import com.test.dynamo.geeks18.service.GeeksTestService;

/**
 * <code>GeeksTestServiceImpl</code> is implementation of GeeksTestService <br>
 *
 * @version <1.0>
 * @author dmahapatra
 */
public class GeeksTestServiceImpl implements GeeksTestService {

    @Autowired
    GeeksTestDao dao;

    /**
     * method to add the request dto
     * 
     * @return Object
     * @see com.test.dynamo.geeks18.service.GeeksTestService#addRequest(com.test.dynamo.geeks18.repository.RequestDto)
     */
    @Override
    public Object addRequest(RequestDto requestDto) {
        return dao.addRequest(requestDto);
    }

}
