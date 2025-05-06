package taurogym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taurogym.demo.model.Imagen;

public interface ImagenRepository extends JpaRepository<Imagen, Long> {}
