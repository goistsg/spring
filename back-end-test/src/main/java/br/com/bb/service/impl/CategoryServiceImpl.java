package br.com.bb.service.impl;

import br.com.bb.dao.CategoryDao;
import br.com.bb.model.Category;
import br.com.bb.service.CategoryJpaRepository;
import br.com.bb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Category findById(Long id) { return  categoryDao.findById(id); }

    @Override
    public List<Category> findAll() { return  categoryDao.findAll(); }
}
