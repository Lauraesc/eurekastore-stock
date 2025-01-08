package com.traininglaura.stock.domain.spi;

import com.traininglaura.stock.domain.model.Brand;

public interface IBrandPersistencePort {

    Brand createBrand(Brand brand);
}
