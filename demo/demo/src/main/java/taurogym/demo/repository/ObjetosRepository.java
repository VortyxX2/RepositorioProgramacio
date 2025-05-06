package taurogym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taurogym.demo.model.Objetos;

public interface ObjetosRepository extends JpaRepository<Objetos, Long> {}

