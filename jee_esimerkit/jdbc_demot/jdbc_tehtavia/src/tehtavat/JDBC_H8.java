package tehtavat;

import java.sql.SQLException;
import avustavat_luokat.OhjelmointikieliDAO;
public class JDBC_H8 {
	
	final static String lauseet[] = {
		"DROP TABLE if exists ohjkieli",
		"create table ohjkieli(id int auto_increment primary key, nimi varchar(50), viimversio varchar(50), suunnittelija varchar(255), julkaistu date )",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Java',  '8.0', ' James Gosling', '1995-01-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('ECMAScript',  '6', 'Brendan Eich', '1995-05-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Scala',  '2.11', 'Martin Odersky', '2004-01-20')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Python',  '3.5', 'Guido van Rossum', '1991-02-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('C++',  'C++14', 'Bjarne Stroustrup', '1980-03-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('PL/1',  '4.4', 'IBM', '1964-04-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('C',  'C11', 'Dennis Ritchie', '1972-01-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu)values('C#',  '6.0', 'Anders Hejlsberg', '2000-07-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Object Pascal',  'Free Pascal v. 3.0', 'Anders Hejlsberg', '1970-04-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Swift',  '2.1', 'Chris Lattner', '2014-06-02')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Dart',  '1.12', 'Lars Bak', '2013-11-14')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Clojure',  '1.7', 'Rich Hickey', '2013-06-30')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('COBOL',  'ISO/IEC 1989:2014 / 2014', 'CODASYL', '1959-01-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Perl',  '5.22', 'Larry Wall', '1987-06-10')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Ruby',  '2.2', 'Yukihiro Matsumoto', '1995-12-21')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('PHP',  '5.6', 'Rasmus Lerdorf', '1995-06-08')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Groovy',  '2.4', 'Guillaume Laforge', '2007-01-02')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('SmallTalk',  '-80 v.2', 'Alan Kay', '1972-01-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Simula',  'Simula 87', 'Ole-Johan Dahl', '1967-01-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('BASIC',  'Altair BASIC', 'Bill Gates', '1975-01-01')",
		"insert into ohjkieli(nimi, viimversio, suunnittelija, julkaistu) values('Go',  '1.5', 'Ken Thompson','2009-11-01')" 
		};
	public static void main(String args[]) {
		OhjelmointikieliDAO dao = new OhjelmointikieliDAO();
		try {
			dao.getOhjelmointikieli(5);
			System.out.println("************************************************");
			dao.getOhjelmointikielet();
			System.out.println("************************************************");
			dao.setJatkokysely("Where nimi = 'Java'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
