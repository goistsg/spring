package br.com.bb.service;

import br.com.bb.model.Category;
import br.com.bb.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

//@Repository
public class AplicationRestService {

    //@PersistenceContext
    EntityManager em;

    public List<Category> findAllCategories() {
        TypedQuery<Category> query = em.createNamedQuery(Category.FIND_ALL, Category.class);
        List<Category> listCategory = query.getResultList();
        return listCategory.isEmpty() ? new ArrayList<>() : listCategory;
    }

    public List<Product> findProductsByCategoryId(long id) {
        Category category = em.find(Category.class, id);

        TypedQuery<Product> query = em.createNamedQuery(Product.FIND_BY_CATEGORY, Product.class).setParameter("category", category);
        List<Product> listProduct = query.getResultList();
        return listProduct.isEmpty() ? new ArrayList<>() : listProduct;
    }

    public List<Product> findAllProducts() {
        TypedQuery<Product> query = em.createNamedQuery(Product.FIND_ALL, Product.class);
        List<Product> listProduct = query.getResultList();
        return listProduct.isEmpty() ? new ArrayList<>() : listProduct;
    }
}
