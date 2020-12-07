package com.playground.vitalmodule.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.util.UUID;

/**
 * VitalDto is the dto of Vital Entity
 *
 * @author thilak
 * @created 12/4/20
 */
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class VitalDto {

    private UUID vitalId;

    private UUID userId;

    private UUID patientId;

    private Integer pulse;

    private Integer systolicBp;

    private Integer diastolicBp;

    private Integer height;

    private Integer weight;

    private Double pt;

    private Double inr;
}
