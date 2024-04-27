package com.personal.projects.ecommerce.fundamentalapi.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.personal.projects.ecommerce.fundamentalapi.entity.UploadResponse;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class FileUploadApi {
    
    @PostMapping("/catalog/upload")
    public ResponseEntity<UploadResponse> handleFileUpload(
        // @RequestParam("CatalogName") String CatalogName,
        @RequestParam("Supplier") String Supplier,
        @RequestParam("skipApproval") Boolean SkipApproval,
        @RequestParam("activateAutomatically") Boolean ActivateAutomatically,
        @RequestParam("sendForApproval") Boolean SendForApproval,
        @RequestPart("CatalogItemFile") MultipartFile catalogItemFile,
        @RequestPart("Images") MultipartFile ZippedImages
    ) {
        //TODO: process POST request
        String s = "UPLOAD SUCCESSFUL";
        UploadResponse response = new UploadResponse();
        response.setId(UUID.randomUUID().toString());
        response.setStatus(s);
        System.out.println("Request recieved to workload manager");
        return ResponseEntity.created(null).contentType(MediaType.APPLICATION_JSON).body(response);
    }
    
}
