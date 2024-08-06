package com.spring.recipe_app.controller;

import com.spring.recipe_app.connection.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recipe")
public class RecipeController
{
    @Autowired
    private RecipeRepository recipeRepo;

    @GetMapping("get")
    public String getRecipe()
    {
        return recipeRepo.findAll().getFirst().getName();
    }
}
