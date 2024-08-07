package com.spring.recipe_app.services;

import com.spring.recipe_app.connections.RecipeRepository;
import com.spring.recipe_app.models.Recipe;
import com.spring.recipe_app.services.interfaces.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DefaultRecipeService implements RecipeService
{
    @Autowired
    private RecipeRepository recipeRepo;

    @Override
    public List<Recipe> getAll()
    {
        return recipeRepo.findAll();
    }

    @Override
    public List<Recipe> getQuery()
    {
        return List.of();
    }

    @Override
    public Optional<Recipe> getOne(int id)
    {
        return recipeRepo.findById(id);
    }

    @Override
    public boolean saveOne(Recipe recipe)
    {
        return true;
    }
}
