package ua.lviv.lgs.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.TourDao;
import ua.lviv.lgs.domain.Tour;
import ua.lviv.lgs.service.TourService;

@Service("authorService")
public class TourServiceImpl implements TourService{
	
	@Autowired
	private TourDao dao;
	
	
	public void insertTour(String name, String date) {
		Tour t=new Tour(name, date);
		dao.insertTour(t);
		
	}

	
	public List<Tour> getAllTours() {
		
		return dao.getAllTours();
	}

	
	public Tour findByNameAndDate(String name, String date) {
		
		return dao.findByNameAndDate(name, date);
	}

}
