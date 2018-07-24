package br.com.bb.service;

import br.com.bb.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = Category.class)
public interface CategoryRepository extends CrudRepository<Category, Long> {

    List<Category> findAllBy();

    Category findCategoryBy(Long id);
}
