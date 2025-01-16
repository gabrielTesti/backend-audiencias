/*
package com.proyecto_audiencias.audiencias.modelo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "defensor")
public class Defensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Defensor;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "telefono", nullable = false, length = 50)
    private String telefono;

    @Column(name = "direccion", nullable = true, length = 50)
    private String direccion;


    public Long getId_Defensor() {
        return id_Defensor;
    }

    public void setId_Defensor(Long id_Defensor) {
        this.id_Defensor = id_Defensor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fecha_nacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fecha_nacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

 */


package com.proyecto_audiencias.audiencias.modelo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "defensor")
public class Defensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Defensor;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "telefono", nullable = false, length = 50)
    private String telefono;

    @Column(name = "direccion", nullable = true, length = 50)
    private String direccion;

    // Getters y setters
    public Long getId_Defensor() {
        return id_Defensor;
    }

    public void setId_Defensor(Long id_Defensor) {
        this.id_Defensor = id_Defensor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}