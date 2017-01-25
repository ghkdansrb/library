<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body, html {height: 100%}
.bgimg{
    min-height: 100%;
    background-position: center;
    background-size: cover;
}
.bgimg {background-image: url("img/book.jpg")}

</style>
<body>

<!-- Header / Home-->
<header class="w3-display-container w3-wide bgimg w3-grayscale-min">
  <div class="w3-display-middle w3-text-white w3-center">

  </div>
</header>


<div class="w3-display-middle w3-text-white w3-center">
    <h1 class="w3-jumbo">LOGIN</h1>

    <form action="member.html">
    	<div class="form-group">
    		<div>ID</div>
    		<input type="text" class="form-control" name="id">
    	</div>
    	<div class="form-group">
    		<div>PW</div>
    		<input type="password" class="form-control" name="pw">
    	</div>
    	<button type="submit" class="btn btn-default">login</button>

    </form>
    </div>






</body>
</html>
