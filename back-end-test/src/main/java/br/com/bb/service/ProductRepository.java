package br.com.bb.service;

import br.com.bb.model.Category;
import br.com.bb.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = Product.class)
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findAllBy(Long categoryId);

    Product findOne(Long id);
}
