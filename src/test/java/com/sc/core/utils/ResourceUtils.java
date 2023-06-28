package com.sc.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class ResourceUtils {
    private final static Logger logger = LoggerFactory.getLogger(ResourceUtils.class);

    public String readString(String filePath) {
        String fileContent = null;

        try {
            URI fileUri = this.readResource(filePath);
            logger.warn("File {} found at {}", filePath, fileUri);
            fileContent = new String(Files.readAllBytes(Paths.get(fileUri)));
        } catch (Exception exception) {
            logger.error("File {} not found or not readable", filePath, exception);
        }

        return fileContent;
    }

    private URI readResource(final String fileName) throws URISyntaxException {
        return this.getClass().getClassLoader().getResource(fileName).toURI();
    }
}
