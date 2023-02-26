package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CategoryException;
import com.masai.model.Category;
import com.masai.model.Item;
import com.masai.service.ICategoryService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/yourDoorFood")
public class CategoryController {

	@Autowired
	private ICategoryService iCategoryService;
	
	@GetMapping("/categories/{cateName}")
	public ResponseEntity<List<Item>> getItemsByCategoryName(@PathVariable("cateName") String categoryName) throws CategoryException {
		return new ResponseEntity<>(iCategoryService.getItemsByCategoryName(categoryName),HttpStatus.FOUND);
		
	}
	
	
	 
	 
}