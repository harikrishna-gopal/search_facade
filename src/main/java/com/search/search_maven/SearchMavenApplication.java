package com.search.search_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages ="com.search.search_maven")
@EnableMongoRepositories(basePackages ="com.search.search_maven.repositories")
@EnableAutoConfiguration
public class SearchMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchMavenApplication.class, args);
	}
}
