package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;

public class CategoryDTO {
    private Long Id;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(Category entity) {
        Id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
}
