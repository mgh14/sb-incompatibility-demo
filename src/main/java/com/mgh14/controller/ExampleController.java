package com.mgh14.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
public class ExampleController
{
    @ApiOperation(value = "abc", notes = "notes here please")
    @GetMapping(path = "/endpoint/{id}")
    public ResponseEntity<Map<String, String>> get(@ApiParam(required = true, value = "Example value param") @PathParam("id") String id)
    {
        return ResponseEntity.ok((new HashMap<>()));
    }
}
