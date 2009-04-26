<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%-- 
    Document   : videolisting
    Created on : 14-Mar-2009, 20:24:30
    Author     : James
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">



<html>
  <head>
      <title><fmt:message key="Video Listing"/></title>
  </head>

  <body>
    <h1><fmt:message key="heading"/></h1>



    <h3>List of Videos</h3>
    <c:forEach items="${model.videos}" var="videos">
      <c:out value="${videos.title}"/> <c:out value="${videos.genre}"/>
      <br><br>
    </c:forEach>


    <h3>Testing out tables...</h3>

    <table>
        <tr>
            <th><a href="videolisting.htm?orderBy=title" >Title</a></th>
            <th>Genre</th>
        </tr>
        <tr>
            <td>
                <c:forEach items="${model.videos}" var="videos">
                    <c:out value="${videos.title}"/>
                <br><br>
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${model.videos}" var="videos">
                  <c:out value="${videos.genre}"/>
                  <br><br>
                </c:forEach>
            </td>

        </tr>

    </table>


        
  </body>
</html>
