package org.example.MODELOS;

public class Enfermedad {

    private Long id;
    private String nombre;
    private String descripcion;
    private String causas;
    private Boolean esContagiosa;
    private String tipoTransmision;
    private Double tasaMortalidad;
    private Double tasaRecuperacion;
    private String grupoEdadAfectado;
    private String generoAfectado;


    public Enfermedad() {
    }

    public Enfermedad(Long id, String nombre, String descripcion, String causas, Boolean esContagiosa, String tipoTransmision, Double tasaMortalidad, Double tasaRecuperacion, String grupoEdadAfectado, String generoAfectado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.causas = causas;
        this.esContagiosa = esContagiosa;
        this.tipoTransmision = tipoTransmision;
        this.tasaMortalidad = tasaMortalidad;
        this.tasaRecuperacion = tasaRecuperacion;
        this.grupoEdadAfectado = grupoEdadAfectado;
        this.generoAfectado = generoAfectado;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public Boolean getEsContagiosa() {
        return esContagiosa;
    }

    public void setEsContagiosa(Boolean esContagiosa) {
        this.esContagiosa = esContagiosa;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public Double getTasaMortalidad() {
        return tasaMortalidad;
    }

    public void setTasaMortalidad(Double tasaMortalidad) {
        this.tasaMortalidad = tasaMortalidad;
    }

    public Double getTasaRecuperacion() {
        return tasaRecuperacion;
    }

    public void setTasaRecuperacion(Double tasaRecuperacion) {
        this.tasaRecuperacion = tasaRecuperacion;
    }

    public String getGrupoEdadAfectado() {
        return grupoEdadAfectado;
    }

    public void setGrupoEdadAfectado(String grupoEdadAfectado) {
        this.grupoEdadAfectado = grupoEdadAfectado;
    }

    public String getGeneroAfectado() {
        return generoAfectado;
    }

    public void setGeneroAfectado(String generoAfectado) {
        this.generoAfectado = generoAfectado;
    }


    @Override
    public String toString() {
        return "Enfermedad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", causas='" + causas + '\'' +
                ", esContagiosa=" + esContagiosa +
                ", tipoTransmision='" + tipoTransmision + '\'' +
                ", tasaMortalidad=" + tasaMortalidad +
                ", tasaRecuperacion=" + tasaRecuperacion +
                ", grupoEdadAfectado='" + grupoEdadAfectado + '\'' +
                ", generoAfectado='" + generoAfectado + '\'' +
                '}';
    }
}
