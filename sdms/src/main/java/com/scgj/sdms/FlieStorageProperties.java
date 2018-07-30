package com.scgj.sdms;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FlieStorageProperties {

    //import org.springframework.boot.context.properties.ConfigurationProperties;


    public class FlieStrorageProperties {
        private String uploadDir;

        public String getUploadDir() {
            return uploadDir;
        }

        public void setUploadDir(String uploadDir) {
            this.uploadDir = uploadDir;
        }
    }
}
