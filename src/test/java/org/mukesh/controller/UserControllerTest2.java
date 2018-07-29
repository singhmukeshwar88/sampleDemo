/**
 * 
 */
package org.mukesh.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mukesh.dto.UserDetails;
import org.mukesh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author Mukeshwar Singh
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
public class UserControllerTest2 {	
	
	@Autowired private MockMvc mockMvc;
	
	@MockBean private UsersService userService ;
	
	/**
	 * Test method for {@link org.mukesh.controller.UserController#getUserDetail()}.
	 */
	/*@Test
	public void testGetUserDetail() {
		fail("Not yet implemented");
	}*/

	/**
	 * Test method for {@link org.mukesh.controller.UserController#getUserDetails()}.
	 */
	/*@Test
	public void testGetUserDetails() {
		fail("Not yet implemented");
	}*/

	/**
	 * Test method for {@link org.mukesh.controller.UserController#saveUserDetails(org.mukesh.dto.UserDetails)}.
	 * @throws Exception 
	 */
	@Test
	public void testSaveUserDetails() throws Exception {
		
		/*UserDetails userDetails = new UserDetails(Mockito.anyLong(), Mockito.anyString(),
				Mockito.anyString(),Mockito.anyString());*/
		UserDetails userDetails2 = new UserDetails(123543L, "Mukeshwar",
				"Singh",new Date().toString());
		
		String content = "{\"actorId\":\"123543\",\"firstName\":\"Mukeshwar\",\"lastName\":\"Singh\",\"lastUpdate\":\"29-07-2018\"}";
		when(userService.saveUserDetails(Mockito.any(UserDetails.class))).thenReturn(userDetails2);
				
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/rest/userdetails")
				.accept(MediaType.APPLICATION_JSON)
				.content(content)
				.contentType(MediaType.APPLICATION_JSON);	
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		assertEquals(HttpStatus.CREATED.value(), response.getStatus());
	}

}
