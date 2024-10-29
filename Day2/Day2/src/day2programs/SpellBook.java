package day2programs;

public class SpellBook extends MagicalBook implements Readable{

	public SpellBook(String title, String author, String subject, boolean isRestricted) {
		super(title, author, "spells", false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String summarizeContent() {
		// TODO Auto-generated method stub
		return "spell book contains spells";
	}

	@Override
	public void bookmarkPage(int pageNumber) {
		// TODO Auto-generated method stub
		System.out.println("book mark page number "+pageNumber);
		
	}

	@Override
	public void useBook() {
		// TODO Auto-generated method stub
		System.out.println("using the spell book");
		
	}

}
