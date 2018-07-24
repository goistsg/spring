package br.com.bb.controller;

import br.com.bb.model.Product;
import br.com.bb.service.ProductRepository;
import br.com.bb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository service;

    @RequestMapping(value = "/{id}")
    public Product findById(@PathVariable("id") Long id) {
        return service.findOne(id);
    }

    @RequestMapping(value = "/listAll")
    public List<Product> findAll() {
        return (List<Product>) service.findAll();
    }

    @RequestMapping(value = "/listByCategory/{categoryId}")
    public List<Product> findByCategoryId(@PathVariable("categoryId") Long categoryId) {
        return service.findAllBy(categoryId);
    }
}
