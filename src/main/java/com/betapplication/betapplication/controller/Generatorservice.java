package  com.betapplication.betapplication.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Generatorservice {

	@Value("${random.int(1,100)}")
	private String randomIntegerwithRange;
	
	
	//Generate 15 numbers
	
	public List<Integer> getRandomIntegerwithRange() {
		List<Integer> choosen = new ArrayList<>();
		Random rand = new Random();
		int randomIndex, newValue;
		int[] values = new int[15];
		for(int i=0; i<15; i++) {
			values[i] = (int) Math.round(Math.random() * 100);
//			System.out.println(values[i]);
		}
		while(choosen.size() < 5) {
			randomIndex = rand.nextInt(15);
			newValue = values[randomIndex];
			if (!choosen.contains(newValue)) {
				choosen.add(newValue);
			}			
		}
		return choosen;
	}
//	public void setRandomIntegerwithRange(String randomIntegerwithRange) {
//		this.randomIntegerwithRange = randomIntegerwithRange;
//	}
	public Betinfos computeBet(Betinfos betInfo) {
		List<Integer> choosen = getRandomIntegerwithRange();
		List<Integer> guesses = betInfo.getGuesses();
		int count = 0;
		int balance;
		for(int i = 0; i < 5; i++) {
			System.out.println("choosen: " + choosen.get(i) + " guess: " + guesses.get(i));
			if(choosen.get(i) == guesses.get(i)) {
				System.out.println("Counts...");
				count++;
			}
		}
		int win = (fact(count) - 1) * betInfo.getStake();
		balance = betInfo.getBalance() + win;
		Betinfos results = new Betinfos(balance, choosen);
		return results;
	}
	
	public int fact(int num) {
		int result = 1;
		for(int i = num; i > 0; i--) {
			result *= i;
		}
		return result;
	}
}