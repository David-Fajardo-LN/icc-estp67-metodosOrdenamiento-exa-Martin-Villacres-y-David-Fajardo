package models;

public class Brand {
  private String brandName;
  private CarModel[] carModels;

  public Brand() {
  }

  public Brand(String brandName, CarModel[] carModels) {
    this.brandName = brandName;
    this.carModels = carModels;
  }

  public String getBrandName() {
        return brandName;
    }

  public void setBrandName(String brandName) {
      this.brandName = brandName;
  }

  public CarModel[] getCarModels() {
      return carModels;
  }

  public void setCarModels(CarModel[] carModels) {
      this.carModels = carModels;
  }

  @Override
  public String toString() {
    return brandName + " - Años válidos: " + getTotalValidYears();
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
