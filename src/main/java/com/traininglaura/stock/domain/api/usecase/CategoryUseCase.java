package com.traininglaura.stock.domain.api.usecase;


import com.traininglaura.stock.domain.api.ICategoryServicePort;
import com.traininglaura.stock.domain.exception.CategoryNullException;
import com.traininglaura.stock.domain.exception.NameEmptyException;
import com.traininglaura.stock.domain.model.Category;
import com.traininglaura.stock.domain.spi.ICategoryPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CategoryUseCase implements ICategoryServicePort {

    private final ICategoryPersistencePort categoryPersistencePort;

    @Override
    public Category createCategory(Category category) {
        if (category == null) {
            throw new CategoryNullException("La categoría no puede ser nula");
        }
        if (category.getName().isEmpty()) {
            throw new NameEmptyException("El nombre de la categoría no puede ser nulo o vacío");
        }

        return categoryPersistencePort.createCategory(category);
    }
}