package taurogym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import taurogym.demo.model.Horario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> {
}
