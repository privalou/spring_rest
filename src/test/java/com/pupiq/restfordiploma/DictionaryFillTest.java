package com.pupiq.restfordiploma;

import com.pupiq.restfordiploma.model.*;
import com.pupiq.restfordiploma.service.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class DictionaryFillTest {

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


    @Test
    public void fillData() {
        userRoleService.addUserRoles(Arrays.asList(new UserRole(1),
                new UserRole(2)));
        List<UserRole> roles = userRoleService.getRoles();
        Assert.assertEquals(2, roles.size());

        categoryService.addCategories(Arrays.asList(new Category("IА"),
                new Category("IБ"),
                new Category("IВ"),
                new Category("II"),
                new Category("III"),
                new Category("IV"),
                new Category("V")));
        List<Category> categories = categoryService.getCategories();
        Assert.assertEquals(7, categories.size());

        propertyTypeService.addPropertyTypes(Arrays.asList(new PropertyType("Федеральная"),
                new PropertyType("Субъекта Российской Федерации"),
                new PropertyType("Муниципальная"),
                new PropertyType("Физического лица"),
                new PropertyType("Юридического лица")));
        List<PropertyType> propertyTypes = propertyTypeService.getPropertyTypes();
        Assert.assertEquals(5, propertyTypes.size());

        roadClassService.addRoadClasses(Arrays.asList(new RoadClass("Автомобильные дороги федерального значения"),
                new RoadClass("Автомобильные дороги регионального или межмуниципального значения"),
                new RoadClass("Дороги местного значения"),
                new RoadClass("Частные автомобильные дороги")));
        List<RoadClass> roadClasses = roadClassService.getRoadClasses();
        Assert.assertEquals(4, roadClasses.size());

        transitConditionService.addTransitConditions(Arrays.asList(new TransitCondition("Автомагистраль"),
                new TransitCondition("Скоростная дорога"),
                new TransitCondition("Дорога обычного типа")));
        List<TransitCondition> transitConditions = transitConditionService.getTransitConditions();
        Assert.assertEquals(3, transitConditions.size());

        typeOfUsageService.addTypeOfUsages(Arrays.asList(new TypeOfUsage("Общего пользования"),
                new TypeOfUsage("Необщего пользования")));
        List<TypeOfUsage> typeOfUsages = typeOfUsageService.getTypeOfUsages();
        Assert.assertEquals(2, typeOfUsages.size());
    }

}
