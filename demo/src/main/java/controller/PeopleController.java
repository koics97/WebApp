package controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import repository.People;
import service.PeopleService;

@RestController
public class PeopleController {
	
	private final PeopleService peopleService;
	
	public PeopleController(PeopleService peopleService){
		this.peopleService = peopleService;
	}
	
	@PostMapping(path = "/people", consumes = "application/json")
	void savePeople(@Valid @RequestBody PeopleDto peopleDto){
		People people = new People();
		
		people.setId(peopleDto.getId());
		people.setAge(peopleDto.getAge());
		people.setName(peopleDto.getName());
		System.out.println("Csá gcc");
	}
	 
}
