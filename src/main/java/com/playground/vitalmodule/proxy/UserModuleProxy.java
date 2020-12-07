package com.playground.vitalmodule.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

/**
 * UserModuleProxy is the feign client for user-module microservice
 *
 * @author thilak
 * @created 12/4/20
 */
@FeignClient(name = "user-module", url = "localhost:9000")
public interface UserModuleProxy {

    /**
     * Rerieves the DoctorId
     *
     * @return
     */
    @GetMapping(path = "/users/userid")
    public UUID getUserId();

}
