package br.com.bb.service;

import br.com.bb.model.Category;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryService {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testdb");
    EntityManager manager = factory.createEntityManager();

    public Category findById(Long id) {
        manager.getTransaction().begin();

        Category category = manager.find(Category.class, id);

        manager.getTransaction().commit();
        manager.close();
        return  category;
    }

    public List<Category> findAll() {
        manager.getTransaction().begin();

        TypedQuery<Category> query = manager.createNamedQuery(Category.FIND_ALL, Category.class);
        List<Category> listCategory = query.getResultList();

        manager.getTransaction().commit();
        manager.close();
        return listCategory.isEmpty() ? new ArrayList<>() : listCategory;
    }
}
