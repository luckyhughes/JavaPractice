package oopsExamples.banking;

import java.util.ArrayList;

public class Friend {
	
	Profile profile = new Profile();
	ArrayList<Profile> friendList = new ArrayList();
	int noOfFriends;
	ArrayList<Profile> closeFriends = new ArrayList();

	
	
	public void add(Profile friend){
		
		friendList.add(friend);
			
	}
	
	public void remove(Profile friend){
		
		friendList.remove(friend);
		
	}
	
	public ArrayList<Profile> getFreindsList(){
		
		return friendList;
		
	}

}
