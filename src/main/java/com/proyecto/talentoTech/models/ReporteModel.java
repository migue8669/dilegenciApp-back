package com.proyecto.talentoTech.models;

import jakarta.persistence.*;

@Entity
@Table(name="reporte")
public class ReporteModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

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

    @Column
    private String usuario; // Usuario que creó la solicitud

    // 🆕 Nuevo campo para el estado (DISPONIBLE, TOMADO, FINALIZADO)
    @Column
    private String estado;

    // 🆕 Nuevo campo para el usuario que tomó la solicitud
    @Column
    private String tomadoPor;


    // --- Getters y Setters ---

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // 🆕 Getters y Setters para los nuevos campos
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTomadoPor() {
        return tomadoPor;
    }

    public void setTomadoPor(String tomadoPor) {
        this.tomadoPor = tomadoPor;
    }
}
