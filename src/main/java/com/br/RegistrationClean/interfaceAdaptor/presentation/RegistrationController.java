package com.br.RegistrationClean.interfaceAdaptor.presentation;


import com.br.RegistrationClean.core.entities.Registration;
import com.br.RegistrationClean.core.usecases.CreateRegistrationUsecase;
import com.br.RegistrationClean.core.usecases.SearchRegistrationUsecase;
import com.br.RegistrationClean.interfaceAdaptor.dtos.RegistrationDto;
import com.br.RegistrationClean.interfaceAdaptor.mapper.RegistrationDtoMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("api/v1/")
public class RegistrationController {

    private final CreateRegistrationUsecase createRegistrationUsecase;
    private final RegistrationDtoMapper registrationDtoMapper;
    private final SearchRegistrationUsecase searchRegistrationUsecase;

    public RegistrationController(CreateRegistrationUsecase createRegistrationUsecase,
                                  RegistrationDtoMapper registrationDtoMapper,
                                  SearchRegistrationUsecase searchRegistrationUsecase) {

        this.createRegistrationUsecase = createRegistrationUsecase;
        this.registrationDtoMapper = registrationDtoMapper;
        this.searchRegistrationUsecase = searchRegistrationUsecase;
    }

    @PostMapping("createregistration")
    public ResponseEntity<Map<String, Object>> createRegistration(@RequestBody RegistrationDto registrationDto){
        Registration newRegistration = createRegistrationUsecase.execute(registrationDtoMapper.toDomain(registrationDto));
        Map<String, Object> response = new HashMap<>();
        response.put("Message: ", " registration successfully created in the database");
        response.put("registration data: ", registrationDtoMapper.toDto(newRegistration));
        return ResponseEntity.ok(response);
    }

    @GetMapping("searchregistration")
    public List<RegistrationDto> searchRegistration(){
        return
                searchRegistrationUsecase.execute().stream().map(registrationDtoMapper::toDto).collect(Collectors.toList());
    }

}
