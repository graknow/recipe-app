package com.spring.recipe_app.services.interfaces;

import com.spring.recipe_app.models.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeService
{
    List<Recipe> getAll();
    List<Recipe> getQuery();
    Optional<Recipe> getOne(int id);

    boolean saveOne(Recipe recipe);
}
