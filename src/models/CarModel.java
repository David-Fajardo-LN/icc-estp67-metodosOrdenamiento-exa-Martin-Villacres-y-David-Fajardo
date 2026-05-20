package models;

import java.util.Arrays;

public class CarModel {
  private String name;
  private CarYear[] carYears;

  public CarModel() {
  }

  public CarModel(String name, CarYear[] carYears) {
    this.name = name;
    this.carYears = carYears;
  }

  public CarYear[] getCarYears() {
    return carYears;
  }

  public void setCarYears(CarYear[] carYears) {
    this.carYears = carYears;
  }

  @Override
  public String toString() {
    return "CarModel [name=" + name + ", carYears=" + Arrays.toString(carYears) + "]";
  }

  

}
