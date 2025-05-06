package taurogym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taurogym.demo.model.Maquinas;
import taurogym.demo.repository.MaquinasRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MaquinasService {

    @Autowired
    private MaquinasRepository maquinasRepository;

    public List<Maquinas> findAll() {
        return maquinasRepository.findAll();
    }

    public Optional<Maquinas> findById(Long id) {
        return maquinasRepository.findById(id);
    }

    public Maquinas save(Maquinas maquina) {
        return maquinasRepository.save(maquina);
    }

    public void deleteById(Long id) {
        maquinasRepository.deleteById(id);
    }
}
