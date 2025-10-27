package com.br.RegistrationClean.interfaceAdaptor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Long> {
}
