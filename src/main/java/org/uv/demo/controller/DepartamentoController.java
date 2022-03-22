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
import org.uv.demo.model.Departamentos;
import org.uv.demo.repository.DepartamentoRepository;

/**
 *
 * @author citla
 */
@RestController
@RequestMapping("/api")
public class DepartamentoController {
    
    @Autowired
    private DepartamentoRepository depRepository;
    
    // GET metodo para buscar todos los empleados
    @GetMapping("/departamentos")
    public List<Departamentos> getAllDepartamentos() {
        return depRepository.findAll();
    }

    // GET metodo para buscar por clave
    @GetMapping(path="/departamentos/{id}")
    public Departamentos getDepartamentoById(@PathVariable Long id){
        Optional<Departamentos> emp = depRepository.findById(id);
        return emp.get();
    }
    
    // POST metodo de crear un empleado
    @PostMapping("/departamentos")
    public Departamentos createDepartamento(@RequestBody Departamentos departamento) {
        return depRepository.save(departamento);
    }
  
    // PUT metodo de actualizar
    @PutMapping("/departamentos/{id}")
    public void updateDepartamento (@RequestBody Departamentos departamento) {
        depRepository.save(departamento);
    }
  
    // DELETE metodo de borrar 
    @DeleteMapping("/departamentos/{id}")
    public void deleteDepartamento(@PathVariable("id") Long id) {
        depRepository.deleteById(id);
    }
}
