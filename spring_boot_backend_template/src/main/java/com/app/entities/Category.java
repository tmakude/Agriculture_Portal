package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity {
	@Column(name = "Category_name", nullable = false, unique = true)
	private String name; 

	@OneToMany(mappedBy = "categoryId")
	private List<Product> products = new ArrayList<>();

}
