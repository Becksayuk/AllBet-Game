package com.betapplication.betapplication.controller;

import java.util.ArrayList;
import java.util.List;

public class Betinfos {
 private Integer stake;
 private Integer balance;
 private List<Integer> guesses = new ArrayList<>();
 
public Integer getStake() {
	return stake;
}
public void setStake(Integer stake) {
	this.stake = stake;
}
public Integer getBalance() {
	return balance;
}
public void setBalance(Integer balance) {
	this.balance = balance;
}


public List<Integer> getGuesses() {
	return guesses;
}
@Override
public String toString() {
	return String.format("Betinfos [stake=%s, balance=%s, num1=%s, num2=%s, num3=%s, num4=%s, num5=%s]", stake, balance);
}
public Betinfos() {
	super();
	// TODO Auto-generated constructor stub
}

public Betinfos(int balance, List<Integer> guesses) {
	this.balance = balance;
	this.guesses = guesses;
}
 
}
