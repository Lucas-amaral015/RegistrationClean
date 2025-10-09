-- V1_create_table_registration.sql

CREATE TABLE Registration (

    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    home_registration TIMESTAMP NOT NULL,
    location_college VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL
);