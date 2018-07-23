package br.com.bb.controller;

import br.com.bb.model.Category;
import br.com.bb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private CategoryService service = new CategoryService();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Category findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Category> findAll() {
        return service.findAll();
    }
}
