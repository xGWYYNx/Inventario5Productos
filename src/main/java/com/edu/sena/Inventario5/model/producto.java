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

}
