package org.uv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uv.demo.model.Departamentos;

/**
 *
 * @author citla
 */
@Repository
public interface DepartamentoRepository extends JpaRepository<Departamentos, Long>{
    
}
