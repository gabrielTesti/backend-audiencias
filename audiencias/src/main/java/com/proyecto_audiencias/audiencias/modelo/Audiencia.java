
package com.proyecto_audiencias.audiencias.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "audiencia")
public class Audiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Audiencia;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @Column (name = "cuij", nullable = false)
    private String cuij;

    @Column(name = "distrito", nullable = false, length = 100)
    private String distrito;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "tipo_audiencia", nullable = false, length = 50)
    private String tipo_audiencia;

    @ManyToOne
    @JoinColumn(name = "id_Sala", nullable = false)
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "id_Causa", nullable = false)
    private Causa causa;

    @ManyToOne
    @JoinColumn(name = "id_Juez", nullable = false)
    private Juez juez;

    @ManyToOne
    @JoinColumn(name = "id_Fiscal", nullable = false)
    private Fiscal fiscal;

    @ManyToOne
    @JoinColumn(name = "id_Defensor", nullable = false)
    private Defensor defensor;

    // Getters y Setters

    public Long getId_Audiencia() {
        return id_Audiencia;
    }

    public void setId_Audiencia(Long id_Audiencia) {
        this.id_Audiencia = id_Audiencia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_audiencia() {
        return tipo_audiencia;
    }

    public void setTipo_audiencia(String tipo_audiencia) {
        this.tipo_audiencia = tipo_audiencia;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Causa getCausa() {
        return causa;
    }

    public void setCausa(Causa causa) {
        this.causa = causa;
    }

    public Juez getJuez() {
        return juez;
    }

    public void setJuez(Juez juez) {
        this.juez = juez;
    }

    public Fiscal getFiscal() {
        return fiscal;
    }

    public void setFiscal(Fiscal fiscal) {
        this.fiscal = fiscal;
    }

    public Defensor getDefensor() {
        return defensor;
    }

    public void setDefensor(Defensor defensor) {
        this.defensor = defensor;
    }

    public String getCuij() {
        return cuij;
    }

    public void setCuij(String cuij) {
        this.cuij = cuij;
    }
}






