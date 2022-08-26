package com.carproject.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ResourcePath;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class)
public class CarFilterModel {
    @ResourcePath(paths = "/content/carproject/carData/cars")
    private Resource allCars;


    private List<CarModel> filteredCars = new ArrayList<>();

    public CarFilterModel(Resource allCars) {
        this.allCars = allCars;
    }

    @PostConstruct
    protected void init(){
        allCars.getChildren().forEach(this::addCarstoFilteredList);
    }

    @ValueMapValue(name = "selectedCarBrand", injectionStrategy = InjectionStrategy.OPTIONAL)
    private String selectedCarBrand;


    private void addCarstoFilteredList(Resource resource){
        CarModel car = resource.adaptTo(CarModel.class);

        if("All".equals(selectedCarBrand)){
            filteredCars.add(car);
        }
        if (car.getBrand().equals(selectedCarBrand)){
            filteredCars.add(car);
        }

    }

    public List<CarModel> getFilteredCars(){
        return filteredCars;
    }
}
