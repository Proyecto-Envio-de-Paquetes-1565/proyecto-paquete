package com.example.proyectopaquetesenvio.controlador;

import javax.print.DocFlavor.STRING;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicacionControlador {

    @GetMapping("/Bienvenida")
    public String mostrarBienvenida(Model modelo){
        
        int pesoGramos = 2000;
        int vgramo = 12;
        int valorPaquete = pesoGramos*vgramo;
        modelo.addAttribute("valor", valorPaquete);
        return "bienvenida";
    }
}
