package taurogym.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClaseGuiada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int duracion;
    private int sala;

    @ManyToOne
    private Empleado monitor;

    @OneToMany(mappedBy = "claseGuiada", cascade = CascadeType.ALL)
    private List<Horario> horarios;
}
