package com.br.RegistrationClean.interfaceAdaptor.mapper;

import com.br.RegistrationClean.core.entities.Registration;
import com.br.RegistrationClean.interfaceAdaptor.persistence.RegistrationEntity;
import org.springframework.stereotype.Component;

@Component
public class RegistrationEntityMapper {

    public RegistrationEntity toEntity(Registration registration){

        return new RegistrationEntity(

                registration.id(),
                registration.name(),
                registration.cpf(),
                registration.type(),
                registration.homeRegistration(),
                registration.locationCollege()
        );

    }

    public Registration toDomain(RegistrationEntity registrationEntity){

        return new Registration(

                registrationEntity.getId(),
                registrationEntity.getName(),
                registrationEntity.getCpf(),
                registrationEntity.getType(),
                registrationEntity.getHomeRegistration(),
                registrationEntity.getLocationCollege()

        );

    }
}
