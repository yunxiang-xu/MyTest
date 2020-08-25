package com.test.Pattern.Observer;

public interface Subject {

	void addObServer(Observer observer);
	
	void deleteObServer(Observer observer);
	
	void notify(String message);
}
