package com.hyperskillCourse.RecipeManagmentSystem.serviceLayer;


import com.hyperskillCourse.RecipeManagmentSystem.businessLayer.Recipe;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Service
public class RecipeService {

    private Integer id = 0;
    private Map<Integer, Recipe> recipeMap = new ConcurrentHashMap<>();

    public Integer addRecipe(Recipe recipe) {
        id = id + 1;
        recipeMap.put(id, recipe);
        return id;
    }

    public Recipe getRecipe(Integer id) {
        return recipeMap.get(id);
    }


}