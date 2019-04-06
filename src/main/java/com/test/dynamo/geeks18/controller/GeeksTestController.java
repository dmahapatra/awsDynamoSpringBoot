/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * -- Geeks18 Confidential
 * ***************************************************************************
 * $Author$ $Id$ $DateTime$
 * ***************************************************************************/

package com.test.dynamo.geeks18.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.dynamo.geeks18.constant.GeeksTestConstant;
import com.test.dynamo.geeks18.repository.RequestDto;
import com.test.dynamo.geeks18.service.GeeksTestService;

/**
 * <code>GeeksTestController</code> is a test controller to add the data in
 * dynamo DB <br>
 *
 * @version <1.0>
 * @author dmahapatra
 */
@RestController(value = GeeksTestConstant.BASE_URL)
public class GeeksTestController {

    @Autowired
    GeeksTestService service;
    
    private static final Logger log = LoggerFactory.getLogger(GeeksTestController.class);

    /**
     * Method to add value in DB
     * 
     * @param requestDto
     * @return Object
     */
    @PostMapping(value = GeeksTestConstant.ADD_URL, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object addToDynamoDB(@RequestBody RequestDto requestDto) {
        log.info("Request received with value {}", requestDto);
        return service.addRequest(requestDto);
    }
}
