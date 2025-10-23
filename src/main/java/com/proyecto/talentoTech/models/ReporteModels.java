package com.proyecto.talentoTech.models;

import jakarta.persistence.*;

@Entity
@Table(name="reporte")
public class ReporteModels {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Column
    private String titulo;
    @Column
    private String servicio;
    @Column
    private String direccion;
    @Column
    private String telefono;
    @Column
    private Double precio;
    @Column
    private Double lat;
    @Column
    private Double lng;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id") // Define la columna de clave foránea
    private UsuariosModel usuario; // <-- Debe ser la clase, no String

    // --- Getters y Setters Corregidos ---

    // No necesitas getters/setters para `usuario` si usas DTOs, pero se incluyen para integridad:




    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public UsuariosModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosModel usuario) {
        this.usuario = usuario;
    }
}
