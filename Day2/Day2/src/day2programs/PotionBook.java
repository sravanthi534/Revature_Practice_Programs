package day2programs;

public class PotionBook extends MagicalBook implements Readable{

	public PotionBook(String title, String author, String subject, boolean isRestricted) {
		super(title, author, "potion", false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String summarizeContent() {
		// TODO Auto-generated method stub
		return "recepes";
	}

	@Override
	public void bookmarkPage(int pageNumber) {
		// TODO Auto-generated method stub
		System.out.println("book mark page "+pageNumber);
		
	}

	@Override
	public void useBook() {
		// TODO Auto-generated method stub
		System.out.println("using the position book to learn recepes");
	}

}
