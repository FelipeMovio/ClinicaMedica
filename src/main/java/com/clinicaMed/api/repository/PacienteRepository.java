package com.clinicaMed.api.repository;

import com.clinicaMed.api.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
