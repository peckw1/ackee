package com.ackee.quote.quote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	@GetMapping("/quote/id")
	public String getQuoteById(@RequestParam String id) {
		
		return "The id is " + id;
	}
}
