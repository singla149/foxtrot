package com.flipkart.foxtrot.core.exception;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by rishabh.goyal on 16/01/16.
 */
public class IndexOptimizationException extends FoxtrotException {

    private String message;

    protected IndexOptimizationException(String message, Throwable cause) {
        super(ErrorCode.INDEX_OPTIMIZATION_EXCEPTION, cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = Maps.newHashMap();
        map.put("message", this.message);
        return map;
    }
}
