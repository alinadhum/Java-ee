package tehtavat;

import java.sql.*;

import jdbc_conf.Tietokannan_yhteys;

public class JDBC_H3 {

	public static void main(String args[]) {
		Connection conn = null;
		try {

			conn = Tietokannan_yhteys.getConnection();
			PreparedStatement perpare_stmt = conn.prepareStatement("select * from henkilo where sukunimi LIKE ?");
			String sukunimet_taulu[] = { "Ank%", "%iri", "%kaulus%","Vek%" };
			
			perpare_stmt.setString(1, sukunimet_taulu[0]);
			ResultSet rs = perpare_stmt.executeQuery();
			System.out.println("**************************Sukunimi 'Ank%' mukaan**********************");
			while (rs.next()) {
				
				System.out.println(rs.getObject("id") + "\t" + rs.getObject("etunimi")
						+" "+ rs.getObject("sukunimi")+"\t"+ rs.getObject("sotu")
						+"\t"+ rs.getObject("palkka")+"\t"+ rs.getObject("syntymaaika"));
			}
			perpare_stmt.setString(1, sukunimet_taulu[1]);
			ResultSet rs1 = perpare_stmt.executeQuery();
			System.out.println("**************************Sukunimi '%iri' mukaan**********************");
			while (rs1.next()) {
				
				System.out.println(rs1.getObject("id") + "\t" + rs1.getObject("etunimi")
						+" "+ rs1.getObject("sukunimi")+"\t"+ rs1.getObject("sotu")
						+"\t"+ rs1.getObject("palkka")+"\t"+ rs1.getObject("syntymaaika"));
			}
			perpare_stmt.setString(1, sukunimet_taulu[2]);
			ResultSet rs2 = perpare_stmt.executeQuery();
			System.out.println("**************************Sukunimi '%kaulus%' mukaan******************");
			while (rs2.next()) {
				
				System.out.println(rs2.getObject("id") + "\t" + rs2.getObject("etunimi")
						+" "+ rs2.getObject("sukunimi")+"\t"+ rs2.getObject("sotu")
						+"\t"+ rs2.getObject("palkka")+"\t"+ rs2.getObject("syntymaaika"));
			}
			perpare_stmt.setString(1, sukunimet_taulu[3]);
			ResultSet rs3 = perpare_stmt.executeQuery();
			System.out.println("**************************Sukunimi 'Vek%' mukaan**********************");
			while (rs3.next()) {
				
				System.out.println(rs3.getObject("id") + "\t" + rs3.getObject("etunimi")
						+" "+ rs3.getObject("sukunimi")+"\t"+ rs3.getObject("sotu")
						+"\t"+ rs3.getObject("palkka")+"\t"+ rs3.getObject("syntymaaika"));
			}
			System.out.println("***************************************************************");
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
