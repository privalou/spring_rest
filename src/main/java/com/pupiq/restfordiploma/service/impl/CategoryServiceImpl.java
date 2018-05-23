package com.pupiq.restfordiploma.service.impl;

import com.pupiq.restfordiploma.model.Category;
import com.pupiq.restfordiploma.repository.CategoryRepository;
import com.pupiq.restfordiploma.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository repository;

    @Override
    public Category addCategory(Category category) {
        return repository.save(category);
    }

    @Override
    public List<Category> addCategories(List<Category> categories) {
        return repository.saveAll(categories);
    }

    @Override
    public Category getCategory(int id) {
        return repository.getOne(id);
    }

    @Override
    public Category getCategory(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Category> getCategories() {
        return repository.findAll();
    }
}
