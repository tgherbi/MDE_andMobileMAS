

public class BookRepository
	implements Serializable {

	private Boolean bookFound;

	private SiteIdentifier site;

	private Boolean siteVisited;

	// add constructor and methods manually

}




public class SiteIdentifier
	implements Serializable {

	private String siteID;

}




public class Book
	implements Serializable {

	private String isbn;

	private String title;

	private Vector authors;

	// add constructor and methods manually

}

