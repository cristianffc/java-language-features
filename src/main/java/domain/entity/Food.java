package domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Food {

    private String name;
    private Integer calories;
    private Type type;
    private Color color;
    private boolean vegetarian;

    public Food(String name, Integer calories, Type type, Color color, boolean vegetarian) {
        this.name = name;
        this.calories = calories;
        this.type = type;
        this.color = color;
        this.vegetarian = vegetarian;
    }

    public static class Builder {
        private String name;
        private Integer calories;
        private Type type;
        private Color color;
        private boolean vegetarian;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCalories(Integer calories) {
            this.calories = calories;
            return this;
        }

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder withColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder withVegetarian(boolean vegetarian) {
            this.vegetarian = vegetarian;
            return this;
        }

        public Food build() {
            return new Food(name, calories, type, color, vegetarian);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}