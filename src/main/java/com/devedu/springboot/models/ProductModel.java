package com.devedu.springboot.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name ="TB_PRODUCTS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;

    public UUID getIdProduct() {
        return idProduct;
    }

    public ProductModel setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductModel setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getValue() {
        return value;
    }

    public ProductModel setValue(BigDecimal value) {
        this.value = value;
        return this;
    }
}
