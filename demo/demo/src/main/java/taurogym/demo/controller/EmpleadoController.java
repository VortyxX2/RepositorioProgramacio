package taurogym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taurogym.demo.model.Empleado;
import taurogym.demo.service.EmpleadoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> getAll() {
        return empleadoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Empleado> getById(@PathVariable Long id) {
        return empleadoService.findById(id);
    }

    @PostMapping
    public Empleado create(@RequestBody Empleado empleado) {
        return empleadoService.save(empleado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        empleadoService.deleteById(id);
    }
}
