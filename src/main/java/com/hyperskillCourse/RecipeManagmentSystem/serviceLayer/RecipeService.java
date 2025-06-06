package com.hyperskillCourse.RecipeManagmentSystem.serviceLayer;


import com.hyperskillCourse.RecipeManagmentSystem.businessLayer.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RecipeService {

    private Recipe recipe = new Recipe();

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Recipe getRecipe() {
        return recipe;
    }


}