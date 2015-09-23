package ua.lviv.lgs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lgs.domain.City;
import ua.lviv.lgs.service.CityService;

@Controller
public class CityController {
	
	@Autowired
	CityService service;
	
	@RequestMapping(value = "/showAllCities")
	public String getAllCities(Model model) {
		List<City> cities = service.getAllCities();
		model.addAttribute("allCities", cities);
		
		

		return "home";
	}
	
	@RequestMapping(value = "/createCity") 
	public String createCityPage() {
		return "newCity";
	}
	
	
	@RequestMapping(value = "/showAllCities", method = RequestMethod.POST)
public String createCity(@RequestParam(value = "name") String name,
			@RequestParam(value = "code") String code) {
		
		service.insertCity(name, code);
		return "redirect:/showAllCities";
	}
}