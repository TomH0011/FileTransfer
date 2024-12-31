package com.example.FileTransferProject.controllers;

import com.example.FileTransferProject.model.File;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadFile {

    @PostMapping("/upload")
    public ResponseEntity<File> uploadFile() {
        File file = new File();
        return ResponseEntity.status(HttpStatus.CREATED).body(file);
    }
}
