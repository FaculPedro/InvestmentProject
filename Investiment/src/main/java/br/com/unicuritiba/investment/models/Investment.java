package br.com.unicuritiba.investment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Investment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String appliedPeriod;
	private String profitability;
	private float initialInvestiment;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAppliedPeriod() {
		return appliedPeriod;
	}
	public void setAppliedPeriod(String appliedPeriod) {
		this.appliedPeriod = appliedPeriod;
	}
	public String getProfitability() {
		return profitability;
	}
	public void setProfitability(String profitability) {
		this.profitability = profitability;
	}
	public float getInitialInvestiment() {
		return initialInvestiment;
	}
	public void setInitialInvestiment(float initialInvestiment) {
		this.initialInvestiment = initialInvestiment;
	}
}
