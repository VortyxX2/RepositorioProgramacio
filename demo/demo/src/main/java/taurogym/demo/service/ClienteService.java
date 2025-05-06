package taurogym.demo.service;

import taurogym.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taurogym.demo.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository ClienteRepository;

    public List<Cliente> findAll() {
        return ClienteRepository.findAll();
    }

    public Optional<Cliente> findById(Long id) {
        return ClienteRepository.findById(id);
    }

    public Cliente save(Cliente client) {
        return ClienteRepository.save(client);
    }

    public void deleteById(Long id) {
        ClienteRepository.deleteById(id);
    }
}

