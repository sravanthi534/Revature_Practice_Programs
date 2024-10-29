package day2programs;

public class LibraryUser {
private String name;
private boolean isProfessor;
public LibraryUser(String name,boolean isProfessor) {
	this.name=name;
	this.isProfessor=isProfessor;
}
public void borrowBook(MagicalBook book)
{
	if(book.isRestricted() && !isProfessor)
	{
		System.out.println(name+" not allowed to borrow ");
	}
	else
	{
		System.out.println(name+"borrowed"+book.getTitle());
		book.openBook();
		book.useBook();
		book.closeBook();
	}
}
}
