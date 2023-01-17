import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Test {

	public ArrayList<SampleVO> testDBConnection() {
		ArrayList<SampleVO> all = new ArrayList<>();
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			System.out.println("Successfully Connected");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from city");

			while (rs.next()) {
//				System.out.println(rs.getString(1) +" -- " + rs.getString(2));
				SampleVO svo = new SampleVO();
				svo.setId(rs.getInt(1));
				svo.setName(rs.getString(2));
				svo.setCountrycode(rs.getString(3));
				svo.setDistrict(rs.getString(4));
				svo.setPopulation(rs.getInt(5));
				
				all.add(svo);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return all;
	}

}
