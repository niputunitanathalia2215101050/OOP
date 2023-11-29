package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(
				"Budi", 
				"2 Januari 2003", 
				true, 
				"Gianyar", 
				"2215101050", 
				3);
		
		Lecture lecture1 = new Lecture("Yudhi", "3 Januari 1977", true, "Buleleng", "2215101066", "FTK", "TI", "CS");
		
		
		student1.printAll();
		System.out.println();
		lecture1.printAll();
		
		
	}
}
