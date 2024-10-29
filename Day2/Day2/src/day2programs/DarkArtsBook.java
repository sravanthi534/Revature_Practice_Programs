package day2programs;

public class DarkArtsBook extends MagicalBook implements Readable{

	public DarkArtsBook(String title, String author, String subject, boolean isRestricted) {
		super(title, author,"Dark Arts", true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String summarizeContent() {
		// TODO Auto-generated method stub
		return "darkartsbook contains magic";
	}

	@Override
	public void bookmarkPage(int pageNumber) {
		System.out.println("book mark pagenumber"+pageNumber);
		
	}

	@Override
	public void useBook() {
		// TODO Auto-generated method stub
		System.out.println("using the darkarts book");
		
	}

}
