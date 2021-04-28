/**
 * 
 */
package com.redis.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redis.recipe.domain.RecipeForm;
import com.redis.recipe.entity.Recipe;
import com.redis.recipe.service.RecipeService;

/**
 * @author user
 *
 */
@RestController()
@RequestMapping(path="/services")
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;
	
	@PostMapping("/addrecipe")
	public String addRecipe(@RequestBody RecipeForm recipeForm) {
		
		System.out.println("Form -"+recipeForm.getTitle());
		Recipe recipe=new Recipe();
		recipe.setTitle(recipeForm.getTitle());
		recipe.setDecription(recipeForm.getDecription());
		recipe.setCategory(recipeForm.getCategory());
		recipe.setSteps(recipeForm.getSteps());
		
		
		recipeService.addRecipe(recipe);
		
		return recipe.getId();
	}

}
