package com.br.RegistrationClean.interfaceAdaptor.dtos;

import com.br.RegistrationClean.core.enums.TypeCourse;

import java.time.LocalDateTime;

public record RegistrationDto(Long id,
                              String name,
                              String cpf,
                              TypeCourse type,
                              LocalDateTime homeRegistration,
                              String locationCollege) {}
