package com.br.RegistrationClean.core.gateway;

import com.br.RegistrationClean.core.entities.Registration;

import java.util.List;

public interface RegistrationGateway {

    Registration createRegistration(Registration registration);

    List<Registration> searchRegistration();

    boolean existsByCpf(String cpf);
}
