package dept.domain;

// DTO : Java Beans 형식으로 정의
// 모든 변수는 private, 기본 생성자가 반드시 존재, getter/setter

public class Dept {
	
	private int deptno;
	private String dname;
	private String loc;
	
	
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}


	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}


	

}
