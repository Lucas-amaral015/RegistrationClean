package com.br.RegistrationClean.interfaceAdaptor.persistence;

import com.br.RegistrationClean.core.enums.TypeCourse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Registration")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;

    @Enumerated(EnumType.STRING)
    private TypeCourse type;
    private LocalDateTime homeRegistration;
    private String locationCollege;

}
