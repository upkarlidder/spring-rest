package com.upkar.springdemo.model;

import java.util.List;

public class Book {
	private String id;
	private String title;
	private String isbn;
	private String genre;
	private List<String> authors;
	private List<String> cat;

	public Book() {
		super();
	}

	public Book(String id, String title, String isbn, String genre, List<String> authors, List<String> cat) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.genre = genre;
		this.authors = authors;
		this.cat = cat;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getgenre() {
		return genre;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public List<String> getCat() {
		return cat;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void setCat(List<String> cat) {
		this.cat = cat;
	}
}