package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.City;



public interface CityService {
	void insertCity(String name, String code);

	List<City> getAllCities();

	City findByNameAndCode(String name, String code);

}
