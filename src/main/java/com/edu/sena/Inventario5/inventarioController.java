package com.edu.sena.Inventario5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class inventarioController {
    @GetMapping("/productos")
    public String productos() {
        return "Conexion exitosa SpringBoot";
    }
}