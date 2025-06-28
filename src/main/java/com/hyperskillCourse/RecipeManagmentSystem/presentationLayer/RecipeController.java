package com.hyperskillCourse.RecipeManagmentSystem.presentationLayer;

import com.hyperskillCourse.RecipeManagmentSystem.businessLayer.Recipe;
import com.hyperskillCourse.RecipeManagmentSystem.serviceLayer.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("api/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @PostMapping("/new")
    public ResponseEntity<Map<String, Integer>> addRecipe(@RequestBody Recipe recipe) {
        Integer id = recipeService.addRecipe(recipe);
        return new ResponseEntity<>(Map.of("id", id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable int id) {
       Recipe recipe = recipeService.getRecipe(id);
       return (recipe != null)
               ? new ResponseEntity<>(recipe, HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
