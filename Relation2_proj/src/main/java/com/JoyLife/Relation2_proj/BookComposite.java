package com.JoyLife.Relation2_proj;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class BookComposite implements Serializable{
	@Column(name = "BOOKID",length = 10)
	private int bookId;
	@Column(name = "ISBN",length = 10)
	private int isbn;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public BookComposite() {
		super();
		// TODO Auto-generated constructor stub
	}

}
