package taurogym.demo.repository;

// ClientRepository.java

import org.springframework.data.jpa.repository.JpaRepository;
import taurogym.demo.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}

