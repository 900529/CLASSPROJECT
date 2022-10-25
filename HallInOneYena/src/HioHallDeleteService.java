package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import hio.DAO.HioHallDeleteDAO;
import hio.domain.HioMember;
import util.HioConnection;

public class HioHallDeleteService {
	
	HioHallDeleteDAO dao = new HioHallDeleteDAO();
	
	public int hallDelete(Int delHall) {
		
		int result = 0;
		Connection conn = null;
		
		try {
			
			conn = HioConnection.getConnection();
			result = dao.hallDelete(conn, delHall);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
		
	}
	
	public List<HioReservation> hallSelectToDelete(){
		
		List<HioReservaion> allList = null;
		Connection conn = null;
		
		try {
			
			conn = HioConnection.getConnection();
			allList = dao.selectToDelete(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}	
		
		return allList;
	}
	
}
