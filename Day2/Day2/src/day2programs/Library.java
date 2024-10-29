package day2programs;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<MagicalBook> books;
	public Library()
	{
		books=new ArrayList<>();
	}
	public void addBook(MagicalBook book)
	{
		books.add(book);
		
	}
	public void removeBook(MagicalBook book)
	{
		books.remove(book);
	}
	public void listAllBooks()
	{
		for(MagicalBook book:books)
		{
			System.out.println(book.getTitle());
		}
	}
	public MagicalBook searchBookByTitle(String title)
	{
		for(MagicalBook book:books)
		{
			if(book.getTitle().equalsIgnoreCase(title))
			{
				return book;
			}
		}
		return null;
	}
	
	

}
