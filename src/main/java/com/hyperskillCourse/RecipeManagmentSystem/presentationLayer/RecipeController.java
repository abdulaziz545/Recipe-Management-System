package com.hyperskillCourse.RecipeManagmentSystem.presentationLayer;

import com.hyperskillCourse.RecipeManagmentSystem.businessLayer.Recipe;
import com.hyperskillCourse.RecipeManagmentSystem.serviceLayer.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @PostMapping("/api/recipe")
    public ResponseEntity<?> postRecipeToDB(@RequestBody Recipe recipe) {
        recipeService.setRecipe(recipe);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/api/recipe")
    public ResponseEntity<Recipe> getRecipe() {
        return ResponseEntity.ok(recipeService.getRecipe());
    }
}
