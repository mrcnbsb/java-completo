package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//tratamento para data no sql: long
		DateTimeFormatter mask = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("18/12/1979", mask);
		ZoneId zoneId = ZoneId.systemDefault();
		long longNumber = date.atStartOfDay(zoneId).toEpochSecond();
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, "Marcone");
			st.setString(2, "mrcn@gmail.com");
			st.setDate(3, new java.sql.Date(longNumber));
			st.setDouble(4, 13000.0);
			st.setInt(5, 3);
			
			
			//st = conn.prepareStatement("insert into department (Name) values ('D1'), ('D2')",
				//	Statement.RETURN_GENERATED_KEYS);
			
			int rowsAffected = st.executeUpdate();
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			}else {
				System.out.println("No rows affected!");
			}
			
//			System.out.println("Done! Rows affected: " + rowsAffected);
					
		} catch(SQLException e) {
			e.getStackTrace();
		} finally{
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		
	}
}
