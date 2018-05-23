package com.pupiq.restfordiploma;

import com.pupiq.restfordiploma.controller.UserRoleController;
import com.pupiq.restfordiploma.model.UserRole;
import com.pupiq.restfordiploma.service.UserRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(UserRoleController.class)
public class UserRoleControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserRoleService service;

    @Test
    public void testUserRoleController() {
        UserRole userRole = new UserRole();
        userRole.setRoleName("TestRole");
    }
}