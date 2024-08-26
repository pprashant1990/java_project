package iprep_core_java;

class Employee {

	private String eid;
	private String ename;
	private String esal;
	private String eaddr;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsal() {
		return esal;
	}

	public void setEsal(String esal) {
		this.esal = esal;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

}

public class GetterSetter {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEid("E-001");
		System.out.println(e.getEid());

	}

}
