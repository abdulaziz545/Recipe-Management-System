package com.hyperskillCourse.RecipeManagmentSystem.businessLayer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RecipeDTO {
    private String name;
    private String description;
    private String ingredients;
    private String directions;
}
