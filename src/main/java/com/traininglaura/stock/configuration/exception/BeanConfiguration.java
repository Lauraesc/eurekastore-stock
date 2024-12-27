package com.traininglaura.stock.configuration.exception;


import com.traininglaura.stock.adapters.driven.adapter.CategoryAdapter;
import com.traininglaura.stock.adapters.driven.mapper.ICategoryEntityMapper;
import com.traininglaura.stock.adapters.driven.repository.ICategoryRepository;
import com.traininglaura.stock.domain.api.ICategoryServicePort;
import com.traininglaura.stock.domain.api.usecase.CategoryUseCase;
import com.traininglaura.stock.domain.spi.ICategoryPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ICategoryRepository categoryRepository;
    private final ICategoryEntityMapper categoryMapper;

    @Bean
    public ICategoryServicePort categoryServicePort(ICategoryPersistencePort categoryPersistencePort) {
        return new CategoryUseCase(categoryPersistencePort);
    }

    @Bean
    public ICategoryPersistencePort categoryPersistencePort(ICategoryRepository categoryRepository, ICategoryEntityMapper categoryMapper) {
        return new CategoryAdapter(categoryRepository, categoryMapper);
    }
}






















