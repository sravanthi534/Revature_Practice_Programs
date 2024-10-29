package day2programs;

public abstract class MagicalBook {

private String title;
private String author;
private String subject;

private boolean isRestricted;
public MagicalBook(String title, String author, String subject, boolean isRestricted) {
	super();
	this.title = title;
	this.author = author;
	this.subject = subject;
	this.isRestricted = isRestricted;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public boolean isRestricted() {
	return isRestricted;
}
public void setRestricted(boolean isRestricted) {
	this.isRestricted = isRestricted;
}

public void openBook()
{
	System.out.println("opn the book "+title);
	
}
public void closeBook()
{
	System.out.println("close the book "+title);
}
public abstract void useBook();

}
