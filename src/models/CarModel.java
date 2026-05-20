package models;

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

}
