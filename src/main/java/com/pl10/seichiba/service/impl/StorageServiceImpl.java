package com.pl10.seichiba.service.impl;

import com.pl10.seichiba.service.StorageService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service("storageService")
public class StorageServiceImpl implements StorageService{

    private final Path rootLocation = Paths.get("uploads");

    @Override
    public void init() {
        try {
            if(Files.exists(rootLocation)==false) {
                Files. createDirectory(rootLocation);
            }
        } catch (IOException e) {
            throw new RuntimeException("Could not initialize storage!");
        }
    }
}
