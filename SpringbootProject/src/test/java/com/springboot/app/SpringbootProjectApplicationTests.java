package com.springboot.app;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import com.springboot.app.beans.Marks;
import com.springboot.app.beans.Student;
import com.springboot.app.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootProjectApplicationTests {

	@Autowired
	private StudentService studentService;
	
	RestTemplate restTemplate = new RestTemplate();
    final String baseUrl = "http://localhost:8086/Students";
	Marks marks =new Marks(45, 45, 45);
	Student mockStudent = new Student(1, "prem", "prem@gmail.com", marks);
	@Test
	public void updateStudent() throws URISyntaxException {
		
	    URI uri = new URI(baseUrl+"/updateExistingStudent");
	 
	    ResponseEntity<Boolean> result = restTemplate.postForEntity(uri, mockStudent ,Boolean.class);
	     System.out.println(" result.getBody()"+ result);
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
//	    Assert.assertEquals(true, result.getBody());
		
	}

}
