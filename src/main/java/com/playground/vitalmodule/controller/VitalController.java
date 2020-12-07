package com.playground.vitalmodule.controller;

import com.playground.vitalmodule.dto.VitalDto;
import com.playground.vitalmodule.service.VitalService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * VitalController provides rest endpoints of vital signs
 *
 * @author thilak
 * @created 12/4/20
 */
@RestController
@RequestMapping("/vitals")
@RequiredArgsConstructor
public class VitalController {

    private final VitalService vitalService;

    /**
     * Saves the vital signs
     *
     * @param vitalDto
     * @return
     */
    @PostMapping
    @ApiOperation(value = "Saves the vital signs")
    @ResponseStatus(value = HttpStatus.CREATED)
    public VitalDto createVitalSign(@RequestBody VitalDto vitalDto) {
        return vitalService.createVitalSign(vitalDto);

    }

    /**
     * Retrieves the vital signs
     *
     * @param patientId
     * @return
     */
    @GetMapping("/{patientId}")
    @ApiOperation(value = "Retrieves the vital signs")
    public List<VitalDto> getVitalSigns(@PathVariable UUID patientId) {
        return vitalService.getVitalSigns(patientId);
    }

}
