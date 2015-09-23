package ua.lviv.lgs.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.lviv.lgs.dao.CityDao;

import ua.lviv.lgs.domain.City;

@Repository
public class CityDaoImpl implements CityDao {
	
	@PersistenceContext(unitName = "Primary")
	private EntityManager em;


	public EntityManager getEm() {
		return em;
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void insertCity(City city) {
		em.persist(city);
		
	}

	@Override
	public List<City> getAllCities() {
		return em.createQuery("from City").getResultList();
	}

	@Override
	public City findByNameAndCode(String name, String code) {
		return (City) em.createNamedQuery("City.getByNameAndCode")
				.setParameter("name", name).setParameter("code", code)
				.getSingleResult();
	}

}
