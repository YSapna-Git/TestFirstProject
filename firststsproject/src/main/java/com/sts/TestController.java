package com.sts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String handleTest() {
		return "Hello world";
	}
	
	@PostMapping(" ")
	public String postValues(@RequestBody String empName)
	{
		return empName;
	}


}
