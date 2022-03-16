package org.uv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.demo.model.Empleados;

/**
 *
 * @author citla
 */
public interface EmpleadoRepository extends JpaRepository<Empleados, Long>{
    
}
