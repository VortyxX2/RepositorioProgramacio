package taurogym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taurogym.demo.model.Material;
import taurogym.demo.service.MaterialService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/materiales")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<Material> getAll() {
        return materialService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Material> getById(@PathVariable Long id) {
        return materialService.findById(id);
    }

    @PostMapping
    public Material create(@RequestBody Material material) {
        return materialService.save(material);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        materialService.deleteById(id);
    }
}
