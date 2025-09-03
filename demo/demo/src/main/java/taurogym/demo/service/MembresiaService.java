package taurogym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taurogym.demo.model.Membresia;
import taurogym.demo.repository.MembresiaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MembresiaService {

    @Autowired
    private MembresiaRepository membresiaRepository;

    public List<Membresia> findAll() {
        return membresiaRepository.findAll();
    }

    public Optional<Membresia> findById(Long id) {
        return membresiaRepository.findById(id);
    }

    public Membresia save(Membresia membresia) {
        return membresiaRepository.save(membresia);
    }

    public void deleteById(Long id) {
        membresiaRepository.deleteById(id);
    }
}

