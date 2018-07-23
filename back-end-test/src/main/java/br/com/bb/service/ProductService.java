package br.com.bb.service;

import br.com.bb.model.Category;
import br.com.bb.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductService {

    @PersistenceContext
    EntityManager em;

    public Product findById(Long id) {
        return em.find(Product.class, id);
    }

    public List<Product> findAll() {
        TypedQuery<Product> query = em.createNamedQuery(Product.FIND_ALL, Product.class);
        List<Product> listProduct = query.getResultList();
        return listProduct.isEmpty() ? new ArrayList<>() : listProduct;
    }

    public List<Product> findProductsByCategoryId(long categoryId) {
        System.out.println("CATEGORIA_ID: " + categoryId);
        Category category = em.find(Category.class, categoryId);

        TypedQuery<Product> query = em.createNamedQuery(Product.FIND_BY_CATEGORY, Product.class).setParameter("category", category);
        List<Product> listProduct = query.getResultList();
        return listProduct.isEmpty() ? new ArrayList<>() : listProduct;
    }
}
