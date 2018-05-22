package com.pupiq.restfordiploma;

import com.pupiq.restfordiploma.model.UserRole;
import com.pupiq.restfordiploma.service.UserRoleService;
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
public class RestForDiplomaApplicationTests {

	@Resource
	private UserRoleService userRoleService;

	@Test
	public void contextLoads() {
		userRoleService.addUserRole(new UserRole(1));
		userRoleService.addUserRole(new UserRole(2));
		List<UserRole> roles = userRoleService.getRoles();
		Assert.assertEquals(2,roles.size());
	}

}
