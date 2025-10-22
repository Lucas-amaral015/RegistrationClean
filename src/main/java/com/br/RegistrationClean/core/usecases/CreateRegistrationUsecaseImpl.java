package com.br.RegistrationClean.core.usecases;

import com.br.RegistrationClean.core.entities.Registration;
import com.br.RegistrationClean.core.gateway.RegistrationGateway;
import com.br.RegistrationClean.interfaceAdaptor.exception.DuplicateRegistrationException;

public class CreateRegistrationUsecaseImpl implements CreateRegistrationUsecase {


    public final RegistrationGateway registrationGateway;


    public CreateRegistrationUsecaseImpl(RegistrationGateway registrationGateway) {
        this.registrationGateway = registrationGateway;
    }


    @Override
    public Registration execute(Registration registration) {

        if (registrationGateway.existsByCpf(registration.cpf())){

            throw new DuplicateRegistrationException("The CPF number: " + registration.cpf() + " already exists");
        }

        return registrationGateway.createRegistration(registration);
    }
}
