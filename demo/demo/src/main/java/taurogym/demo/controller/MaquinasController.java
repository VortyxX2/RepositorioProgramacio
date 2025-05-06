package taurogym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taurogym.demo.model.Maquinas;
import taurogym.demo.service.MaquinasService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/maquinas")
public class MaquinasController {

    @Autowired
    private MaquinasService maquinasService;

    @GetMapping
    public List<Maquinas> getAll() {
        return maquinasService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Maquinas> getById(@PathVariable Long id) {
        return maquinasService.findById(id);
    }

    @PostMapping
    public Maquinas create(@RequestBody Maquinas maquina) {
        return maquinasService.save(maquina);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        maquinasService.deleteById(id);
    }
}
