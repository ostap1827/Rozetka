<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="internal-buttons">
	<ul id="categories" class="nav nav-sidebar">
		<c:forEach items="${categoryList }" var="category">
			<li><a href="#">${category.categoryName }</a></li>
		</c:forEach>
	</ul>
</div>
<script>
$(function(){
	$.get("category/all", function(data){
		var categories = $('#categories');
		for(var index in data){
			categories.append('<li><a href="#">'+ data(index) +'</a></li>')
		}
	});
});

</script>