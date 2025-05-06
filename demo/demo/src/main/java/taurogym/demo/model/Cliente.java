package taurogym.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends Persona {

    @Enumerated(EnumType.STRING)
    @ManyToOne
    private Membresia membresia;

}
