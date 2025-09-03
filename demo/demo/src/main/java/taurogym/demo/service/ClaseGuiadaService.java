package taurogym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taurogym.demo.model.ClaseGuiada;
import taurogym.demo.repository.ClaseGuiadaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClaseGuiadaService {

    @Autowired
    private ClaseGuiadaRepository claseGuiadaRepository;

    public List<ClaseGuiada> findAll() {
        return claseGuiadaRepository.findAll();
    }

    public Optional<ClaseGuiada> findById(Long id) {
        return claseGuiadaRepository.findById(id);
    }

    public ClaseGuiada save(ClaseGuiada clase) {
        return claseGuiadaRepository.save(clase);
    }

    public void deleteById(Long id) {
        claseGuiadaRepository.deleteById(id);
    }
}
