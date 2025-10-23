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
    private Number telefono;
    @Column
    private Number precio;
    @Column
    private Number lat;
    @Column
    private Number lng;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id") // Define la columna de clave foránea
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "reportes"}) // <-- Solución al 502
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

    public Number getTelefono() {
        return telefono;
    }

    public void setTelefono(Number telefono) {
        this.telefono = telefono;
    }

    public Number getPrecio() {
        return precio;
    }

    public void setPrecio(Number precio) {
        this.precio = precio;
    }

    public Number getLat() {
        return lat;
    }

    public void setLat(Number lat) {
        this.lat = lat;
    }

    public Number getLng() {
        return lng;
    }

    public void setLng(Number lng) {
        this.lng = lng;
    }

    public UsuariosModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosModel usuario) {
        this.usuario = usuario;
    }
}
