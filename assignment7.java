package app.demo;

/*Program 7-Create an ArrayList of Employee( id,name,address,sal) objects and search for particular Employee object based on id 

   number and name.
   
   */

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;

class Employees {

	private int id;

	private String name;

	private String address;

	private Double sal;

public Employees(int id, String name, String address, Double sal) {

		super();

		this.id = id;

		this.name = name;

		this.address = address;

		this.sal = sal;

	}		

	public int getId() {

		return id;

	}

	public String toString() {

		return "Employees [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + sal + "]";

	}

}

public class assignment7 {

     public static void main(String[] args) {

		List<Employees> list = new ArrayList();

		list.add(new Employees(1, "Tanima", "Kolkata", 20000.0));

		list.add(new Employees(2, "Ar", "Howrah", 30000.0));

		Iterator<Employees> it = list.iterator();

		int Id = 1;

		while (it.hasNext()) {

			Employees empl = it.next();

			if (empl.getId() == Id)

				System.out.println(empl);

		}

	}
}


