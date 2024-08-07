package com.spring.recipe_app.services.interfaces;

import com.spring.recipe_app.models.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeService
{
    List<Recipe> getRecipes();
    Optional<Recipe> getRecipe(int id);

    Recipe saveRecipe(Recipe recipe);

    Boolean deleteRecipe(int id);
}
