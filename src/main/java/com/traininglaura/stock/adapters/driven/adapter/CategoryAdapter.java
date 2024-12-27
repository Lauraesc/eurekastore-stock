package com.traininglaura.stock.adapters.driven.adapter;

import com.traininglaura.stock.adapters.driven.entity.CategoryEntity;
import com.traininglaura.stock.adapters.driven.mapper.ICategoryEntityMapper;
import com.traininglaura.stock.adapters.driven.repository.ICategoryRepository;
import com.traininglaura.stock.domain.model.Category;
import com.traininglaura.stock.domain.spi.ICategoryPersistencePort;
import lombok.RequiredArgsConstructor;

    @RequiredArgsConstructor
    public class CategoryAdapter implements ICategoryPersistencePort {
        private final ICategoryRepository categoryRepository;
        private final ICategoryEntityMapper categoryMapper;


    @Override
    public Category createCategory(Category category) {
        CategoryEntity categoryEntity = categoryRepository.save(categoryMapper.toCategoryEntity(category));

        return categoryMapper.toCategory(categoryEntity);
    }
}