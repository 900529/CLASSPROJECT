package hio.controller;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import hio.domain.HioMember;
	import service.HioHallDeleteService;
	import service.HioInsertService;

	public class HioHallDeleteController implements HioHallDeleteInterface {
		
		Scanner sc = new Scanner(System.in);

		@Override
		public void hallDelete() {

			List<HioReservation> allList = new HioHallDeleteService().reservationSelectToDelete();
			
			System.out.println("== 타석 취소를 진행합니다. ==");
			System.out.println("===== 현재 타석 넘버 =====");
			
			if (allList != null && !allList.isEmpty()) {
				
				for (int i=0; i<allList.size(); i++) {
					System.out.print(allList.get(i).getReserveNo() + " | " +allList.get(i).getHallNo());
				}
		
			}
			
			System.out.println("----------------------------");
			
			System.out.println("취소할 타석을 입력해주세요. >> ");
			String delHall = sc.nextLine().trim();

			int result = new HioHallDeleteService().hallDelete(delHall);
			
			if (result > 0) {
				System.out.println("타석 취소 완료!");
			} else {
				System.out.println("타석 취소 실패!");
			}

		}

	}
	
	
}
