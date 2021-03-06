package com.gmail.amrnablus.eav;

import com.gmail.amrnablus.eav.entity.Entity;
import com.gmail.amrnablus.eav.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EavApplication implements CommandLineRunner {

	
	@Autowired
	EntityService entityService;

	public static void main(String[] args) {
		SpringApplication.run(EavApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println(
                entityService.getEntityById(1L)
        );

    }
}
