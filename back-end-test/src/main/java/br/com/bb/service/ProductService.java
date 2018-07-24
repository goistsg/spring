package br.com.bb.service;

import br.com.bb.dao.ProductDao;
import br.com.bb.model.Category;
import br.com.bb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/*@Repository
@Transactional*/
public class ProductService {

    /*@Autowired
    private ProductDao productDao;

    public Product findById(Long id) { return productDao.findById(id); }

    public List<Product> findAll() { return productDao.findAll(); }

    public List<Product> findByCategoryId(long categoryId) { return productDao.findByCategoryId(categoryId); }*/
}
