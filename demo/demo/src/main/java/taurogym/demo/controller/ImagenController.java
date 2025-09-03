package taurogym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taurogym.demo.model.Imagen;
import taurogym.demo.service.ImagenService;

import java.util.List;

@RestController
@RequestMapping("/imagenes")
public class ImagenController {

    @Autowired
    private ImagenService imagenService;

    @GetMapping
    public List<Imagen> getAll() {
        return imagenService.findAll();
    }

    @PostMapping
    public Imagen save(@RequestBody Imagen imagen) {
        return imagenService.save(imagen);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        imagenService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Imagen getById(@PathVariable Long id) {
        return imagenService.findById(id);
    }
}
