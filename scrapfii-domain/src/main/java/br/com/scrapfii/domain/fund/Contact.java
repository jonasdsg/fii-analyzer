package br.com.scrapfii.domain.fund;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public abstract class Contact implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String director;
	private String phone;
	private String address;
	private String bookKeeper;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBookKeeper() {
		return bookKeeper;
	}
	public void setBookKeeper(String bookKeeper) {
		this.bookKeeper = bookKeeper;
	}


	
	
}
