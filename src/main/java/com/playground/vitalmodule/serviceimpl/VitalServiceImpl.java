package com.playground.vitalmodule.serviceimpl;

import com.playground.vitalmodule.dto.VitalDto;
import com.playground.vitalmodule.entity.Vital;
import com.playground.vitalmodule.proxy.PatientModuleProxy;
import com.playground.vitalmodule.proxy.UserModuleProxy;
import com.playground.vitalmodule.repository.VitalRepository;
import com.playground.vitalmodule.service.VitalService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author thilak
 * @created 12/7/20
 */
@Service
@RequiredArgsConstructor
public class VitalServiceImpl implements VitalService {

    private final VitalRepository vitalRepository;

    private final ModelMapper modelMapper;

    private final UserModuleProxy userModuleProxy;

    private final PatientModuleProxy patientModuleProxy;

    /**
     * Saves the vital signs
     *
     * @param vitalDto
     * @return
     */
    @Override
    public VitalDto createVitalSign(VitalDto vitalDto) {
        Vital vital = modelMapper.map(vitalDto, Vital.class);
        vital.setUserId(userModuleProxy.getUserId());
        vital.setPatientId(patientModuleProxy.getPatientId());
        vital = vitalRepository.save(vital);
        return modelMapper.map(vital, VitalDto.class);
    }

    /**
     * Retrieves the vital signs
     *
     * @param patientId
     * @return
     */
    @Override
    public List<VitalDto> getVitalSigns(UUID patientId) {
        Vital vital = new Vital();
        vital.setPatientId(patientId);
        Example<Vital> example = Example.of(vital);
        List<Vital> vitals = vitalRepository.findAll(example);
        return vitals.stream().map(user -> modelMapper.map(user, VitalDto.class))
                .collect(Collectors.toList());
    }
}
