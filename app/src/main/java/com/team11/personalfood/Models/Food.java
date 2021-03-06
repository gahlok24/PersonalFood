package com.team11.personalfood.Models;

public class Food {
    private String foodName;
    private String foodUrl;
    private String negativeIngredient;
    private String positiveIngredient;

    public Food(String foodName, String foodUrl, String negativeIngredient, String positiveIngredient) {
        this.foodName = foodName;
        this.foodUrl = foodUrl;
        this.negativeIngredient = negativeIngredient;
        this.positiveIngredient = positiveIngredient;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodUrl() {
        return foodUrl;
    }

    public String getNegativeIngredient() {
        return negativeIngredient;
    }

    public String getPositiveIngredient() {
        return positiveIngredient;
    }
}
