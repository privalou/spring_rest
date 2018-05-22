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
import java.util.List;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class DictionaryCheckTest {
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
    public void checkAmounts(){
        List<UserRole> roles = userRoleService.getRoles();
        Assert.assertEquals(2,roles.size());

        List<Category> categories = categoryService.getCategories();
        Assert.assertEquals(7, categories.size());

        List<PropertyType> propertyTypes = propertyTypeService.getPropertyTypes();
        Assert.assertEquals(5, propertyTypes.size());

        List<RoadClass> roadClasses = roadClassService.getRoadClasses();
        Assert.assertEquals(4, roadClasses.size());

        List<TransitCondition> transitConditions = transitConditionService.getTransitCondition();
        Assert.assertEquals(3, transitConditions.size());

        List<TypeOfUsage> typeOfUsages = typeOfUsageService.getTypeOfUsages();
        Assert.assertEquals(2, typeOfUsages.size());

    }
}
