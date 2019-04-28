package com.class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp=new Employee();
		emp.salary=90000;
		emp.getPaid();

		System.out.println("---Creating SrumTeam object---");
		ScrumTeam st=new ScrumTeam();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog,Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendMeetings();
		st.workOnArtifacts();
	
		
		System.out.println("---Creating Developer object---");
		Developer dev =new Developer();
		dev.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprit backlog";
		dev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendMeetings();
		dev.code();
		
		System.out.println("---Creating Tester object---");
		Tester qa =new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprit backlog";
		qa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendMeetings();
		qa.test();
	
		System.out.println("---Creating Bussiness Analyst object---");
		BusinessAnalyst ba =new BusinessAnalyst();
		ba.salary=85000;
		ba.getPaid();
		ba.artifacts="Sprit backlog, Product Backlog";
		ba.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendMeetings();
		ba.writeUserStories();
		
		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm =new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.attendScrumMeetings();
		
		System.out.println("---Creating Product Owner object---");
		ProductOwner po =new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprit backlog, Product Backlog";
		po.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendMeetings();
		po.prioritizeBacklog();
		po.talkToTheClien();
	}
}