package dept;

import dept.Service.SelectByService;
import dept.domain.Dept;

public class SelectByController {

	SelectByService service = new SelectByService();

	public void process() {

		System.out.println("검색 부서번호 >>> ");
		int deptno = Integer.parseInt(Main.sc.nextLine());

		Dept dept = service.selectByDeptno(deptno);

		System.out.println("검색 결과 ===============");
		if (dept != null) {
			System.out.println(dept);
		} else {
			System.out.println("검색한 부서의 정보가 없습니다.");
		}

	}

}