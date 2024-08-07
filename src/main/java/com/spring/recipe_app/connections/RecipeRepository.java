package com.spring.recipe_app.connections;

import com.spring.recipe_app.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RecipeRepository extends JpaRepository<Recipe, Integer>
{
}
