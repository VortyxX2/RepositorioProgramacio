package taurogym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taurogym.demo.model.Imagen;
import taurogym.demo.repository.ImagenRepository;

import java.util.List;

@Service
public class ImagenService {

    @Autowired
    private ImagenRepository imagenRepository;

    public List<Imagen> findAll() {
        return imagenRepository.findAll();
    }

    public Imagen save(Imagen imagen) {
        return imagenRepository.save(imagen);
    }

    public void deleteById(Long id) {
        imagenRepository.deleteById(id);
    }

    public Imagen findById(Long id) {
        return imagenRepository.findById(id).orElse(null);
    }
}
