package com.traininglaura.stock.adapters.driving.mapper;


import com.traininglaura.stock.adapters.driving.dto.CategoryRequest;
import com.traininglaura.stock.adapters.driving.dto.CategoryResponse;
import com.traininglaura.stock.domain.model.Category;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICategoryDtoMapper {

        Category toCategory(@Valid CategoryRequest categoryRequest);
        CategoryResponse toCategoryResponse(Category category);
}


