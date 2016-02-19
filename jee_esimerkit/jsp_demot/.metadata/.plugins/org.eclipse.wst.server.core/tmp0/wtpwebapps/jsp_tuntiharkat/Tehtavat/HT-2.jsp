<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tuntiharjoitus 2</title>
</head>
<body>
	<h2>Tuntiharjoitus 2</h2>
	<fieldset> TuntiHarjoitus: Tee ohjelma, jolla käyt läpi alla määritellyt
  ArrayList-ja HashMap-oliot käyttäen JSP2:sta</fieldset><br>
	   <% 
            java.util.ArrayList<String> Varit = new java.util.ArrayList<String>();
            Varit.add("Punainen");
            Varit.add("Vihreä");
            Varit.add("Sininen");
            Varit.add("Pinkki");
            
       %>
       <h4>Värien tulostaminen</h4>
       <% // Java Muuttujiin pääsee käsiksi näiden attribuuttien lissämisten jälkeen!
       request.setAttribute("attr_varit", Varit);
       %>
       
        <c:forEach var="vari" items="${attr_varit}">
           ${vari}<br/>           
       </c:forEach>
</body>
</html>