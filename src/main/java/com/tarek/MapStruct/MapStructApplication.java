package com.tarek.MapStruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.tarek.MapStruct.Mapper")
public class MapStructApplication extends Throwable {

	public static void main(String[] args) {

		try {
			SpringApplication.run(MapStructApplication.class, args);

		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
