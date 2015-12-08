
#import DomainTypes.java;

interface RoleEndingBehaviorInterf
	extends BehaviorProfile {


	public Vector confirmEndOfRole();
}








interface ResultsDeliverRole
	extends ResultsDeliverRoleBehaviorInterf, RoleEndingBehaviorInterf, ActorProfile {


}




interface ResultsDeliverRoleBehaviorInterf
	extends BehaviorProfile {


	public void stopRole();

	void become(RoleEndingBehaviorInterf b);
}




interface BookCheckerRole
	extends BookCheckerRoleBehaviorInterf, RoleEndingBehaviorInterf, ActorProfile {


}




interface BookCheckerRoleBehaviorInterf
	extends BehaviorProfile {


	public void stopRole();

	void become(RoleEndingBehaviorInterf b);
}




interface BooksListDeliverRole
	extends BooksListDeliverRoleBehaviorInterf, RoleEndingBehaviorInterf, ActorProfile {


}




interface BooksListDeliverRoleBehaviorInterf
	extends BehaviorProfile {


	public void stopRole();

	void become(RoleEndingBehaviorInterf b);

	public Vector getBooksList();
}




interface MobileBookSeekerAgent
	extends MobileBookSeekerAgentBehaviorInterf, ActorProfile {


}




interface MobileBookSeekerAgentBehaviorInterf
	extends BehaviorProfile {


	void become(MobileBookSeekerAgentBehaviorInterf b);
}




interface LibrarianAgent
	extends LibrarianAgentBehaviorInterf, ActorProfile {


}




interface LibrarianAgentBehaviorInterf
	extends BehaviorProfile {


}




interface LibraryManagementGroup
	extends LibraryManagementGroupBehaviorInterf, ActorProfile {


}




interface LibraryManagementGroupBehaviorInterf
	extends BehaviorProfile {


	public Boolean joinGroup(Actor a);

	public void leaveGroup(Actor a);

	public Boolean askForBooksListDeliverRole(Actor a);

	public Boolean askForBookCheckerRole(Actor a);

	public Boolean askForResultsDeliverRole(Actor a);
}

