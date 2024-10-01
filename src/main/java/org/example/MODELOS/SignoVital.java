package org.example.MODELOS;

import java.time.LocalDateTime;

public class SignoVital {

    private Long id;
    private LocalDateTime fechaRegistro;
    private Double frecuenciaCardiaca;
    private Double presionSistolica;
    private Double presionDiastolica;
    private Double frecuenciaRespiratoria;
    private Double temperaturaCorporal;
    private Double saturacionOxigeno;
    private Double glucosa;
    private Double peso;


    public SignoVital() {
    }

    public SignoVital(Long id, LocalDateTime fechaRegistro, Double frecuenciaCardiaca, Double presionSistolica, Double presionDiastolica, Double frecuenciaRespiratoria, Double temperaturaCorporal, Double saturacionOxigeno, Double glucosa, Double peso) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.presionSistolica = presionSistolica;
        this.presionDiastolica = presionDiastolica;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperaturaCorporal = temperaturaCorporal;
        this.saturacionOxigeno = saturacionOxigeno;
        this.glucosa = glucosa;
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Double getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(Double frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public Double getPresionSistolica() {
        return presionSistolica;
    }

    public void setPresionSistolica(Double presionSistolica) {
        this.presionSistolica = presionSistolica;
    }

    public Double getPresionDiastolica() {
        return presionDiastolica;
    }

    public void setPresionDiastolica(Double presionDiastolica) {
        this.presionDiastolica = presionDiastolica;
    }

    public Double getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(Double frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public Double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(Double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public Double getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(Double saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public Double getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(Double glucosa) {
        this.glucosa = glucosa;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SignoVital{" +
                "id=" + id +
                ", fechaRegistro=" + fechaRegistro +
                ", frecuenciaCardiaca=" + frecuenciaCardiaca +
                ", presionSistolica=" + presionSistolica +
                ", presionDiastolica=" + presionDiastolica +
                ", frecuenciaRespiratoria=" + frecuenciaRespiratoria +
                ", temperaturaCorporal=" + temperaturaCorporal +
                ", saturacionOxigeno=" + saturacionOxigeno +
                ", glucosa=" + glucosa +
                ", peso=" + peso +
                '}';
    }
}
