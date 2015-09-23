package ua.lviv.lgs.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.TourDao;

import ua.lviv.lgs.domain.Tour;

@Repository
public class TourDaoImpl implements TourDao{
	@PersistenceContext(unitName = "Primary")
	private EntityManager em;


	public EntityManager getEm() {
		return em;
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}


	@Transactional
	public void insertTour(Tour tour) {
		em.persist(tour);
		
	}

	@Transactional
	public List<Tour> getAllTours() {
		return em.createQuery("from Tour").getResultList();
	}

	@Transactional
	public Tour findByNameAndDate(String name, String date) {
		return (Tour) em.createNamedQuery("Tour.getByNameAndDate")
				.setParameter("name", name).setParameter("date", date)
				.getSingleResult();
		}

}
