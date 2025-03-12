package com.marketplace.mercatus.product.controllers;

import com.marketplace.mercatus.product.models.Category;
import com.marketplace.mercatus.product.services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @GetMapping
    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }
}
