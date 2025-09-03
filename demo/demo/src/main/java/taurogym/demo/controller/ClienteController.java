package taurogym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taurogym.demo.model.Cliente;
import taurogym.demo.service.ClienteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> getById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clienteService.deleteById(id);
    }
}
