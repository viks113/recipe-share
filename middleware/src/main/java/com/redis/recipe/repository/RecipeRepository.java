/**
 * 
 */
package com.redis.recipe.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.redis.recipe.entity.Recipe;

/**
 * @author user
 *
 */
public interface RecipeRepository extends CrudRepository<Recipe, String>{
	
	

}
