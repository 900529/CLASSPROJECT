import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {

		// 1. 드라이버 로드 (생략가능)
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver"); 생략가능하나 클래스 이름 기억하기! 

			// 2. Connection 객체 생성
		    String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			//String dbUrl = "jdbc:mysql://localhost:3306/project";
			Connection conn = DriverManager.getConnection(dbUrl, "system", "yena");

			if (conn != null) {
				System.out.println("데이터베이스 연결");
				conn.close();
			}

			// 3. Statement 또는 PreparedStatement
			// 4. ResultSet

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
