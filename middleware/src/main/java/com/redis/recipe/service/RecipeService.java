/**
 * 
 */
package com.redis.recipe.service;

import java.util.List;

import com.redis.recipe.entity.Recipe;

/**
 * @author user
 *
 */
public interface RecipeService {
	
	public Recipe addRecipe(Recipe recipe);
	
	public List<Recipe> getRecipes(String searchKey);

}
