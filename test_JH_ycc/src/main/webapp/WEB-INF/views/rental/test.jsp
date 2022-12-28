<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col" style="text-align: center;">대관 장소</th>
					<th scope="col" style="text-align: center;">시간</th>
					<th scope="col" style="text-align: center;">예약일</th>
					<th scope="col" style="text-align: center;">예약</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td>08:00 ~ 10:10</td>
					<td></div></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<td></td>
					<td>10:20 ~ 12:10</td>
					<td></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<td></td>
					<td>12:20 ~ 14:10</td>
					<td></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<td></td>
					<td>14:20 ~ 16:10</td>
					<td></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<td></td>
					<td>16:20 ~ 18:10</td>
					<td></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<td></td>
					<td>18:20 ~ 20:00</td>
					<td></td>
					<td><input type="checkbox"></td>
				</tr>
				<c:forEach value="selected" items= "${selectedvalue }">
				
				</c:forEach>
			</tbody>
		</table>

</body>
</html>