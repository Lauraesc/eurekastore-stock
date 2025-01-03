package com.traininglaura.stock.adapters.driving.controller;

import com.traininglaura.stock.adapters.driving.dto.CategoryRequest;
import com.traininglaura.stock.adapters.driving.dto.CategoryResponse;
import com.traininglaura.stock.adapters.driving.mapper.ICategoryDtoMapper;
import com.traininglaura.stock.domain.api.ICategoryServicePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //para decirle que es un controlador
@RequestMapping("/categories") //para la ruta
@RequiredArgsConstructor
public class CategoryController {

    private final ICategoryServicePort categoryServicePort;
    private final ICategoryDtoMapper categoryDtoMapper;

    @PostMapping("/")
    public ResponseEntity<CategoryResponse> createCategory(@Valid @RequestBody CategoryRequest request) {
        return ResponseEntity.ok(categoryDtoMapper.toCategoryResponse(categoryServicePort
                .createCategory(categoryDtoMapper.toCategory(request))));
    }

    @GetMapping("/{name}")
    public ResponseEntity<CategoryResponse> getCategoryByName(@PathVariable String name) {
        return ResponseEntity.ok(categoryDtoMapper.toCategoryResponse(categoryServicePort
                .getCategoryByName(name)));
    }
}