package br.com.bb.dao;

import br.com.bb.dao.ProductDao;
import br.com.bb.model.Category;
import br.com.bb.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

//@Repository
public class ProductDao {

    /*@PersistenceContext
    private EntityManager em;

    public Product findById(Long id) {
        Product product = em.find(Product.class, id);
        return  product;
    }

    public List<Product> findAll() {
        List<Product> listProduct = em.createNamedQuery(Product.FIND_ALL, Product.class).getResultList();
        return listProduct.isEmpty() ? new ArrayList<>() : listProduct;
    }

    public List<Product> findByCategoryId(Long categoryId) {
        System.out.println("CATEGORIA_ID: " + categoryId);
        Category category = em.find(Category.class, categoryId);
        System.out.println("CATEGORIA: " + category.toString());

        List<Product> listProduct = em.createNamedQuery(Product.FIND_BY_CATEGORY, Product.class).setParameter("category", category).getResultList();
        return listProduct.isEmpty() ? new ArrayList<>() : listProduct;
    }*/
}
