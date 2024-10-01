package org.example.MODELOS;

import java.time.LocalDateTime;

public class Paciente {


    private Long id;
    private String nombre;
    private String apellido;
    private String tipoSangre;
    private String celular;
    private Boolean tieneSeguro;
    private LocalDateTime fechaNacimiento;
    private String direccion;
    private String email;
    private String genero;
    private Double peso;
    private Double altura;
    private String historialMedico;
    private Integer edad;
    private String contactoEmergencia;
    private String numeroEmergencia;

    public Paciente() {
    }

    public Paciente(Long id, String nombre, String apellido, String tipoSangre, String celular, Boolean tieneSeguro, LocalDateTime fechaNacimiento, String direccion, String email, String genero, Double peso, Double altura, String historialMedico, Integer edad, String contactoEmergencia, String numeroEmergencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoSangre = tipoSangre;
        this.celular = celular;
        this.tieneSeguro = tieneSeguro;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.email = email;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.historialMedico = historialMedico;
        this.edad = edad;
        this.contactoEmergencia = contactoEmergencia;
        this.numeroEmergencia = numeroEmergencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getTieneSeguro() {
        return tieneSeguro;
    }

    public void setTieneSeguro(Boolean tieneSeguro) {
        this.tieneSeguro = tieneSeguro;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipoSangre='" + tipoSangre + '\'' +
                ", celular='" + celular + '\'' +
                ", tieneSeguro=" + tieneSeguro +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", genero='" + genero + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", historialMedico='" + historialMedico + '\'' +
                ", edad=" + edad +
                ", contactoEmergencia='" + contactoEmergencia + '\'' +
                ", numeroEmergencia='" + numeroEmergencia + '\'' +
                '}';
    }
}
