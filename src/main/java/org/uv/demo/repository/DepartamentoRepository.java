package org.uv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.demo.model.Departamentos;

/**
 *
 * @author citla
 */
public interface DepartamentoRepository extends JpaRepository<Departamentos, Long>{
    
}
