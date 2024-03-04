package com.backend.Agriculture.services;


import java.util.List;

import com.backend.Agriculture.entities.Category;


public interface CategoryService {


	
	Category findByName(String categoryName);

	Category addCategory(Category category);

	List<Category> findAllCategory();

}
