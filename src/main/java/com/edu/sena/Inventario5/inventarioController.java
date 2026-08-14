package com.edu.sena.Inventario5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.Inventario5.model.producto;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class inventarioController {

    private final List<producto> inventario = new ArrayList<>(List.of(
        new producto(1L, "Papa pastusa", "Verdura", 2500.0),
        new producto(2L, "Tomate", "Verdura", 3200.0),
        new producto(3L, "Fresa", "Fruta", 8500.0),
        new producto(4L, "Leche", "Lácteo", 4500.0),
        new producto(5L, "Arroz", "Grano", 3800.0)
    ));

    @GetMapping("/productos")
    public List<producto> listarProductos() {
        return inventario;
    }

    @PostMapping("/productos")
    public producto agregarProducto(@RequestBody producto nuevoProducto) {
        inventario.add(nuevoProducto);
        return nuevoProducto;
    }

    @PutMapping("/productos/{id}")
    public producto actualizarProducto(
            @PathVariable Long id,
            @RequestBody producto productoActualizado) {

        for (producto p : inventario) {

            if (p.getId().equals(id)) {

                p.setNombre(productoActualizado.getNombre());
                p.setCategoria(productoActualizado.getCategoria());
                p.setPrecio(productoActualizado.getPrecio());

                return p;
            }
        }

        return null;
    }
}