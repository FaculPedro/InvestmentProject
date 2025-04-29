package br.com.unicuritiba.investment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.investment.models.Investment;
import br.com.unicuritiba.investment.repositories.InvestmentRepository;

@RestController
public class InvestmentController {

	@Autowired
	InvestmentRepository repository;
	
	@GetMapping("/investments")
	public ResponseEntity<List<Investment>> getInvestments(){
		return ResponseEntity.ok(repository.findAll());	
	}

	@GetMapping("/investments/{id}")
	public ResponseEntity<Investment> getInvestment(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id).get());	
	}
	
	@PostMapping("/investments")
	public ResponseEntity<Investment> saveInvestment(
			@RequestBody Investment investment){
		Investment savedInvestment = repository.save(investment);
		return ResponseEntity.ok(savedInvestment);
	}
	
	@DeleteMapping("/investments/{id}")
	public void removeInvestment(@PathVariable long id) {
		 repository.deleteById(id);
	}
	
	@PutMapping("/investments/{id}")
	public ResponseEntity<Investment> updateInvestment(@PathVariable long id,
			@RequestBody Investment investiment) {
		investiment.setId(id);
		Investment savedInvestment = repository.save(investiment);
		return ResponseEntity.ok(savedInvestment);
	}
}
