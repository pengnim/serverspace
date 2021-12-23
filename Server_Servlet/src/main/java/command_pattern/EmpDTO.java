package command_pattern;

public class EmpDTO {
	private int id;
	private String name;
	private int sal;
	private int dno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	
	public String toString() {
		return this.id + " " + this.name + " " + this.sal + " " + this.dno;
	}
	
}
