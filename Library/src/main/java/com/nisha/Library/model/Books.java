package com.nisha.Library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
public class Books {

	private int BookId;

	private String bookName;

	private String bookAuthor;

	private String bookType;

}
