package com.marketplace.mercatus.product.repositories;

import com.marketplace.mercatus.product.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
