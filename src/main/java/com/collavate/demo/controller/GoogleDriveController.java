package com.collavate.demo.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collavate.demo.pojo.User;
import com.collavate.demo.serviceimpl.GoogleDriveService;

@RestController
@RequestMapping("/api/drive")
public class GoogleDriveController {

	@Autowired
	private GoogleDriveService googleDriveService;
	
	@GetMapping("/listfile")
	public List<String> getAllFileFromDrive() throws IOException, GeneralSecurityException {
		return googleDriveService.getfiles();
	}
	
}
