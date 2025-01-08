package com.traininglaura.stock.adapters.driving.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //para decirle que es un controlador
@RequestMapping("/brands") //para la ruta
@RequiredArgsConstructor
public class BrandController {
    @GetMapping("/")
    public ResponseEntity<String> getBrands() { //apreciar que el metodo no recibe parametros
        return ResponseEntity.ok("brands");
    }
}
