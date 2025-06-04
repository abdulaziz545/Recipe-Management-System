package com.hyperskillCourse.RecipeManagmentSystem.businessLayer;

import org.springframework.stereotype.Component;

@Component
public class MyMapper {

    public RecipeDTO convertRecipeDTO(Recipe recipe) {
        return new RecipeDTO(recipe.getName(), recipe.getDescription(), recipe.getIngredients(), recipe.getDirections());
    }

    public Recipe convertDTOToRecipe(RecipeDTO recipeDTO) {
        return new Recipe(recipeDTO.getName(), recipeDTO.getDescription(), recipeDTO.getIngredients(), recipeDTO.getDirections());
    }
}
