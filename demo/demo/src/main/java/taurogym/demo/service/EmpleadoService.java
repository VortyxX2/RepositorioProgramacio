package taurogym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taurogym.demo.model.Empleado;
import taurogym.demo.repository.EmpleadoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }

    public Empleado save(Empleado employee) {
        return empleadoRepository.save(employee);
    }

    public void deleteById(Long id) {
        empleadoRepository.deleteById(id);
    }
}
