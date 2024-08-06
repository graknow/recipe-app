package com.spring.recipe_app.connection;

import com.spring.recipe_app.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RecipeRepository extends JpaRepository<Recipe, Integer>
{
}
