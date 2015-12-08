
#import DomainTypes.java;

// GoFailed is a class used inside the migration method by mobiles agents to test if the move has successed or has failed
class GoFailed implements HookInterface { 

	Boolean moved;

	// Constructor
	public GoFailed (Boolean moved) {
		this.moved = moved;
	}
	public void resume (GoException e) {
		moved = new Boolean(false);
		System.out.println("\nGo failed!!!!!!!!!!!!!!! "); // message displayed if the go command failed
	}
}

public class RoleEndingBehaviorImpl
	extends RoleEndingBehaviorInterfQuasiBehavior 

 {

	private Vector valuesToReturn;

	// Constructor
	public RoleEndingBehaviorImpl(Vector valuesToReturn) { 
		this.valuesToReturn = valuesToReturn;
	}

	public Vector confirmEndOfRole() {
		suicide();
		return valuesToReturn; 
	}
}




public class ResultsDeliverRoleBehaviorImpl
	extends ResultsDeliverRoleBehaviorInterfQuasiBehavior 
	implements StandAlone 
 {

	public String itsGroup = LibraryManagement;

	private Vector bookRepositories;

	private Boolean stop = false;

	public Vector interactsWith = {};

	private Vector valuesToReturn; /* allow the role to return the updated values of attributes belonging to the agent which play it */


	private TypeToSpecify owner; /* the owner is the agent playing this role. Its type will be specified manually. It allows the role to manipulate the attributes of its owner */ 
	
	// Constructor
	public ResultsDeliverRoleBehaviorImpl(TypeToSpecify owner) { // the type of owner is specified manually
		this.owner = owner; 
		this.stop = false; 
		valuesToReturn = new Vector(); 
	}


	public void stopRole() {
		stop = true; 
	}

	private void displayBookRepositories() {
	   // TODO should be implemented
	}
	public void run() {// the method run exist in any class which implement StandAlone

		// TODO should be completed from the associated stateMachine

		// terminates
		become(new RoleEndingBehaviorImpl(this.valuesToReturn)); 
	}
}




public class BookCheckerRoleBehaviorImpl
	extends BookCheckerRoleBehaviorInterfQuasiBehavior 
	implements StandAlone 
 {

	private Vector booksList;

	public Vector interactsWith = {BooksListDeliver};

	private Boolean stop = false;

	public String itsGroup = LibraryManagement;

	private Vector valuesToReturn; /* allow the role to return the updated values of attributes belonging to the agent which play it */

	private Actor playerOfBooksListDeliverRole; // the agent playing the role (BooksListDeliver) with which this role (BookCheckerRoleBehaviorImpl) interacts

	private TypeToSpecify owner; /* the owner is the agent playing this role. Its type will be specified manually. It allows the role to manipulate the attributes of its owner */ 
	
	// Constructor
	public BookCheckerRoleBehaviorImpl(TypeToSpecify owner) { // the type of owner is specified manually
		this.owner = owner; 
		this.stop = false; 
		valuesToReturn = new Vector(); 
	}


	public void stopRole() {
		stop = true; 
	}

	private void booksFilter() {
	   // TODO should be implemented
	}
	public void run() {// the method run exist in any class which implement StandAlone

		// TODO should be completed from the associated stateMachine

		// terminates
		become(new RoleEndingBehaviorImpl(this.valuesToReturn)); 
	}
}




public class BooksListDeliverRoleBehaviorImpl
	extends BooksListDeliverRoleBehaviorInterfQuasiBehavior 

 {

	public String itsGroup = LibraryManagement;

	private Boolean stop = false;

	private Vector booksList;

	public Vector interactsWith = {};

	private Vector valuesToReturn; /* allow the role to return the updated values of attributes belonging to the agent which play it */


	private TypeToSpecify owner; /* the owner is the agent playing this role. Its type will be specified manually. It allows the role to manipulate the attributes of its owner */ 
	
	// Constructor
	public BooksListDeliverRoleBehaviorImpl(TypeToSpecify owner) { // the type of owner is specified manually
		this.owner = owner; 
		this.stop = false; 
		valuesToReturn = new Vector(); 
	}


	public void stopRole() {
		stop = true; 
		// terminates
		become(new RoleEndingBehaviorImpl(this.valuesToReturn)); 
	}

	public Vector getBooksList() {
	   // TODO should be implemented
	}
}




public class MobileBookSeekerAgentBehaviorImpl
	extends MobileBookSeekerAgentBehaviorInterfQuasiBehavior 
	implements StandAlone 
 {

	public Vector mayPlay = {BookChecker,ResultsDeliver};

	private SiteIdentifier finalSite;

	private Book searchedBook;

	private Boolean migrantAgent = false;

	private Boolean roleObtained = false;

	private Vector bookRepositories;

	private Boolean groupJoined = false;

	private Vector itinerary;

	private SiteIdentifier nextSite;

	private Actor group; // to indicate the group to join

	private Actor bookCheckerRoleActor; // to point to the actor representing the played role (BookChecker)

	private Actor resultsDeliverRoleActor; // to point to the actor representing the played role (ResultsDeliver)

	// Constructor
	public MobileBookSeekerAgentBehaviorImpl() { 
		/*
		any global variable must receive its value here. Indeed, as this agent move, this manner avoids to lost values of its global variables
		*/
	}


	public void run() {// the method run exist in any class which implement StandAlone

		Vector returnedValues; // values returned by played roles

		// TODO should be completed from the associated stateMachine
	}
}




public class LibrarianAgentBehaviorImpl
	extends LibrarianAgentBehaviorInterfQuasiBehavior 
	implements StandAlone 
 {

	private Boolean roleObtained = false;

	public Vector mayPlay = {BooksListDeliver};

	private Boolean groupJoined = false;

	private Actor group; // to indicate the group to join

	private Actor booksListDeliverRoleActor; // to point to the actor representing the played role (BooksListDeliver)

	// Constructor
	public LibrarianAgentBehaviorImpl() { 
		/*
		any global variable must receive its value here. Indeed, as this agent move, this manner avoids to lost values of its global variables
		*/
	}


	public void run() {// the method run exist in any class which implement StandAlone

		Vector returnedValues; // values returned by played roles

		// TODO should be completed from the associated stateMachine
	}
}




public class LibraryManagementGroupBehaviorImpl
	extends LibraryManagementGroupBehaviorInterfQuasiBehavior 

 {

	public Vector roles = {BooksListDeliver,BookChecker,ResultsDeliver};

	private Vector agents; // to contain the list of agents that have joined the group

	// Constructeur
	public LibraryManagementGroupBehaviorImpl() {
		this.agents = new Vector(); 
	}

	public Boolean joinGroup(Actor a) {
		// add the agent to the group
		agents.addElement(a);

		// complete the content manually
	}

	public void leaveGroup(Actor a) {
		// delete the agent from the group
		agents.removeElementAt(agents.indexOf(a));

		// complete the content manually
	}

	public Boolean askForBooksListDeliverRole(Actor a) {
	   // TODO should be implemented
	}

	public Boolean askForBookCheckerRole(Actor a) {
	   // TODO should be implemented
	}

	public Boolean askForResultsDeliverRole(Actor a) {
	   // TODO should be implemented
	}
}

