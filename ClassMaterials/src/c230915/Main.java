package c230915;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement; //����޴� ��
//
public class Main {
//	public static void main(String[] args) {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//		
//			Connection con = DriverManager.getConnection(
//					"jdbc:oracle:thin:@localhost:1521/orcl",
//					"java",
//					"2632"
//					);
//			
////			String query1 = "update student set student_id = 'kds' where id = ";
////			Statement stmt1 = con.createStatement(); 
////			ResultSet rs1 = stmt1.executeQuery(query1);
//			
////			String insertQuery = "insert into student "
////					+ "(name, student_id, student_pw, age, git_address) "
////					+ " values (?, ?, ?, ?, ?)";
////			PreparedStatement pstmt = con.prepareStatement(insertQuery);
////			pstmt.setString(1, "�ۼ���1");
////			pstmt.setString(2, "ssm1");
////			pstmt.setString(3, "26311");
////			pstmt.setInt(4, 23);
////			pstmt.setString(5, "�ۼ���1");
////			pstmt.executeUpdate();
//			
//			
//			String query = "select * from student";
//			Statement stmt = con.createStatement(); //��û
//			ResultSet rs = stmt.executeQuery(query); //execute -> �����Ѵ�. ����
//			while(rs.next()) {
//				System.out.println(rs.getString("name") + " : " + rs.getInt("age"));
//			}
////			rs.next();
////			System.out.println(rs.getString("name"));
//			con.close();
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		} 
//	}
}
