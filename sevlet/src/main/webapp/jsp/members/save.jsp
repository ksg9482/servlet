<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%
    //request, response는 그냥 지원 됨
    System.out.println("MemberSaveServlet.service");

    MemberRepository memberRepository = MemberRepository.getInstance();

    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <Li>id=<%=member.getId()%></li>
    <Li>username=<%=member.getUsername()%></li>
    <Li>age=<%=member.getAge()%></li>
</ul>
</body>
