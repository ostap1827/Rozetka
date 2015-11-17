<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">

<form action="registration/addNewUser" method="post">
	<div id="registration_form">
		<div class="form-group">
			<label>Name</label><input name="userName" class="form-control"
				type="text" placeholder="enter your name">
		</div>
		<div class="form-group">
			<label>E-Mail</label><input name="userEmail" class="form-control"
				type="email" placeholder="enter your E-Mail">
		</div>
		<div class="form-group">
			<label>Login</label><input name="userLogin" class="form-control"
				type="text" placeholder="enter login">
		</div>
		<div class="form-group">
			<label>Password</label><input name="userPassword"
				class="form-control" type="password" placeholder="enter password">
		</div>
		<button type="submit">OK!</button>
	</div>
</form>
