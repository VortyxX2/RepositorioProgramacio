package taurogym.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import taurogym.demo.model.Maquinas;

public interface MaquinasRepository extends JpaRepository<Maquinas, Long> {}

