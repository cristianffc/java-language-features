package domain.entity;

public class Car {

    private String name;
    private Color color;
    private Integer maxSpeed;
    private Boolean automaticGearbox;

    public Car(String name, Color color, Integer maxSpeed, Boolean automaticGearbox) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.automaticGearbox = automaticGearbox;
    }

    public static class Builder {
        private String name;
        private Color color;
        private Integer maxSpeed;
        private Boolean automaticGearbox;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder withSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder withaAutomaticGearbox(Boolean automaticGearbox) {
            this.automaticGearbox = automaticGearbox;
            return this;
        }

        public Car build() {
            return new Car(name, color, maxSpeed, automaticGearbox);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Boolean getAutomaticGearbox() {
        return automaticGearbox;
    }

    public void setAutomaticGearbox(Boolean automaticGearbox) {
        this.automaticGearbox = automaticGearbox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        if (name != null ? !name.equals(car.name) : car.name != null) {
            return false;
        }
        if (color != car.color) {
            return false;
        }

        return maxSpeed != null ? maxSpeed.equals(car.maxSpeed) : car.maxSpeed == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (maxSpeed != null ? maxSpeed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", automaticGearbox=" + automaticGearbox +
                '}';
    }
}
