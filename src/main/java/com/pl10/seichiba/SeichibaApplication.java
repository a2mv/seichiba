package com.pl10.seichiba;

import com.pl10.seichiba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeichibaApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("storageService")
	private StorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(SeichibaApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		storageService.init();
	}
}
