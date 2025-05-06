package taurogym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taurogym.demo.model.Membresia;
import taurogym.demo.service.MembresiaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/membresias")
public class MembresiaController {

    @Autowired
    private MembresiaService membresiaService;

    @GetMapping
    public List<Membresia> getAll() {
        return membresiaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Membresia> getById(@PathVariable Long id) {
        return membresiaService.findById(id);
    }

    @PostMapping
    public Membresia create(@RequestBody Membresia membresia) {
        return membresiaService.save(membresia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        membresiaService.deleteById(id);
    }
}
