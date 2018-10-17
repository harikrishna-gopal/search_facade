package com.search.search_maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.search.search_maven.models.Users;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRepositoryTest {
	
	@Autowired
    private TestRestTemplate restTemplate;
    private static final String URL = "http://localhost:6868/users";
    
    private static final String URL1 = "http://localhost:6868/users/search/findByWorkStation?workStation";
    private static final String URL2 = "http://localhost:6868/users/search/findByUser?user11";
    
    
    @Test
    public void testGetUsers() throws Exception {
        // prepare
        Users user = new Users("1", "user1", "workspace");

        //Execute
        ResponseEntity<Users> responseEntity = restTemplate.getForEntity(URL, Users.class, user);

        //collect data
        int status = responseEntity.getStatusCodeValue();
        Users resultUsers = responseEntity.getBody();

        //verify create status
        assertEquals("Correct Response Status", HttpStatus.OK.value(), status);
    }
    
    @Test
    public void testFindUserByWorkStation() throws Exception {
        // prepare
        Users user = new Users("1", "user1", "workspace");

        //Execute
        ResponseEntity<Users> responseEntity = restTemplate.getForEntity(URL1, Users.class, user );

        //collect data
        int status = responseEntity.getStatusCodeValue();
        Users resultUsers = responseEntity.getBody();

        //verify create status
        assertEquals("Correct Response Status", HttpStatus.OK.value(), status);
    }
    
    @Test
    public void testGetUserByUser() throws Exception {
        // prepare
        Users user = new Users("1", "user1", "workspace");

        //Execute
        ResponseEntity<Users> responseEntity = restTemplate.getForEntity(URL2, Users.class, user);

        //collect data
        int status = responseEntity.getStatusCodeValue();
        Users resultUsers = responseEntity.getBody();

        //verify create status
        assertEquals("Correct Response Status", HttpStatus.OK.value(), status);
    }
    
}
