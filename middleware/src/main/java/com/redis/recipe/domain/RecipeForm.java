/**
 * 
 */
package com.redis.recipe.domain;

import java.io.Serializable;

/**
 * @author user
 *
 */
public class RecipeForm implements Serializable{
	
	private static final long serialVersionUID = -3048792847919071991L;
	private String title;
	private String decription;
	private String category;
	private String steps;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSteps() {
		return steps;
	}
	public void setSteps(String steps) {
		this.steps = steps;
	}
	

}
