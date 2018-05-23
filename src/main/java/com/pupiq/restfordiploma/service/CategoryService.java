package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);

    List<Category> addCategories(List<Category> categories);

    Category getCategory(int id);

    Category getCategory(String name);

    List<Category> getCategories();

}
