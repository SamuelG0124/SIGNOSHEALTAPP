package org.example.MODELOS;

public class Medicamento {


    private Long id;
    private String nombre;
    private String principioActivo;
    private String concentracion;
    private String formaFarmaceutica;
    private String fabricante;
    private String dosisRecomendada;
    private String modoAdministracion;
    private Boolean requiereReceta;
    private Double precio;


    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String principioActivo, String concentracion, String formaFarmaceutica, String fabricante, String dosisRecomendada, String modoAdministracion, Boolean requiereReceta, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.concentracion = concentracion;
        this.formaFarmaceutica = formaFarmaceutica;
        this.fabricante = fabricante;
        this.dosisRecomendada = dosisRecomendada;
        this.modoAdministracion = modoAdministracion;
        this.requiereReceta = requiereReceta;
        this.precio = precio;
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

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(String concentracion) {
        this.concentracion = concentracion;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDosisRecomendada() {
        return dosisRecomendada;
    }

    public void setDosisRecomendada(String dosisRecomendada) {
        this.dosisRecomendada = dosisRecomendada;
    }

    public String getModoAdministracion() {
        return modoAdministracion;
    }

    public void setModoAdministracion(String modoAdministracion) {
        this.modoAdministracion = modoAdministracion;
    }

    public Boolean getRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(Boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", principioActivo='" + principioActivo + '\'' +
                ", concentracion='" + concentracion + '\'' +
                ", formaFarmaceutica='" + formaFarmaceutica + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", dosisRecomendada='" + dosisRecomendada + '\'' +
                ", modoAdministracion='" + modoAdministracion + '\'' +
                ", requiereReceta=" + requiereReceta +
                ", precio=" + precio +
                '}';
    }
}
