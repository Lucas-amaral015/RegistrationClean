package com.br.RegistrationClean.core.entities;

import com.br.RegistrationClean.core.Enums.TipoCurso;

import java.time.LocalDateTime;

public record Registration(Long id,
                           String nome,
                           int cpf,
                           TipoCurso tipo,
                           LocalDateTime inicioCadastro,
                           String local) {}
