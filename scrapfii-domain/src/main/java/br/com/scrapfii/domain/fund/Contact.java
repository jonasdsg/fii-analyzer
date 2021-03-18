package br.com.scrapfii.domain.fund;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public abstract class Contact implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected String director;
	protected String phone;
	protected String address;
	protected String bookKeeper;

	public Contact(String director, String phone, String address, String bookKeeper) {
		this.director = director;
		this.phone = phone;
		this.address = address;
		this.bookKeeper = bookKeeper;
	}

	
	
}
