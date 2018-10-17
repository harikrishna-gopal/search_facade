package com.search.search_maven.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.search.search_maven.models.Users;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository extends MongoRepository<Users, String> {

	List<Users> findByUser(@Param("user") String user);
	
	Optional<Users> findById(@Param("id") String id);
	
	List<Users> findByWorkStation(@Param("workStation") String workStation);
	
}
