package entity;


import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Table(name = "apis")
public class apis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;
    private String version;
    private LocalDate fecha_registro;
    private String estado;
    private int equipo_id;

    // Relaciones que existen:

    // Relacion 1 a muchos:
    @OneToMany(mappedBy = "equipos")
    private List<equipos> equipos;


}
