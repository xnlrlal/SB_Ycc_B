<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<!-- head & meta tag include -->
    <%@include file="/WEB-INF/views/metahead.jsp"%>
    
    <!-- 커스텀 스타일 (재정의) -->
    <link rel="stylesheet" href="<c:url value='/resources/css/courseSearch.css' />">
	
	<!-- JavaScript Bundle with Popper -->
    <script type="text/javascript" src="/js/default.js"></script>

	<script>
		const myModal = document.getElementById('myModal')
		const myInput = document.getElementById('myInput')
		
		myModal.addEventListener('shown.bs.modal', () => {
		  myInput.focus()
		})
	</script>

<title>YOUNG문화체육센터</title>
<style type="text/css">

a {
    text-decoration: none;
    color: black;
}


.paging {
	color: black;
	width: 100%;
	align-items: center;
	text-align: center;
}

.page {
	color: black;
	padding: 6px;
	margin-right: 10px;
}

.paging-container {
	width: 100%;
	height: 70px;
	display: flex;
	margin-top: 50px;
	margin: auto;
}
</style>
</head>

<body>

<!-- header inlcude -->
<%@include file="/WEB-INF/views/header.jsp"%>

<script type="text/javascript">
/* 		$(document).ready(function(){
			let isSelected = $("option[name=option]").attr('selected');
			
			//1. 읽기 상태이면 수정상태로 변경
			if(isSelected == 'readonly'){
				$(".writing-header").html("게시판 수정")
				$("input[name=title]").attr('readonly', false)
				$("textarea").attr('readonly', false)
				$("#modifyBtn").html("<i class='fa fa-pen'></i> 등록")
				return;
			}
		}) */
</script>


    <!-- 본문 -->
    <div class="container">
      <div class="contents" id="container">

        <div class="introduction">
          <h3 class="py-4">개설 강좌</h3>

          
          <div class="intro">
          	<form action="<c:url value="/course/search" />" method="get">
            <div class="col-2"></div>
            <div class="pro_box container">
              <div class="row ms-5 pt-2">
                <div class="col-3">
                  <div class="row">
                    <label for="sidebar-position2" class="col-4 col-form-label">분류</label>
                    <div class="col-8">
                      <select class="form-select form-select-sm col-6 mt-1" aria-label=".form-select-sm example" name="option">
                      	<c:forEach var="CourseDto" items="${typeList }">
	                      	<!--  <option value="A" ${pr.sc.option=='A' || pr.sc.option=='' ? "selected" : ""} >전체</option>-->
	                        <option value="${CourseDto.course_cate_cd }">${CourseDto.course_cate_name }</option>
                      	</c:forEach>
                      </select>
                    </div>
                  </div>
                </div>
                <div class="col-3">
                  <div class="row">
                    <label for="sidebar-position2" class="col-4 col-form-label">수강대상</label>
                    <div class="col-8">
                      <select class="form-select form-select-sm mt-1" aria-label=".form-select-sm example">
                        <option selected>전체</option>
                        <option value="1">성인</option>
                        <option value="2">학생</option>
                        <option value="3">영유아</option>
                      </select>
                    </div>
                  </div>
                </div>  
                <div class="col-3">
                  <div class="row">
                    <label for="sidebar-position3" class="col-4 col-form-label">접수상태</label>
                    <div class="col-8">
                      <select class="form-select form-select-sm mt-1" aria-label=".form-select-sm example">
                        <option selected>전체</option>
                        <option value="1">접수가능</option>
                        <option value="2">오픈예정</option>
                        <option value="3">접수마감</option>
                      </select>
                    </div>
                  </div>
                </div>
                <div class="col-3">
                  <button type="reset" class="btn btn-danger btn-sm mt-1">초기화</button>
                </div>
                <div role="search" class="row mx-5 py-2">
                <div class="col-10">
                  <input class="form-control form-control-sm me-2" type="text" name="keyword" value="${param.keyword }"  placeholder="검색어를 입력해주세요" aria-label="Search">
                </div>
                <div class="col-2">
                  <input type="submit" class="btn btn-primary btn-sm" value="검색" >
                </div>
              </form>
              </div>
            </div>
          </div>
        </div>
      </div>

      <select class="form-select form-select-sm my-3 float-end" aria-label=".form-select-sm example" style="width: 100px;">
        <option selected>최신순</option>
        <option value="1">강좌명순</option>
        <option value="2">평점순</option>
      </select>

      <table class="table">
        <thead class="table-light">
          <tr>
            <th scope="col">강좌명</th>
            <th scope="col">요일</th>
            <th scope="col">시간</th>
            <th scope="col">강사명</th>
            <th scope="col">수강료</th>
            <th scope="col">상태</th>
          </tr>
        </thead>
        <tbody class="table-group-divider">
        	<c:forEach var="CourseDto" items="${list }">
        		<tr>
        			<td class="title">
        				<a href="<c:url value="/course/detail" />">
        				${CourseDto.course_nm }
        				</a>
        			</td> 
        			<td class="day">${CourseDto.course_day }</td>
		        	<td class="time">${CourseDto.course_time }</td>
		        	<td class="user">${CourseDto.user_name }</td>
		        	<td class="cost">${CourseDto.course_cost }원</td>
		        	<td class="status">접수가능</td>
		        <tr>
        	</c:forEach>
         
        </tbody>
      </table>
      <br>
			<div class="paging-container">
				<div class="paging">
					<c:if test="${totalCnt == null || totalCnt == 0 }">
						<div> 게시물이 없습니다.</div>
					</c:if>
					<c:if test="${totalCnt != null || totalCnt != 0 }">
						<c:if test="${pr.showPrev }">
							<a class="page" href="<c:url value="/course/search${pr.sc.getQueryString(pr.beginPage-1) }" />"> &lt; </a>
						</c:if>
					<%-- 	<c:forEach var="i" begin="${pr.beginPage }" end="${pr.endPage }">
							<a class="page" href="<c:url value="/course/search${pr.sc.getQueryString(i)}" />">${ totalCnt == null || totalCnt == 0 ? "" : i }</a>
						</c:forEach> --%>
						<c:forEach var="i" begin="${pr.beginPage }" end="${pr.endPage }">
							<a class="page"
								href="<c:url value="/course/search${pr.sc.getQueryString(i)}" />">${i }</a>
						</c:forEach>
				<c:if test="${pr.showNext }">
							<a class="page" href="<c:url value="/course/search${pr.sc.getQueryString(pr.endPage+1) }" />"> &gt; </a>
						</c:if>						
					</c:if>
				</div>
		</div>

      <!-- <nav aria-label="Page navigation example" class="my-5">
        <ul class="pagination justify-content-center">
          <li class="page-item">
            <a class="page-link" href="index.html" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
            </a>
          </li>
          <li class="page-item active"><a class="page-link" href="">1</a></li>
          <li class="page-item"><a class="page-link" href="">2</a></li>
          <li class="page-item"><a class="page-link" href="">3</a></li>
          <li class="page-item"><a class="page-link" href="">4</a></li>
          <li class="page-item"><a class="page-link" href="index5.html">5</a></li>
          <li class="page-item">
            <a class="page-link" href="index5.html" aria-label="Next">
              <span aria-hidden="true">&raquo;</span>
            </a>
          </li>
        </ul>
      </nav> -->


    </div>

  </div>


<!-- footer inlcude -->
<%@include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>