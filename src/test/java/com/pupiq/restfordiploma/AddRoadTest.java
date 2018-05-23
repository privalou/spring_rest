package com.pupiq.restfordiploma;

import com.pupiq.restfordiploma.model.Road;
import com.pupiq.restfordiploma.service.*;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class AddRoadTest {

    @Resource
    private CategoryService categoryService;

    @Resource
    private PropertyTypeService propertyTypeService;

    @Resource
    private RoadClassService roadClassService;

    @Resource
    private TransitConditionService transitConditionService;

    @Resource
    private TypeOfUsageService typeOfUsageService;

    @Resource
    private RoadService roadService;

    private Road road;


    @Test
    public void addRoad() {
        road = new Road();
        road.setName("M5");
        road.setNote("Test");
        road.setCategory(categoryService.getCategory("IА"));
        road.setPropertyType(propertyTypeService.getPropertyType("Федеральная"));
        road.setRoadClass(roadClassService.getRoadClass("Автомобильные дороги федерального значения"));
        road.setTransitCondition(transitConditionService.getTransitCondition("Автомагистраль"));
        road.setTypeOfUsage(typeOfUsageService.getTypeOfUsage("Общего пользования"));
        roadService.addRoad(road);
    }

    @After
    public void deleteRoad() {
        roadService.deleteRoad(road.getId());
    }

}
