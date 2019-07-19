package com.pradeep.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside of the setter - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside of the setter - setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Cricket Coach: inside of the constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside of the setter - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 12 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
