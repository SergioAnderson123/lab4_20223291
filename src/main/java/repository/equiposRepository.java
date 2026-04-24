package repository;

import entity.apis;
import entity.equipos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface equiposRepository extends JpaRepository<equipos,Integer> {


    // LISTAR EQUIPOS:
    List<equipos> findAllByApis_Id(int id);

    

}
