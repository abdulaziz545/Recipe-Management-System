package com.hyperskillCourse.RecipeManagmentSystem.serviceLayer;

import com.hyperskillCourse.RecipeManagmentSystem.businessLayer.MyMapper;
import com.hyperskillCourse.RecipeManagmentSystem.businessLayer.RecipeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hyperskillCourse.RecipeManagmentSystem.persistanceLayer.RecipeRepository;

import java.util.NoSuchElementException;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final MyMapper myMapper;

    @Autowired
    RecipeService(RecipeRepository recipeRepository, MyMapper myMapper) {
        this.recipeRepository = recipeRepository;
        this.myMapper = myMapper;
    }

    public void saveRecipe(RecipeDTO recipeDTO) {
        recipeRepository.deleteAll();
        recipeRepository.save(myMapper.convertDTOToRecipe(recipeDTO));
    }

    public RecipeDTO getRecipe() {
        return recipeRepository.findFirstBy()
                .map(myMapper::convertRecipeDTO)
                .orElseThrow(() -> new NoSuchElementException("No recipe found"));
    }


}