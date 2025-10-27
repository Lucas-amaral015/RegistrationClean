package com.br.RegistrationClean.interfaceAdaptor.gateway;

import com.br.RegistrationClean.core.entities.Registration;
import com.br.RegistrationClean.core.gateway.RegistrationGateway;
import com.br.RegistrationClean.interfaceAdaptor.mapper.RegistrationEntityMapper;
import com.br.RegistrationClean.interfaceAdaptor.persistence.RegistrationEntity;
import com.br.RegistrationClean.interfaceAdaptor.persistence.RegistrationRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationRepositoryGateway implements RegistrationGateway {

    public final RegistrationRepository registrationRepository;
    public final RegistrationEntityMapper mapper;


    public RegistrationRepositoryGateway(RegistrationRepository registrationRepository, RegistrationEntityMapper mapper) {
        this.registrationRepository = registrationRepository;
        this.mapper = mapper;
    }

    @Override
    public Registration createRegistration(Registration registration) {

        RegistrationEntity entity = mapper.toEntity(registration);
        RegistrationEntity newRegistration = registrationRepository.save(entity);
        return mapper.toDomain(newRegistration);
    }

    @Override
    public List<Registration> searchRegistration() {
        return registrationRepository.findAll().stream().map(mapper::toDomain).toList();
    }

    @Override
    public boolean existsByCpf(String cpf) {
        return registrationRepository.findAll().stream()
                .anyMatch(registration -> registration.getCpf().equalsIgnoreCase(cpf));
    }
}


