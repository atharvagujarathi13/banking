package com.banking.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.Employee;

@RestController
public class BankingController {
	@GetMapping("allEmployee")
	public String displayAll() {
		return "I am get Mapping";
	}
	
	
	@PostMapping("createProfile")
	public String CreateRecord(@RequestBody Employee emp) {
		return "I am post mapping" +" " + emp.getName() +" " + emp.getAddress()+" " + emp.getEmail()+" " + emp.getPassword();
	}

	@PutMapping("editProfile")
	public String editRecord() {
		return "I am put Mapping";
	}

	@PatchMapping("partialEditProfile")
	public String partialEditRecord() {
		return "I am patch Mapping";
	}

	@DeleteMapping("deleteProfile")
	public String deleteRecord() {
		return "I am delete Mapping";
	}

}
