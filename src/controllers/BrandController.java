package controllers;

import models.Brand;

public class BrandController {
  public Brand[] sortBubbleDesc(Brand[] brands) {
    int n = brands.length;
    for (int i = 0; i < n; i++) {
      boolean cambio = false;
      for (int j = 1; j < n; j++) {
        if (brands[i].getTotalValidYears() < brands[j].getTotalValidYears()) {
          Brand temp = brands[i];
          brands[i] = brands[j];
          brands[j] = temp;
          cambio = true;
        }
      }
      if (!cambio) {
        break;
      }
    }
    return brands;
  }

  public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
    int bajo = 0;
    int alto = brands.length - 1;

    if (isAscending) {
      while (bajo <= alto) {
        int central = (alto + bajo) / 2;
        if (brands[central].getTotalValidYears() == validYears) {
          return brands[central];
        }
        if (brands[central].getTotalValidYears() > validYears) {
          bajo = central + 1;
        } else {
          alto = central - 1;
        }
      }
    } else {
      while (bajo <= alto) {
        int central = (alto + bajo) / 2;
        if (brands[central].getTotalValidYears() == validYears) {
          return brands[central];
        }
        if (brands[central].getTotalValidYears() < validYears) {
          bajo = central + 1;
        } else {
          alto = central - 1;
        }
      }
    }
    return null;
  }
}
