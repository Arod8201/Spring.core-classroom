package com.srping.core.session07.tx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.srping.core.session07.tx.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	public void buyBook(Integer wid, Integer bid) {

	}

	public void buyBooks(Integer wid, Integer... bids) {

	}

}
