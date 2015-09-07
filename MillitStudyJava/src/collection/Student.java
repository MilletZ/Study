package collection;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private String id;
	private String name;
	private Set courses;
	
	public Student(String id,String name){
		this.id = id;
		this.name = name;
		this.courses = new HashSet();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getCourses() {
		return courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}
	
	
}
