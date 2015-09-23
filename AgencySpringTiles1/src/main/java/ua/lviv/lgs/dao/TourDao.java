package ua.lviv.lgs.dao;

import java.util.List;

import ua.lviv.lgs.domain.Tour;



public interface TourDao {
void insertTour(Tour tour);
	
	List<Tour> getAllTours();
	
	Tour findByNameAndDate(String name, String date);
	
}

