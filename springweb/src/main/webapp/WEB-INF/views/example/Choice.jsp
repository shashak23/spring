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
	<h1>싱싱 가게에 오신 걸 환영합니다!</h1>
		<h3>원하시는 과일을 선택하세요</h3>
			<h4>원하시는 과일 이미지를 클릭하면 장바구니에서 확인이 가능합니다</h4>
			<div>
			<a href="/springweb/basketController/basketCount?basketNum=1"><img src="resources/imgs/apple.gif"></a>
			</div>
			<div>
			<a href="/springweb/basketController/basketCount?basketNum=2"><img src="resources/imgs/banana.jpg"></a>
			</div>
			<div>
			<a href="/springweb/basketController/basketCount?basketNum=3"><img src="resources/imgs/r4.gif"></a>
			</div><br><br>
		<a href="/springweb/basketController/basketEmpty?BasketNum=3"><button type="button">장바구니 초기화</button></a>
		
		
</body>
</html>