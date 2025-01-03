package com.traininglaura.stock.domain.spi;

import com.traininglaura.stock.domain.model.Category;

public interface ICategoryPersistencePort {

    Category createCategory(Category category);
    Category getCategoryByName(String name);
}
