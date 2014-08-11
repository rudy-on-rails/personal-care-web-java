package br.com.elogroup.personalcareweb.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.elogroup.personalcareweb.web.util.ApiStatus;

@RestController
public class ApiStatusController {

	@RequestMapping("/api_status")
	public ApiStatus apiStatus(){
		return new ApiStatus("API is online and running!");
	}
}
