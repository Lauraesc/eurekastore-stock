package com.traininglaura.stock.adapters.driven.repository;


import com.traininglaura.stock.adapters.driven.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long> {
    CategoryEntity findByName(String name);
}
