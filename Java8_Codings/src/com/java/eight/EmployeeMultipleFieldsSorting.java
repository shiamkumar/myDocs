package com.java.eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMultipleFieldsSorting {
	public static void main(String[] args) {

		Player p1 = new Player("virat", 4);
		Player p2 = new Player("dhoni", 4);
		Player p3 = new Player("sachin", 5);
		Player p4 = new Player("sewagh", 2);
		Player p5 = new Player("rohit", 3);
		Player p6 = new Player("kuldeep", 1);
		List<Player> unsortredList = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Comparator<Player> nameComp = Comparator.comparing(Player::getName);
		Comparator<Player> rankComp = Comparator.comparing(Player::getRank);
		Comparator<Player> multipleFieldsComp = rankComp.thenComparing(nameComp);
		List<Player> sortedList = unsortredList.stream().sorted(multipleFieldsComp).collect(Collectors.toList());
		System.out.println(sortedList);
	}
}

class Player {
	private String name;
	private int rank;

	public Player(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", rank=" + rank + "]";
	}

}