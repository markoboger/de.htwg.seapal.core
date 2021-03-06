package de.htwg.seapal.model.impl;

import java.util.UUID;

import de.htwg.seapal.model.IPerson;
import de.htwg.seapal.model.ModelDocument;

public class Person extends ModelDocument implements IPerson {

	/**
	 * Serial version UID for serialization.
	 */
	private static final long serialVersionUID = 1L;

	private String user; // UUID user

	private String firstname = null;

	private String lastname = null;

	private Long birth; // unix timestamp

	private Long registration; // unix timestamp

	private Integer age = 0;

	private String nationality = null;

	private String email = null;

	private String telephone = null;

	private String mobile = null;

	private String street = null;

	private Integer postcode = 0;

	private String city = null;

	private String country = null;

	public Person() {
		setId(UUID.randomUUID().toString());
		user = "";

		firstname = "";
		lastname = "";
		birth = 0L;
		registration = 0L;
		age = 0;
		nationality = "";

		email = "";
		telephone = "";
		mobile = "";

		street = "";
		postcode = 0;
		city = "";
		country = "";
	}

	public Person(IPerson person) {
		user = person.getUser();
		setId(person.getId());

		firstname = person.getFirstname();
		lastname = person.getLastname();
		birth = person.getBirth();
		registration = person.getRegistration();
		age = person.getAge();
		nationality = person.getNationality();

		email = person.getEmail();
		telephone = person.getTelephone();
		mobile = person.getMobile();

		street = person.getStreet();
		postcode = person.getPostcode();
		city = person.getCity();
		country = person.getCountry();
	}

	public Person(Integer id) {
		setId("PERSON-" + id);
	}

	@Override
	public String getFirstname() {
		return firstname;
	}

	@Override
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String getLastname() {
		return lastname;
	}

	@Override
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public Long getBirth() {
		return birth;
	}

	@Override
	public void setBirth(Long birth) {
		this.birth = birth;
	}

	@Override
	public Long getRegistration() {
		return registration;
	}

	@Override
	public void setRegistration(Long registration) {
		this.registration = registration;
	}

	@Override
	public Integer getAge() {
		return age;
	}

	@Override
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String getNationality() {
		return nationality;
	}

	@Override
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTelephone() {
		return telephone;
	}

	@Override
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String getMobile() {
		return mobile;
	}

	@Override
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public Integer getPostcode() {
		return postcode;
	}

	@Override
	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String getUser() {
		return user;
	}

	@Override
	public void setUser(String user) {
		this.user = user;
	}
}