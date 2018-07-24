package br.com.bb.controller;

import br.com.bb.model.Category;
import br.com.bb.service.CategoryRepository;
import br.com.bb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryRepository service;

    @RequestMapping(value = "/{id}")
    public Category findById(@PathVariable("id") Long id) {
        return service.findOne(id);
    }

    @RequestMapping(value = "/listAll")
    public List<Category> findAll() {
        return (List<Category>) service.findAll();
    }
}
