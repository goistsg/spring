package br.com.bb.dao;

import br.com.bb.model.Category;

import java.util.List;

public interface CategoryDao {

    Category findById(Long id);

    List<Category> findAll();
}
