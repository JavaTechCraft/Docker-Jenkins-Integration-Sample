package com.techcraft.jenkin.practice.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationSampleApplication {

	public static Logger logger = LoggerFactory.getLogger(DockerJenkinsIntegrationSampleApplication.class);

	public static void main(String[] args) {
		logger.info("Entered into class DockerJenkinsIntegrationSampleApplication....");
		SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
		logger.info("Ending ***** class DockerJenkinsIntegrationSampleApplication....");
	}

}
