package com.traininglaura.stock.domain.api;

import com.traininglaura.stock.domain.model.Category;

public interface ICategoryServicePort {

    Category createCategory(Category category);
    Category getCategoryByName(String name);
}
