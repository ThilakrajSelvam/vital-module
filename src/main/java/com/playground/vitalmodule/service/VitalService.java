package com.playground.vitalmodule.service;

import com.playground.vitalmodule.dto.VitalDto;

import java.util.List;
import java.util.UUID;

/**
 * VitalService provides the services for vital signs
 *
 * @author thilak
 * @created 12/4/20
 */
public interface VitalService {

    /**
     * Saves the vital signs
     *
     * @param vitalDto
     * @return
     */
    VitalDto createVitalSign(VitalDto vitalDto);

    /**
     * Retrieves the vital signs
     *
     * @param patientId
     * @return
     */
    List<VitalDto> getVitalSigns(UUID patientId);
}
