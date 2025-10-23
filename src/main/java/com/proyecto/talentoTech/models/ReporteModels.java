package com.proyecto.talentoTech.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    private String precio;
    @Column
    private String lat;
    @Column
    private String lng;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username") // Define la columna de clave foránea
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public UsuariosModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosModel usuario) {
        this.usuario = usuario;
    }
}
