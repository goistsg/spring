package br.com.bb.service;

import br.com.bb.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public interface CategoryService {

    Category findById(Long id);

    List<Category> findAll();
}
