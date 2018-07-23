package br.com.bb.dao.impl;

import br.com.bb.dao.CategoryDao;
import br.com.bb.model.Category;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Category findById(Long id) {
        Category category = em.find(Category.class, id);
        return  category;
    }

    @Override
    public List<Category> findAll() {
        List<Category> listCategory = em.createNamedQuery(Category.FIND_ALL, Category.class).getResultList();
        return listCategory.isEmpty() ? new ArrayList<>() : listCategory;
    }
}
