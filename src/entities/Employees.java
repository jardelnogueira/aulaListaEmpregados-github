package entities;

public class Employees {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employees(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employees(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employees() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void InscreaseSalary(double percent) {
		salary *= (1 + percent/100);
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
