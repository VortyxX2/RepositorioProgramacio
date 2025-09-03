package taurogym.demo.model;

import jakarta.persistence.*;
import lombok.*;
import taurogym.demo.enums.TypeMembership;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Membresia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypeMembership tipo;
    private double precio;
    private String acceso;
}
