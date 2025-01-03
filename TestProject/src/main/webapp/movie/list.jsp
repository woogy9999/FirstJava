<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.sist.movie.*"%>
    <%

    String strPage=request.getParameter("page");
    if(strPage==null)
    	strPage="1";
    int curpage=Integer.parseInt(strPage);
    MovieSystem ms = new MovieSystem();
    Movie[] movies=ms.movieListData(curpage);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul>
	<%
		for(Movie m:movies){
			out.println("<li>"+m.no+"."+m.title+"</li>");
		}
	%>
	</ul>
<center>
	<table border=1 bordercolor=black width=700>

		
	</table>
</center>
	
</body>
</html>