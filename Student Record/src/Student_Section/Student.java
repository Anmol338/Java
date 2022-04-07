package Student_Section;

public class Student {
	int id;
	String name;
	double pop;
	double database;
	double networking;
	double total;
	double average;
	String result;

	// Default constructor
	public Student() {
		this.id = 0;
		this.name = "";
		this.pop = 0.0;
		this.database = 0.0;
		this.networking = 0.0;
	}

	// Parameterized constructor
	public Student(int id, String name, double pop, double database, double networking) {
		this.id = id;
		this.name = name;
		this.pop = pop;
		this.database = database;
		this.networking = networking;
	}

	// Setter
	public void setId() {
		this.id = id;
	}

	public void setName() {
		this.name = name;
	}

	public void setPop() {
		this.pop = pop;
	}

	public void setDatabase() {
		this.database = database;
	}

	public void setNetworking() {
		this.networking = networking;
	}

	// Getter
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getPop() {
		return this.pop;
	}

	public double getDatabase() {
		return this.database;
	}

	public double getNetworking() {
		return this.networking;
	}

	public double getTotal() {
		return this.total = this.pop + this.database + this.networking;
	}

	public double getAverage() {
		return this.average = this.total / 3;
	}

	public String getResult() {
		new Global();
		if ((this.pop == Global.pm) && (this.database == Global.pm) && (this.networking == Global.pm)) {
			return this.result = "PASS";
		} else {
			return this.result = "FAIL";
		}
	}

}