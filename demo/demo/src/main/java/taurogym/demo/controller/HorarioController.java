package taurogym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import taurogym.demo.model.Horario;
import taurogym.demo.service.HorarioService;

import java.util.List;

@RestController
@RequestMapping("/api/horarios")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    // Obtener todos los horarios
    @GetMapping
    public List<Horario> getAllHorarios() {
        return horarioService.findAll();
    }

    // Obtener horario por ID
    @GetMapping("/{id}")
    public ResponseEntity<Horario> getHorarioById(@PathVariable Long id) {
        return horarioService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear nuevo horario
    @PostMapping
    public Horario createHorario(@RequestBody Horario horario) {
        return horarioService.save(horario);
    }

    // Actualizar horario existente
    @PutMapping("/{id}")
    public ResponseEntity<Horario> updateHorario(@PathVariable Long id, @RequestBody Horario updatedHorario) {
        return horarioService.findById(id)
                .map(existing -> {
                    existing.setDiaSemana(updatedHorario.getDiaSemana());
                    existing.setHoraApertura(updatedHorario.getHoraApertura());
                    existing.setHoraCierre(updatedHorario.getHoraCierre());
                    return ResponseEntity.ok(horarioService.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Eliminar horario
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHorario(@PathVariable Long id) {
        if (horarioService.findById(id).isPresent()) {
            horarioService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
