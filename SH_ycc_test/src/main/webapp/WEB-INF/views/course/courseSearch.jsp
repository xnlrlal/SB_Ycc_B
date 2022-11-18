<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<!-- head & meta tag include -->
	<%@include file="/WEB-INF/views/metahead.jsp"%>
  
  <style type="text/css">
  	.searchBox { background-color: #f1f1f1; }
  	.tdeco-none { text-decoration: none; color: black; }
  	.
  </style>
	
	<title>YOUNG문화체육센터</title>
</head>
<body>
	<!-- header inlcude -->
	<%@include file="/WEB-INF/views/header.jsp"%>

	<!-- 본문 -->
	<div class="container mt-5">
		<h2>수강신청</h2>
		<hr>
		<form action="" method="get">
			<div class="searchBox p-3">
				<div class="row gap-1 mb-2">
					<div class="col-md-3">
						<div class="row">
							<label for="sidebar-position2" class="col-4 align-self-center text-center">분류</label>
							<div class="col-8">
								<select class="form-select" aria-label=".form-select-sm example" name="cate">
									<option value="All" ${pr.sc.cate=='All' || pr.sc.cate=='' ? "selected" : ""}>전체</option>
									<option value="Spo" ${pr.sc.cate=='Spo' ? "selected" : ""}>운동</option>
									<option value="Cul" ${pr.sc.cate=='Cul' ? "selected" : ""}>문화</option>
									<option value="Edu" ${pr.sc.cate=='Edu' ? "selected" : ""}>교육</option>
								</select>
							</div>
						</div>
					</div>
					<div class="col-md-3">
						<div class="row">
							<label for="sidebar-position2" class="col-4 align-self-center text-center">수강대상</label>
							<div class="col-8">
								<select class="form-select"	aria-label=".form-select example" name="target">
									<option value="All" ${pr.sc.target=='All' || pr.sc.target=='' ? "selected" : ""}>전체</option>
									<option value="Adu" ${pr.sc.target=='Adu' ? "selected" : ""}>성인</option>
									<option value="Stu" ${pr.sc.target=='Stu' ? "selected" : ""}>청소년</option>
									<option value="Chd" ${pr.sc.target=='Chd' ? "selected" : ""}>유아</option>
									<option value="Old" ${pr.sc.target=='Old' ? "selected" : ""}>노인</option>
								</select>
							</div>
						</div>
					</div>
					<div class="col-md-3">
						<div class="row">
							<label for="sidebar-position3" class="col-4 align-self-center text-center">접수상태</label>
							<div class="col-8">
								<select class="form-select"	aria-label=".form-select example" name="stat">
									<option value="All" ${pr.sc.stat=='All' || pr.sc.stat=='' ? "selected" : ""}>전체</option>
									<option value="P" ${pr.sc.stat=='P' ? "selected" : ""}>접수가능</option>
									<option value="O" ${pr.sc.stat=='O' ? "selected" : ""}>오픈예정</option>
									<option value="E" ${pr.sc.stat=='E' ? "selected" : ""}>접수마감</option>
								</select>
							</div>
						</div>
					</div>
					<div class="col-md-2 d-grid d-md-block">
						<button type="reset" class="btn btn-danger">초기화</button>
					</div>
				</div>
				<div role="search" class="row gap-1">
					<div class="col-md-9">
						<input class="form-control" type="text" name="keyword" value="${param.keyword }" placeholder="검색어를 입력해주세요" aria-label="Search">
					</div>
					<div class="col-md-2 d-grid d-md-block">
						<input type="submit" class="btn btn-primary" value="검색">
					</div>
				</div>
			</div>
			<div class="row py-3 float-end">
				<select class="form-select col-auto" name="orderby" aria-label=".form-select-sm example" style="width: auto;">
					<option value="New" ${pr.sc.orderby=='New' || pr.sc.orderby=='' ? "selected" : ""}>강좌명순</option>
					<option value="End" ${pr.sc.orderby=='End' ? "selected" : ""}>접수마감일순</option>
					<option value="Start" ${pr.sc.orderby=='Start' ? "selected" : ""}>수강시작일순</option>
				</select>
				<button class="col-auto btn btn-secondary">조회</button>
			</div>
		</form>

		<table class="table text-center">
			<thead class="table-light align-middle">
				<tr>
					<th>강좌명</th>
					<th>수강기간</th>
					<th>수강시간</th>
					<th>강사명</th>
					<th>수강료</th>
					<th>접수기간</th>
					<th>상태</th>
				</tr>
			</thead>
			<tbody class="table-group-divider align-middle">
				<c:forEach var="courseDto" items="${list }">
					<tr>
						<td><a class="tdeco-none" href="<c:url value="/course/detail${pr.sc.queryString }&course_id=${courseDto.course_id }" />">${courseDto.course_nm }</a></td>
						<td>${courseDto.course_sd() }<br>~${courseDto.course_ed() }</td>
						<td>${courseDto.course_day }<br>${courseDto.course_time }</td>
						<td>${courseDto.user_name }</td>
						<td>${courseDto.course_cost }</td>
						<td>${courseDto.reg_sd() }<br>~${courseDto.reg_ed() }</td>
						<td class="${courseDto.course_stat() == '접수가능' ? 'text-primary' : 'text-secondary' }">${courseDto.course_stat() }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<nav aria-label="Page navigation example">
			<c:if test="${totalCnt == null || totalCnt == 0}">
				<div class="text-center mb-5">게시물이 없습니다.</div>
			</c:if>
			<c:if test="${totalCnt != null || totalCnt != 0}">
				<ul class="pagination justify-content-center">
					<c:if test="${pr.showPrev }">
						<li class="page-item"><a class="page-link" href="<c:url value="/course/search${pr.sc.getQueryString(pr.beginPage-1) }" />"> &lt; </a></li>
					</c:if>
					<c:forEach var="i" begin="${pr.beginPage }" end="${pr.endPage }">
						<a class="page-link" href="<c:url value="/course/search${pr.sc.getQueryString(i) }" />">${i }</a>
					</c:forEach>
					<c:if test="${pr.showNext }">
						<li class="page-item"><a class="page-link" href="<c:url value="/course/search${pr.sc.getQueryString(pr.endPage+1) }" />"> &raquo; </a></li>
					</c:if>
				</ul>
			</c:if>
		</nav>
	</div>

	<!-- footer inlcude -->
	<%@include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>