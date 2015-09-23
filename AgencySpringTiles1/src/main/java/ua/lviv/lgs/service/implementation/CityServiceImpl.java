package ua.lviv.lgs.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.CityDao;
import ua.lviv.lgs.domain.City;
import ua.lviv.lgs.service.CityService;

@Service("authorService")
public class CityServiceImpl implements CityService{

	@Autowired
	private CityDao dao;
	
	
	public void insertCity(String name, String code) {
		City c=new City(name, code);
		dao.insertCity(c);
		
	}

	
	public List<City> getAllCities() {
		
		return dao.getAllCities();
	}

	
	public City findByNameAndCode(String name, String code) {
		
		return dao.findByNameAndCode(name, code);
	}

}
