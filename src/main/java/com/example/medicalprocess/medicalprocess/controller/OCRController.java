package com.example.medicalprocess.medicalprocess.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FilenameUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.sourceforge.tess4j.Tesseract;

@RestController
@RequestMapping("/OCR")
public class OCRController {
    
    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public ResponseEntity<String> translate(@RequestParam(name="file") MultipartFile file) throws Exception{
		String ext = FilenameUtils.getExtension(file.getOriginalFilename());
		if (!"png".equals(ext) && !"jpg".equals(ext)) {
			return ResponseEntity.badRequest().build();
		}
		String result = "";
		
		try {
			BufferedImage img = ImageIO.read(file.getInputStream());
			
	        Tesseract tesseract = new Tesseract();
	        
            //TODO: Need to Find a way to dynamically Path to Tesseract's "tessdata"
	        tesseract.setDatapath("E:\\Development\\Tesseract\\tessdata");
	        result = "";	     

	        //TODO: Need to Find a way to dynamically get the Language
            tesseract.setLanguage("eng");
			result = tesseract.doOCR(img);	        
		} catch (IOException e) {
			throw new Exception("Error reading File");
		}
		return ResponseEntity.ok(result);						
	}
    
}
