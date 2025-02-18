package com.sanjan.Badmintonistapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1.com")
public class BadmintonistControler 
{
	
	@Autowired
	BadmintonistService bs;
	
	@Autowired
	MaritialStatus maritialStatus;
	
	@GetMapping("/players")
	List<Badmintonist> getAllPlayers()
	{
		return bs.getAllPlayers();
	}
	
	
	@GetMapping("/players/{id}")	
	Badmintonist getPlayerWithId(@PathVariable int id)
	{
		return bs.getPlayersDetailsWithId(id);
	}
	
	@GetMapping("/players/status/{id}")
	public String getPlayerMaritialStatus(@PathVariable int id)
	{
		return bs.getPlayerIsSingleOrMarried(id);
	}
	
	@GetMapping("/players/country/{country}")
	List<Badmintonist> getPlayersWithCountry(@PathVariable String country)
	{
		return bs.getPlayersWithCountry(country);
	}
	
	@PostMapping("/players")
	void addPlayer(@RequestBody Badmintonist badmintonist)
	{
		bs.addNewPlayer(badmintonist);
	}
	
	@PutMapping("/players/update/{id}")
	void updatePlayerDetailsWithId(@PathVariable int id, @RequestBody Badmintonist badmintonist)
	{
		bs.updatePlayerDetailsWithId(id, badmintonist);
	}
	
	@DeleteMapping("/players/delete/{id}")
	void deletePlayerWithId(@PathVariable int id)
	{
		bs.deletePlayerWithId(id);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
////	Get all players
//	@GetMapping("/bads")
//	List<Badmintonist> getAll()
//	{
//		return bs.getAllPlayers();
//	}
//	
////	get player by id
//	@GetMapping("/bads/{id}")
//	Badmintonist getPLayerById(@PathVariable int id)
//	{
//		return bs.getplayerById(id);
//	}
//	
////	Add new player
//	@PostMapping("/bads")
//	public void addBads(@RequestBody Badmintonist b)
//	{
//		bs.addNewPlayer(b);
//	}
//	
////	Update an already existing player
//	@PutMapping("/bads/{id}")
//	public void updateAPlayer(@PathVariable int id, @RequestBody Badmintonist b)
//	{
//		bs.updatePlayer(id, b);
//	}
//}
