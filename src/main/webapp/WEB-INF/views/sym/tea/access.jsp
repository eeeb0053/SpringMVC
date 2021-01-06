<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<h2 style="width:175px;margin:0 auto;">교강사 접속화면</h2>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
<h2>Login Form</h2>

<form>
  <div class="imgcontainer">
    <img style="width:150px;height:150px" src="https://www.w3schools.com/howto/img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>e-mail</b></label>
    <input type="text" placeholder="Enter Username" id="temail" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" id="tpwd" required>
    <button id="tea-access-btn">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
<script>
$(`#tea-access-btn`).click(function(e){
	e.preventDefault()
	alert(`클릭`)
	$.ajax({
        url: `${ctx}/teachers/access`,
        type: 'POST',
        data: JSON.stringify({
            email: $('#temail').val(),
            password: $('#tpwd').val()
        }),
        dataType: 'json',
        contentType: 'application/json',
        success: function(d) {
           alert(`SUCCESS`)
		   location.href=`${ctx}/admin/tea/index`
        },
        error: function(e) {
            alert(`FAIL`)
        }
		})
})
</script>