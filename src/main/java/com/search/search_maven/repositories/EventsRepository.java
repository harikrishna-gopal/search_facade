package com.search.search_maven.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.search.search_maven.models.Events;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventsRepository extends MongoRepository<Events, String> {

	List<Events> findByUser(@Param("user") String user);
	
	List<Events> findByType(@Param("type") String type);
	
	Optional<Events> findById(@Param("id") String id);
	
	List<Events> findByIp(@Param("ip") String ip);

	List<Events> findByTime(@Param("time") Date time);
	
}
