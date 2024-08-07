package com.spring.recipe_app.controllers;

import com.spring.recipe_app.models.Recipe;
import com.spring.recipe_app.services.interfaces.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class RecipeController
{
    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipe/all")
    @ResponseBody
    public ResponseEntity<List<Recipe>> getAll()
    {
        return new ResponseEntity<>(recipeService.getRecipes(), HttpStatus.OK);
    }

    @GetMapping("/recipe/{id}")
    @ResponseBody
    public ResponseEntity<Optional<Recipe>> getById(@PathVariable Integer id)
    {
        return new ResponseEntity<>(recipeService.getRecipe(id), HttpStatus.OK);
    }

    @PostMapping("/recipe")
    public ResponseEntity<Integer> postOne(@RequestBody Recipe recipe)
    {
        var result = recipeService.saveRecipe(recipe);

        if (result != null)
            return new ResponseEntity<>(result.getId(), HttpStatus.OK);

        return new ResponseEntity<>(-1, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/recipe/{id}")
    public ResponseEntity<Integer> deleteById(@PathVariable Integer id)
    {
        var isRemoved = recipeService.deleteRecipe(id);

        if (isRemoved)
            return new ResponseEntity<Integer>(id, HttpStatus.OK);

        return new ResponseEntity<Integer>(id, HttpStatus.NOT_FOUND);
    }
}
