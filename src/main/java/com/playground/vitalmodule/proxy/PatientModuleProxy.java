package com.playground.vitalmodule.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;
/**
 * PatientModuleProxy is the feign client for patient-module microservice
 *
 * @author thilak
 * @created 12/4/20
 */
@FeignClient(name = "patient-module")
public interface PatientModuleProxy {

    /**
     * Rerieves the patientId
     *
     * @return
     */
    @GetMapping(path = "/patients/patientid")
    public UUID getPatientId();
}
