package br.com.bb.service.impl;

import br.com.bb.dao.ProductDao;
import br.com.bb.model.Product;
import br.com.bb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findById(Long id) { return productDao.findById(id); }

    @Override
    public List<Product> findAll() { return productDao.findAll(); }

    @Override
    public List<Product> findByCategoryId(long categoryId) { return productDao.findByCategoryId(categoryId); }
}
