package br.com.bb.dao;

import br.com.bb.dao.CategoryDao;
import br.com.bb.model.Category;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

//@Repository
public class CategoryDao {

    /*@PersistenceContext
    private EntityManager em;

    public Category findById(Long id) {
        Category category = em.find(Category.class, id);
        return  category;
    }

    public List<Category> findAll() {
        List<Category> listCategory = em.createNamedQuery(Category.FIND_ALL, Category.class).getResultList();
        System.out.println("QTDE: " + listCategory.size());
        return listCategory.isEmpty() ? new ArrayList<>() : listCategory;
    }*/
}
