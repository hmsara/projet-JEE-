<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form by Colorlib</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">

</head>
<body>

<input type= "hidden" id ="status" value ="<%= request.getAttribute("status") %>">
	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Sign up</h2>
					
						<form method="post" action="register" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name" />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" />
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="pass" id="pass" placeholder="Password" />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="contact" id="contact"
									placeholder="Contact no" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/signup-image.jpg" alt="sing up image">
						</figure>
						<a href="login.jsp" class="signup-image-link">I am already
							member</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.0.17/dist/sweetalert2.all.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sweetalert2@11.0.17/dist/sweetalert2.min.css">


<script type="text/javascript">
var status =document.getElementById("status").value;
if (status== "success"){
	
	  Swal.fire({
	    title: 'Congrats',
	    text: 'Account Created Successfully',
	    icon: 'success',
	    confirmButtonText: 'OK'
	  })
	
	//swal('Congrats','Account Created Successfully','success');
	
}if (status== "invalidname"){
	
	  Swal.fire({
	    title: 'sorry',
	    text: 'please enter name ',
	    icon: 'error',
	    confirmButtonText: 'OK'
	  })
	
	//swal('Congrats','Account Created Successfully','success');
	
}if (status== "invaliduemail"){
	
	  Swal.fire({
	    title: 'sorry',
	    text: 'please enter email ',
	    icon: 'error',
	    confirmButtonText: 'OK'
	  })
	
	//swal('Congrats','Account Created Successfully','success');
	
}if (status== "invalidupwd"){
	
	  Swal.fire({
	    title: 'sorry',
	    text: 'please enter password ',
	    icon: 'error',
	    confirmButtonText: 'OK'
	  })
	
	//swal('Congrats','Account Created Successfully','success');
	
}if (status== "invalidupwd"){
	
	  Swal.fire({
	    title: 'sorry',
	    text: 'please enter password ',
	    icon: 'error',
	    confirmButtonText: 'OK'
	  })
	
	//swal('Congrats','Account Created Successfully','success');
	
}
if (status== "invalidConfirm"){
	
	  Swal.fire({
	    title: 'sorry',
	    text: 'password dont match',
	    icon: 'error',
	    confirmButtonText: 'OK'
	  })
	
	//swal('Congrats','Account Created Successfully','success');
	
}if (status== "invalidumobile"){
	
	  Swal.fire({
	    title: 'sorry',
	    text: 'please enter mobile number',
	    icon: 'error',
	    confirmButtonText: 'OK'
	  })
	
	//swal('Congrats','Account Created Successfully','success');
	
}if (status== "invalidumobile"){
	
	  Swal.fire({
	    title: 'sorry',
	    text: 'please enter mobile number',
	    icon: 'error',
	    confirmButtonText: 'OK'
	  })
	
	//swal('Congrats','Account Created Successfully','success');
	
}if (status== "invalidlength"){
	
	  Swal.fire({
	    title: 'sorry',
	    text: 'length mobile number should be of 8 digit',
	    icon: 'error',
	    confirmButtonText: 'OK'
	  })
	
	//swal('Congrats','Account Created Successfully','success');
	
}
</script>


</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>