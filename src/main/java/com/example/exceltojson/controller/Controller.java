package com.example.exceltojson.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.exceltojson.service.Service;

@CrossOrigin(origins = "*")
@RestController
public class Controller {
	
	@PostMapping(value="/getJson")
	public void getJson(@RequestParam("file") MultipartFile file) throws IOException, InvalidFormatException {
		 String fileName = file.getOriginalFilename();
		 Path filepath = Paths.get(file.getOriginalFilename());

		    try (OutputStream os = Files.newOutputStream(filepath)) {
		        os.write(file.getBytes());
		    }
		    
		FileInputStream excelFile = new FileInputStream(new File(fileName));
		Workbook workbook = new XSSFWorkbook(excelFile);
	
		
		Service service = new Service();
		service.convertExcelToJson(workbook);
		System.out.println(file.getOriginalFilename());
		
	}
	

}
