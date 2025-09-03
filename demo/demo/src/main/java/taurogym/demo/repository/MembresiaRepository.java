package taurogym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taurogym.demo.model.Membresia;

public interface MembresiaRepository extends JpaRepository<Membresia, Long> {}

