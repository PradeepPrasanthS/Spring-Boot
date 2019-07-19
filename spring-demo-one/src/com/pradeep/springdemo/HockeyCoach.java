package com.pradeep.springdemo;

public class HockeyCoach implements Coach {

	// define the private field for the dependency
	private FortuneService fortuneService;
		
	// define a constructor for dependency injection
	public HockeyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do tapping for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
