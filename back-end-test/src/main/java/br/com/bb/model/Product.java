package br.com.bb.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
@NamedQueries({
        @NamedQuery(name=Product.FIND_ALL, query="SELECT p FROM Product p ORDER BY p.id"),
        @NamedQuery(name=Product.FIND_BY_CATEGORY, query="SELECT p FROM Product p WHERE p.category = :category ORDER BY p.id")
})
public class Product {

    public static final String FIND_ALL = "Product.findAll";
    public static final String FIND_BY_CATEGORY = "Product.findByCategory";

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(){ super(); }

    public Product(Long id, String name, Category category){
        super();
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Product [id=%s, name=%s, category=%s]", id, name, category.getName());
    }
}
