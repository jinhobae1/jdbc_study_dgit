package kr.or.dgit.jdbc_study_dgit;

import java.util.Properties;

import kr.or.dgit.erp_application.jdbc.DBCon;
import kr.or.dgit.erp_application.jdbc.LoadProperties;

public class TestMain {

	public static void main(String[] args) {
		testDBConnection();

	}

	private static void testDBConnection() {
		DBCon dbCon = DBCon.getInstance();
		System.out.println(dbCon);

		LoadProperties lp = new LoadProperties();
		Properties pro = lp.getProperties();
		
		System.out.printf("user %s : password %s%n", 
				pro.getProperty("user"),
				pro.getProperty("password"));
	}

}