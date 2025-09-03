package taurogym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taurogym.demo.model.Objetos;
import taurogym.demo.service.ObjetosService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/objetos")
public class ObjetosController {

    @Autowired
    private ObjetosService objetosService;

    @GetMapping
    public List<Objetos> getAll() {
        return objetosService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Objetos> getById(@PathVariable Long id) {
        return objetosService.findById(id);
    }

    @PostMapping
    public Objetos create(@RequestBody Objetos objeto) {
        return objetosService.save(objeto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        objetosService.deleteById(id);
    }
}
