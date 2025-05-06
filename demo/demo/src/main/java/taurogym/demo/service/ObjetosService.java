package taurogym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taurogym.demo.model.Objetos;
import taurogym.demo.repository.ObjetosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ObjetosService {

    @Autowired
    private ObjetosRepository objetosRepository;

    public List<Objetos> findAll() {
        return objetosRepository.findAll();
    }

    public Optional<Objetos> findById(Long id) {
        return objetosRepository.findById(id);
    }

    public Objetos save(Objetos objeto) {
        return objetosRepository.save(objeto);
    }

    public void deleteById(Long id) {
        objetosRepository.deleteById(id);
    }
}
