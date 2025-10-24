package com.br.RegistrationClean.interfaceAdaptor.mapper;

import com.br.RegistrationClean.core.entities.Registration;
import com.br.RegistrationClean.interfaceAdaptor.dtos.RegistrationDto;
import org.springframework.stereotype.Component;

@Component
public class RegistrationDtoMapper {

    public  RegistrationDto toDto(Registration registration){

        return new RegistrationDto(

                registration.id(),
                registration.name(),
                registration.cpf(),
                registration.type(),
                registration.homeRegistration(),
                registration.locationCollege()
        );
    }

    public Registration toDomain(RegistrationDto registrationDto){

        return new Registration(
                registrationDto.id(),
                registrationDto.name(),
                registrationDto.cpf(),
                registrationDto.type(),
                registrationDto.homeRegistration(),
                registrationDto.locationCollege()
        );
    }

}
