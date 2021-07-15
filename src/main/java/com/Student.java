package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity  //import from javax.persistence. Db maa table create garna ko lagi Entity import garnai parxa. ki name change garnu parxa navaye correspondence to Student class table ni Student nai banxa.
public class Student {

	int roll;
	String name;
	int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student( String name, int age) {  // Id is pk automatically value print hunxa so  id yeha pass garnu pardaina
		
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
  
	//we assume roll as Primary Key so pass this annotataion before getPk. Primary key is always unique which can fetch data.
	@Id //import from javax.persistence
	@GeneratedValue  //import from javax.persistence. AUTOMATICALLY value generate hunxa. Id ko lagi value pass garnu pardaina.
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
