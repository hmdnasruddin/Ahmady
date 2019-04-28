package com.class23;

public class ScrumTeam extends Employee{
	
	public String artifacts;
	public String ceremonies;
	public String meetings;

    public void workOnArtifacts() {
    	System.out.println("Scrum Team works on artifacts"+artifacts);
    }
    public void workOnCeremonies() {
    	System.out.println("Scrum Team work on ceremonies"+ceremonies);
    }
    public void attendMeetings() {
    	System.out.println("Scrum Team attends Meeting"+meetings);
    }
}