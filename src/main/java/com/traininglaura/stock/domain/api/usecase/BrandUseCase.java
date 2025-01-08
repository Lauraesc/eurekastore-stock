package com.traininglaura.stock.domain.api.usecase;


import com.traininglaura.stock.domain.api.IBrandServicePort;
import com.traininglaura.stock.domain.exception.BrandNullException;
import com.traininglaura.stock.domain.exception.CategoryNullException;
import com.traininglaura.stock.domain.exception.NameEmptyException;
import com.traininglaura.stock.domain.model.Brand;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BrandUseCase implements IBrandServicePort {

    private final IBrandServicePort brandPersistencePort;

    @Override
    public Brand createBrand(Brand brand) {
        validateBrand(brand);

        return brandPersistencePort.createBrand(brand);
    }

    private void validateBrand(Brand brand) {
        if (brand == null) {
            throw new BrandNullException("La marca no puede ser nula");
        }
        if (brand.getName().isEmpty()) {
            throw new NameEmptyException("El nombre de la marca no puede ser nulo o vacío");
        }
    }

}
