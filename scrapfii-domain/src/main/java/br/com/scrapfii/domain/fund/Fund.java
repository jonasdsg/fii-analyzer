package br.com.scrapfii.domain.fund;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public abstract class Fund implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private About about;
	private Contact contact;
	private History history;
	
	public About getAbout() {
		return about;
	}
	
	public void changeInfoAbout(About about) {
		this.about = about;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public History getHistory() {
		return history;
	}
	public void addYear(Year year) {
		this.history.addYear(year);
	}
	
	
}
