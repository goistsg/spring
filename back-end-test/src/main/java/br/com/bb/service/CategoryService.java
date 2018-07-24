package br.com.bb.service;

import br.com.bb.dao.CategoryDao;
import br.com.bb.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/*@Repository
@Transactional
@Component*/
public class CategoryService {

    /*@Autowired
    private CategoryDao categoryDao;

    public Category findById(Long id) { return  categoryDao.findById(id); }

    public List<Category> findAll() { return  categoryDao.findAll(); }*/
}
