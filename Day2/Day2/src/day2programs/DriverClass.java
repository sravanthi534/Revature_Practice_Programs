package day2programs;

public class DriverClass {
	public static void main(String[] args) {
		Library library=new Library();
		SpellBook spellBook=new SpellBook("spells","abcd","spell",false);
		PotionBook positionBook=new PotionBook("positions","efg","recepesn",false);
		DarkArtsBook darkArtBook=new DarkArtsBook("secret dark","ghi","dark arts",true);
		library.addBook(spellBook);
		library.addBook(positionBook);
		library.addBook(darkArtBook);
		library.listAllBooks();
		LibraryUser student=new LibraryUser("horry", false);
		LibraryUser professor=new LibraryUser("somee", true);
		student.borrowBook(spellBook);
		student.borrowBook(darkArtBook);
		professor.borrowBook(darkArtBook);
		
		
		
	}

}
