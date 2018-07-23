package br.com.bb.controller;

import br.com.bb.model.Category;
import br.com.bb.service.AplicationRestService;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

//@RestController
//@RequestMapping(value="/api")
public class ApplicationRestController {

    private static final AplicationRestService aplicationRestService = new AplicationRestService();

    //@RequestMapping(value="/category/listAll")
    public String listAllCategories() {
        List<Category> categories = aplicationRestService.findAllCategories();

        categories.stream().forEach(category -> System.out.println("CATEGORIAS: " + category.toString()));

        return categories.toString();
    }

    //@RequestMapping(value="/product/listByCategory/{categoryId}")
    public String listProductsByCategory(@PathVariable Long categoryId) {
        return aplicationRestService.findProductsByCategoryId(categoryId).toString();
    }

    //@RequestMapping(value="/product/listAll")
    public String listAllProducts() {
        return aplicationRestService.findAllProducts().toString();
    }
}
