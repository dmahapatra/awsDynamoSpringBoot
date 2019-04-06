/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * -- Geeks18 Confidential
 * ***************************************************************************
 * $Author$ $Id$ $DateTime$
 * ***************************************************************************/

package com.test.dynamo.geeks18.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dynamo.geeks18.dao.GeeksTestDao;
import com.test.dynamo.geeks18.dao.entity.RequestRepository;
import com.test.dynamo.geeks18.repository.RequestDto;

/** 
 * <code>GeeksTestDaoImpl</code> is the implementation of GeeksTestDao <br>
 *
 * @version <1.0> 
 * @author dmahapatra
 */
public class GeeksTestDaoImpl implements GeeksTestDao {
    
    @Autowired
    private RequestRepository repository;
    
    /**
     * addRequest is the implementation of the add request to the Dynamo DB
     * 
     * @param requestDto
     * @see com.test.dynamo.geeks18.dao.GeeksTestDao#addRequest(com.test.dynamo.geeks18.repository.RequestDto)
     */
    @Override
    public RequestDto addRequest(RequestDto requestDto) {
        return repository.save(requestDto);
    }
    
}
