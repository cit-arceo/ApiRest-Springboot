package org.uv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uv.demo.model.Empleados;

/**
 *
 * @author citla
 */
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleados, Long>{
    
}
