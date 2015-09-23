package ua.lviv.lgs.dao;

import java.util.List;

import ua.lviv.lgs.domain.City;



public interface CityDao {
void insertCity(City city);
	
	List<City> getAllCities();
	
	City findByNameAndCode(String name, String code);
	
}