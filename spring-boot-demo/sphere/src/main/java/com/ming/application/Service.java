package com.ming.application;

import com.ming.application.req.HelloRequest;
import com.ming.application.resp.HelloResponse;

/**
 * @author xu.mingming
 */
public interface Service {
    HelloResponse hello(HelloRequest request);
}
