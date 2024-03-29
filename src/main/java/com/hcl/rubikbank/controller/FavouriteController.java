package com.hcl.rubikbank.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rubikbank.dto.FavouriteResponseDto;
import com.hcl.rubikbank.service.FavouriteService;


@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RequestMapping("/api")
public class FavouriteController {
	
	private static final Logger logger = LoggerFactory.getLogger(FavouriteController.class);
	
	@Autowired
	FavouriteService favouriteService;

	
	@GetMapping("/favourites/{pageCount}")
	public ResponseEntity<List<FavouriteResponseDto>> getFavoriteAccounts(@PathVariable Integer pageCount) {
		logger.info("Favorite accounts");
		List<FavouriteResponseDto> response = favouriteService.getFavoriteAccounts(pageCount);
		return new ResponseEntity<>(response, HttpStatus.OK);

	}
}
