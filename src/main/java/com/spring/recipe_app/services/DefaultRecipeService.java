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
    public List<Recipe> getRecipes()
    {
        return recipeRepo.findAll();
    }

    @Override
    public Optional<Recipe> getRecipe(int id)
    {
        return recipeRepo.findById(id);
    }

    @Override
    public Recipe saveRecipe(Recipe recipe)
    {
        try
        {
            return recipeRepo.save(recipe);
        }
        catch (Exception ex)
        {
            return null;
        }
    }

    @Override
    public Boolean deleteRecipe(int id)
    {
        try
        {
            recipeRepo.deleteById(id);
            return true;
        }
        catch (Exception ex)
        {
            return false;
        }
    }
}
