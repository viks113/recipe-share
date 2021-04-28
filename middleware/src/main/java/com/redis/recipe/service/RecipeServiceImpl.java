/**
 * 
 */
package com.redis.recipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redis.recipe.entity.Recipe;
import com.redis.recipe.repository.RecipeRepository;

/**
 * @author user
 *
 */
@Service
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired
	RecipeRepository recipeRepository;

	@Override
	public Recipe addRecipe(Recipe recipe) {
		recipeRepository.save(recipe);
		return recipe;
	}

	@Override
	public List<Recipe> getRecipes(String searchKey) {
		// TODO Auto-generated method stub
		return null;
	}

}
