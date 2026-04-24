package repository;
import entity.apis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface apisRepository extends JpaRepository<apis, Integer> {

    // Listar Apis:
    List<apis> findAllByApis_Id(int id);

}
