package org.example;

// Car class with many optional attributes
class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private int doors;
    private boolean hasSunroof;

    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.doors = builder.doors;
        this.hasSunroof = builder.hasSunroof;
    }

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private String color;
        private int doors;
        private boolean hasSunroof;

        public Builder(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder hasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public String toString() {
        return "Car: " + year + " " + make + " " + model + " (" + color + ")";
    }
}

public class Builder {
    public static void main(String[] args) {
        Car car1 = new Car.Builder("Toyota", "Camry", 2022)
                .color("Blue")
                .doors(4)
                .hasSunroof(false)
                .build();

        Car car2 = new Car.Builder("Honda", "Civic", 2022)
                .color("Red")
                .doors(2)
                .hasSunroof(true)
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
