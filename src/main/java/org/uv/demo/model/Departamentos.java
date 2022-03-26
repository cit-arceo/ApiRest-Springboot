package org.uv.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author citla
 */
@Entity
@Table(name="departamentos")
public class Departamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="clave", unique = true, nullable= false)
    private Long clave;
    @Column(name="nombre")
    private String nombre;

    public Departamentos() {
    }

    public Departamentos(long clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
