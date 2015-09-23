package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.Tour;



public interface TourService {
	void insertTour(String name, String date);

	List<Tour> getAllTours();

	Tour findByNameAndDate(String name, String date);

}
