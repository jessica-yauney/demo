package com.example.demo.controllers;

import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jmallen94 on 7/21/20.
 */
@Controller
public class AuthorController {
	private final AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	public String getAuthors(Model model){
		model.addAttribute("authors", authorRepository.findAll());
		return "authors/list";
	}
}
