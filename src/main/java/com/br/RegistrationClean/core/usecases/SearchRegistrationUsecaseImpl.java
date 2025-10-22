package com.br.RegistrationClean.core.usecases;


import com.br.RegistrationClean.core.entities.Registration;
import com.br.RegistrationClean.core.gateway.RegistrationGateway;

import java.util.List;

public class SearchRegistrationUsecaseImpl implements SearchRegistrationUsecase {

   public final RegistrationGateway registrationGateway;

    public SearchRegistrationUsecaseImpl(RegistrationGateway registrationGateway) {
        this.registrationGateway = registrationGateway;
    }

    @Override
    public List<Registration> execute() {

        return registrationGateway.searchRegistration();
    }
}
