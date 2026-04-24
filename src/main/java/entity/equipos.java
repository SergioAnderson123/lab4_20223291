package entity;


import jakarta.persistence.*;
import entity.apis;
import java.util.List;

@Entity
@Table(name = "equipos")

public class equipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)

    private String nombre;
    private String area;


}
