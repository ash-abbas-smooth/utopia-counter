package com.smoothstack.avalanche.ars.counter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boarding_pass")
public class BoardingPass {

	/*
	 * FIELDS
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "gate_number")
	private String gate_number;
	
	@Column(name = "terminal_number")
	private String terminal_number;

	/*
	 * ENTITY RELATIONSHIP
	 */
	
	/*
	 * CONSTRUCTORS
	 */
	public BoardingPass(){}
	
	/**
	 * @param id
	 * @param gate_number
	 * @param terminal_number
	 */
	public BoardingPass(Long id, String gate_number, String terminal_number) {
		super();
		this.id = id;
		this.gate_number = gate_number;
		this.terminal_number = terminal_number;
	}


	/*
	 * GETTERS
	 */
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @return the gate_number
	 */
	public String getGate_number() {
		return gate_number;
	}
	/**
	 * @return the terminal_number
	 */
	public String getTerminal_number() {
		return terminal_number;
	}
	
	/*
	 * SETTERS
	 */
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param gate_number the gate_number to set
	 */
	public void setGate_number(String gate_number) {
		this.gate_number = gate_number;
	}
	/**
	 * @param terminal_number the terminal_number to set
	 */
	public void setTerminal_number(String terminal_number) {
		this.terminal_number = terminal_number;
	}
	
	
}
