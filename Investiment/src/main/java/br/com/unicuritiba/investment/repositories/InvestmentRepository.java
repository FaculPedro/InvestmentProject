package br.com.unicuritiba.investment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.investment.models.Investment;

public interface InvestmentRepository 
			extends JpaRepository<Investment, Long>{

}
