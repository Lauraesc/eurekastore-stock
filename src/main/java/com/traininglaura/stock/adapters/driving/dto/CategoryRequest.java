package com.traininglaura.stock.adapters.driving.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor //constructor vacio (necesario por mapstruct)
@Data
public class CategoryRequest {

    @NotBlank(message = "El nombre no puede estar vacío")
    @Max(value = 50, message = "El nombre debe tener como máximo 50 caracteres")
    private String name;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Max(value = 90, message = "La descripción debe tener como máximo 90 caracteres")
    private String description;

}
