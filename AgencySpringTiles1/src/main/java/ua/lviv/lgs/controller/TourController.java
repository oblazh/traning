package ua.lviv.lgs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lgs.domain.Tour;
import ua.lviv.lgs.service.TourService;

@Controller
public class TourController {

	@Autowired
	TourService service;
	
	@RequestMapping(value = "/showAllTours")
	public String getAllTours(Model model) {
		List<Tour> tours = service.getAllTours();
		model.addAttribute("allTours", tours);
		
		

		return "tour-all";
	}
	
	@RequestMapping(value = "/createTour") 
	public String createTourPage() {
		return "tour-new";
	}
	
	
	@RequestMapping(value = "/showAllTours", method = RequestMethod.POST)
public String createTour(@RequestParam(value = "name") String name,
			@RequestParam(value = "date") String date) {
		service.insertTour(name, date);
		return "redirect:/showAllTours";
	}
}
