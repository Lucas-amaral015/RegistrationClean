package com.br.RegistrationClean.core.entities;

import com.br.RegistrationClean.core.enums.TypeCourse;

import java.time.LocalDateTime;

public record Registration(Long id,
                           String name,
                           int cpf,
                           TypeCourse type,
                           LocalDateTime homeRegistration,
                           String locationCollege) {}
