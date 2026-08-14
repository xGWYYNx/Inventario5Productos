package com.edu.sena.Inventario5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.Inventario5.model.producto;
import java.util.List;

@RestController
public class inventarioController {
    private final List<producto> inventraio = List.of(
    new producto(1L, "Papa pastusa", "Verduras", 2500.0),
    new producto(2L, "Tomate", "Verduras", 3200.0),
    new producto(3L, "Fresa", "Frutas", 8500.0)
    );
    @GetMapping
    public List<producto> listarProductos() {
        return inventraio;
    }
}