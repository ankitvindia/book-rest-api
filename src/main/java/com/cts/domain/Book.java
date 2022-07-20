package com.cts.domain;

public class Book {
	private Long id;
	private String title;
	private String author;
	private String coverPhotoURl;
	private Long isbnNumber;
	private Double price;
	private String Language;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCoverPhotoURl() {
		return coverPhotoURl;
	}
	public void setCoverPhotoURl(String coverPhotoURl) {
		this.coverPhotoURl = coverPhotoURl;
	}
	public Long getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(Long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	

}
