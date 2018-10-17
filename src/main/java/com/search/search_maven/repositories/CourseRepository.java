package com.search.search_maven.repositories;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.search.search_maven.models.Course;

@RepositoryRestResource(collectionResourceRel = "course", path = "course")
public interface CourseRepository extends MongoRepository<Course, String> {

	@Query("{ 'id' : { $gt: ?0, $lt: ?1 } }")
	List<Course> findCourseById(int ageGT, int ageLT);

}
