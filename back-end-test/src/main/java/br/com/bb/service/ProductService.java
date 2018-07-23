package br.com.bb.service;

import br.com.bb.model.Product;

import java.util.List;

public interface ProductService {

    Product findById(Long id);

    List<Product> findAll();

    List<Product> findByCategoryId(long categoryId);
}
