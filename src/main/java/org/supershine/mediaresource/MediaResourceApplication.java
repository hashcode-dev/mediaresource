package org.supershine.mediaresource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MediaResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaResourceApplication.class, args);
	}

}
