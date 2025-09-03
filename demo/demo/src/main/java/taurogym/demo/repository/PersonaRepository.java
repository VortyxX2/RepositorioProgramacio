package taurogym.demo.repository;

// PersonRepository.java (solo si quieres consultas generales de personas)

import taurogym.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {}

