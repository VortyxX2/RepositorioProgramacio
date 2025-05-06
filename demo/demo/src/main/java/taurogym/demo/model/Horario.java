package taurogym.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diaSemana;

    private String horaApertura;

    private String horaCierre;

    // Asumiendo que hay una relación con la clase 'ClaseGuiada'
    @ManyToOne
    @JoinColumn(name = "clase_guiada_id")
    private ClaseGuiada claseGuiada; // Debes tener una clase llamada ClaseGuiada definida en el modelo
}
