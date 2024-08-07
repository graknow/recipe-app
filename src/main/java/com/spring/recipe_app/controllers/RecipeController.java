package com.spring.recipe_app.controllers;

import com.spring.recipe_app.connections.RecipeRepository;
import com.spring.recipe_app.models.Recipe;
import com.spring.recipe_app.services.interfaces.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RecipeController
{
    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipe/all")
    @ResponseBody
    public List<Recipe> getAll()
    {
        return recipeService.getAll();
    }

    @GetMapping("/recipe/{id}")
    @ResponseBody
    public Optional<Recipe> getOne(@PathVariable String id)
    {
        try
        {
            return recipeService.getOne(Integer.parseInt(id));
        }
        catch (NumberFormatException ex)
        {
            return Optional.empty();
        }
    }

    @PostMapping("/recipe")
    public ResponseEntity<HttpStatus> postOne(@RequestBody Recipe recipe)
    {
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
