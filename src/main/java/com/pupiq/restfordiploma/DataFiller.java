package com.pupiq.restfordiploma;

import com.pupiq.restfordiploma.model.*;
import com.pupiq.restfordiploma.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collections;

@Component
public class DataFiller implements CommandLineRunner {

    @Resource
    private UserRoleService userRoleService;

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

    @Resource
    private OrganisationService organisationService;

    @Resource
    private ViolationService violationService;

    @Override
    public void run(String... args) {
        fillData(args);
    }

    private void fillData(String[] args) {
        userRoleService.addUserRoles(Arrays.asList(new UserRole(1),
                new UserRole(2)));
        categoryService.addCategories(Arrays.asList(new Category("IА"),
                new Category("IБ"),
                new Category("IВ"),
                new Category("II"),
                new Category("III"),
                new Category("IV"),
                new Category("V")));
        propertyTypeService.addPropertyTypes(Arrays.asList(new PropertyType("Федеральная"),
                new PropertyType("Субъекта Российской Федерации"),
                new PropertyType("Муниципальная"),
                new PropertyType("Физического лица"),
                new PropertyType("Юридического лица")));
        roadClassService.addRoadClasses(Arrays.asList(new RoadClass("Автомобильные дороги федерального значения"),
                new RoadClass("Автомобильные дороги регионального или межмуниципального значения"),
                new RoadClass("Дороги местного значения"),
                new RoadClass("Частные автомобильные дороги")));
        transitConditionService.addTransitConditions(Arrays.asList(new TransitCondition("Автомагистраль"),
                new TransitCondition("Скоростная дорога"),
                new TransitCondition("Дорога обычного типа")));
        typeOfUsageService.addTypeOfUsages(Arrays.asList(new TypeOfUsage("Общего пользования"),
                new TypeOfUsage("Необщего пользования")));

        Organisation organisation = new Organisation();
        organisation.setName("Росавтодор");
        organisation.setLegallAddress("Москва, ул. Бочкова, д. 4");

        Road road = new Road();
        road.setName("M5");
        road.setNote("Test");
        road.setCategory(categoryService.getCategory("IА"));
        road.setPropertyType(propertyTypeService.getPropertyType("Федеральная"));
        road.setRoadClass(roadClassService.getRoadClass("Автомобильные дороги федерального значения"));
        road.setTransitCondition(transitConditionService.getTransitCondition("Автомагистраль"));
        road.setTypeOfUsage(typeOfUsageService.getTypeOfUsage("Общего пользования"));
        organisation.setRoads(Collections.singletonList(road));
        road.setOrganisation(organisation);
        Violation violation = new Violation();
        violation.setDepth(10);
        violation.setLength(50);
        violation.setWidth(90);
        violation.setLatitude(50D);
        violation.setLongitude(55D);
        violation.setStatus("reviewed");
        violation.setRoad(road);
        road.setViolations(Collections.singletonList(violation));
        organisationService.addOrganisation(organisation);
        roadService.addRoad(road);
        violationService.addViolation(violation);
    }
}
