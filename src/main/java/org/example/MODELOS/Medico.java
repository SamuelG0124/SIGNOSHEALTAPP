package org.example.MODELOS;

import java.time.LocalDateTime;

public class Medico {

    private Long id;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private String genero;
    private String direccion;
    private String email;
    private String telefono;
    private String numeroLicencia;
    private String especialidad;
    private String universidadGraduacion;
    private int aniosExperiencia;
    private String hospitalActual;
    private Boolean aceptaNuevosPacientes;
    private String horarioAtencion;


    public Medico() {
    }

    public Medico(Long id, String nombre, String apellido, LocalDateTime fechaNacimiento, String genero, String direccion, String email, String telefono, String numeroLicencia, String especialidad, String universidadGraduacion, int aniosExperiencia, String hospitalActual, Boolean aceptaNuevosPacientes, String horarioAtencion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
        this.universidadGraduacion = universidadGraduacion;
        this.aniosExperiencia = aniosExperiencia;
        this.hospitalActual = hospitalActual;
        this.aceptaNuevosPacientes = aceptaNuevosPacientes;
        this.horarioAtencion = horarioAtencion;
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

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUniversidadGraduacion() {
        return universidadGraduacion;
    }

    public void setUniversidadGraduacion(String universidadGraduacion) {
        this.universidadGraduacion = universidadGraduacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getHospitalActual() {
        return hospitalActual;
    }

    public void setHospitalActual(String hospitalActual) {
        this.hospitalActual = hospitalActual;
    }

    public Boolean getAceptaNuevosPacientes() {
        return aceptaNuevosPacientes;
    }

    public void setAceptaNuevosPacientes(Boolean aceptaNuevosPacientes) {
        this.aceptaNuevosPacientes = aceptaNuevosPacientes;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero='" + genero + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numeroLicencia='" + numeroLicencia + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", universidadGraduacion='" + universidadGraduacion + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", hospitalActual='" + hospitalActual + '\'' +
                ", aceptaNuevosPacientes=" + aceptaNuevosPacientes +
                ", horarioAtencion='" + horarioAtencion + '\'' +
                '}';
    }
}



