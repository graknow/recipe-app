package com.spring.recipe_app.config;

import com.spring.recipe_app.services.DefaultRecipeService;
import com.spring.recipe_app.services.interfaces.RecipeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration
{
    @Bean
    public RecipeService getRecipeService()
    {
        return new DefaultRecipeService();
    }
}
