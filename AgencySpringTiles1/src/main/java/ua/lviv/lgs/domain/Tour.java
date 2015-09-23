package ua.lviv.lgs.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Tour {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column (name="name")
	private String name;
	
	@Column (name="name")
	private String date;
	
	//nokjkhnb
	@Column (name="name")
	private String hit;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "city")
	@JoinTable( name="tour_city", joinColumns={@JoinColumn (name="tour_id")} ,
	inverseJoinColumns={@JoinColumn (name="city_id")})
	
	
	private Set<City> city=new HashSet<City>();
	
	
	public Tour(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}


	private Tour (){
		
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Set<City> getCity() {
		return city;
	}


	public void setCiti(Set<City> city) {
		this.city = city;
	}

}