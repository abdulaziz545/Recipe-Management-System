package com.hyperskillCourse.RecipeManagmentSystem.persistanceLayer;

import com.hyperskillCourse.RecipeManagmentSystem.businessLayer.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    Optional<Recipe> findFirstBy();
}
