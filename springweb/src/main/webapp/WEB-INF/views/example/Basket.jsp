<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* 교수님께서 주신 csss 넣기  */
div {
    display: inline-block;
    width: 120px;
    height: 120px;
}
  
img {
    width: 100px;
    height: 100px;
}
  
.shadow img {
    transition: .5s ease;
}
  
.shadow img:hover {
    box-shadow: 1px 1px #d9d9d9, 2px 2px #d9d9d9, 3px 3px #d9d9d9, 4px 4px
        #d9d9d9, 5px 5px #d9d9d9, 6px 6px #d9d9d9;
    transform: translateX(-3px);
    transition: .5s ease;
}
</style>

</head>
<body>
	<h1>싱싱 과일 바구니 사이트입니다!</h1>
	<h2>과일을 선택해 주세요!</h2>
			
			사과 : <input value="${ fruit.apple }"> 개<br><br>
			바나나 : <input value="${ fruit.banana }"> 개<br><br>
			오렌지 : <input value="${ fruit.orange }"> 개<br><br>
		
		<a href="${header.referer }">뒤로가기</a>	
		
</body>
</html>