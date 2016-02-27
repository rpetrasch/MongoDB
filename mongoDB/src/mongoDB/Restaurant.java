package mongoDB;

import static java.util.Arrays.asList;
import java.util.List;


public class Restaurant {
	
	private Integer id;
	private String name;
	private String street;
	private Integer zipcode;
	private String building;
	private List<Double> coord;
	private String borough;


	public Restaurant() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public Integer getZipcode() {
		return zipcode;
	}


	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}


	public String getBuilding() {
		return building;
	}


	public void setBuilding(String building) {
		this.building = building;
	}


	public List<Double> getCoord() {
		return coord;
	}


	public void setCoord(List<Double> coord) {
		this.coord = coord;
	}


	public String getBorough() {
		return borough;
	}


	public void setBorough(String borough) {
		this.borough = borough;
	}

}
