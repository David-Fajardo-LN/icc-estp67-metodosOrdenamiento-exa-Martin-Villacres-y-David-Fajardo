package models;

import java.util.Arrays;

public class Brand {
  private String brandName;
  private CarModel[] carModels;

  public Brand() {
  }

  public Brand(String brandName, CarModel[] carModels) {
    this.brandName = brandName;
    this.carModels = carModels;
  }

  public CarModel[] getCarModels() {
    return carModels;
  }

  public void setCarModels(CarModel[] carModels) {
    this.carModels = carModels;
  }

  @Override
  public String toString() {
    return "Brand [brandName=" + brandName + ", carModels=" + Arrays.toString(carModels) + "]";
  }

  public int getTotalValidYears() {
    int validYears = 0;
    for (CarModel carModel : carModels) {
      for (CarYear carYear : carModel.getCarYears()) {
        if (carYear.isValid()) {
          validYears++;
        }
      }
    }
    return validYears;
  }

}
