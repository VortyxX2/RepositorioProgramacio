package taurogym.demo.model;

import jakarta.persistence.*;
import lombok.*;
import taurogym.demo.enums.TypePuesto;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado extends Persona {

    @Enumerated(EnumType.STRING)
    private TypePuesto puesto;

    private double salario;
}
