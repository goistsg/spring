package br.com.bb.controller;

import br.com.bb.model.Category;
import br.com.bb.model.Product;
import br.com.bb.service.CategoryService;
import br.com.bb.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private ProductService service = new ProductService();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/listByCategory/{categoryId}", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> findByCategoryId(@PathVariable("categoryId") Long categoryId) {
        return service.findProductsByCategoryId(categoryId);
    }
}
