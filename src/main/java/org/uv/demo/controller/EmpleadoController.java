package org.uv.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.demo.model.Empleados;
import org.uv.demo.repository.EmpleadoRepository;

/**
 *
 * @author citla
 */
@RestController
@RequestMapping("/api")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoRepository empRepository;
    
    // GET metodo para buscar todos los empleados
    @GetMapping("/empleados")
    public List<Empleados> getAllEmpleados() {
        return empRepository.findAll();
    }

    // GET metodo para buscar por clave
    @GetMapping(path="/empleados/{id}")
    public Empleados getEmpleadoById(@PathVariable Long id){
        Optional<Empleados> emp = empRepository.findById(id);
        return emp.get();
    }
    
    // POST metodo de crear un empleado
    @PostMapping("/empleados")
    public Empleados createEmpleado(@RequestBody Empleados empleado) {
        return empRepository.save(empleado);
    }
  
    // PUT metodo de actualizar
    @PutMapping("/empleados/{id}")
    public void updateDepartamento (@RequestBody Empleados empleado) {
        empRepository.save(empleado);
    }
  
    // DELETE metodo de borrar 
    @DeleteMapping("/empleados/{id}")
    public void deleteEmpleado(@PathVariable("id") Long id) {
        empRepository.deleteById(id);
    }
}
