package br.com.bb.dao;

import br.com.bb.model.Product;

import java.util.List;

public interface ProductDao {

    Product findById(Long id);

    List<Product> findAll();

    List<Product> findByCategoryId(Long categoryId);
}
