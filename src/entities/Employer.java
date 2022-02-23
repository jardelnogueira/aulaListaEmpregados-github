package entities;

public class Employer {

	private static final double EMPLOYER_TAX = 0.2;
	private Integer id;
	private String name;
	private Double profit = 0.00;
	
	public Employer(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getProfit() {
		return profit;
	}
	
	public double calcProfit(double empSalary) {
		return profit += empSalary * EMPLOYER_TAX;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", profit);
	}
	
	
}
