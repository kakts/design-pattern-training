package Memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	int money;
	ArrayList fruits;
	public int getMoney() {
		return money;
	}
	
	// 同一パッケージ内からインスタンス作成可能
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList();
	}
	
	void addFruit(String fruit) {
		fruits.add(fruit);
	}
	
	List getFruits() {
		return (List)fruits.clone();
	}
}
