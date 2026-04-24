package entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "endpoints")
public class endpoints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String ruta;
    private String metodo_http;
    private String descripcion;
    private int api_id;

    // Relacion 1 a muchos:
    @OneToMany(mappedBy = "apis")
    private List<apis> apis;



}
