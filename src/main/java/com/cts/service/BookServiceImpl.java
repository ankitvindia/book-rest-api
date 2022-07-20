package com.cts.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cts.domain.Book;

@Service
public class BookServiceImpl implements BookService {
	
	private Long bookId=100L;
	
	private Map<Long,Book>bookMap=new HashMap<Long, Book>();
	{
		Book book=new Book();
		book.setId(bookId);
		book.setTitle("Spring microservices");
		book.setAuthor("Ankit");
		book.setCoverPhotoURl("kuch bhi");
		book.setIsbnNumber(1234555L);
		book.setPrice(123.4);
		book.setLanguage("Marathi");
		bookMap.put(book.getId(), book);
	}
	@Override
	public Collection<Book> findAll(){
		return bookMap.values();
	}

	@Override
	public Book findById(Long id) {
		return bookMap.get(id);
	}

	@Override
	public Book save(Book book){
		Long newBookId= ++bookId;
		book.setId(newBookId);
		bookMap.put(book.getId(), book);
		return bookMap.get(newBookId);
	}

	@Override
	public Book update(Book book) {
		bookId=book.getId();
		if(bookMap.get(bookId)!=null) {
			bookMap.put(bookId, book);
			return bookMap.get(bookId);
		}
		
		return null;
	}

	@Override
	public Book deleteById(Long id){
		if(bookMap.get(id) != null){
			return bookMap.remove(id);
		}
		return null;
	}

}
