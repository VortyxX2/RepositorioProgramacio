package taurogym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taurogym.demo.model.ClaseGuiada;
import taurogym.demo.service.ClaseGuiadaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clases")
public class ClaseGuiadaController {

    @Autowired
    private ClaseGuiadaService claseService;

    @GetMapping
    public List<ClaseGuiada> getAll() {
        return claseService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ClaseGuiada> getById(@PathVariable Long id) {
        return claseService.findById(id);
    }

    @PostMapping
    public ClaseGuiada create(@RequestBody ClaseGuiada clase) {
        return claseService.save(clase);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        claseService.deleteById(id);
    }
}
