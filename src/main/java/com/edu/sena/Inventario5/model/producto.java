package com.edu.sena.Inventario5.model;

public class producto {
    private Long id;
    private String nombre;
    private String categoria;
    private Double precio;
    
    public producto(Long id, String nombre, String categoria, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public Double getPrecio() { return precio; }

    public void setId(Long id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPrecio(Double precio) { this.precio = precio; }

}
