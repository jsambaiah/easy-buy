<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Fresh Bag</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<link href="resources/public/css/bootstrap.css" rel='stylesheet'
	type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="resources/public/css/style.css" rel='stylesheet'
	type='text/css' />
<!-- Custom Theme files -->
<!--webfont-->
<link
	href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext'
	rel='stylesheet' type='text/css'>
<script type="text/javascript"
	src="resources/public/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="resources/public/js/bootstrap.js"></script>
<!-- start menu -->
<link href="resources/public/css/megamenu.css" rel="stylesheet"
	type="text/css" media="all" />
<script>
	$('#myModal').on('shown.bs.modal', function() {
		$('#myInput').focus()
	});
	$(document).ready(function() {
		$('#login').autocomplete({
			serviceUrl : '${pageContext.request.contextPath}/getWelcomeItems',
			paramName : "name",
			delimiter : ",",
			transformResult : function(response) {

				return {
					//must convert json to javascript object before process
					suggestions : $.map($.parseJSON(response), function(item) {

						return {
							alert("Samba "+item.name);
							value : item.name,
							data : item.id
						};
					})
				};
			}
		});
	});
</script>
</head>
<body>
	<div class="modal fade bs-example" id="register" role="dialog"
		aria-labelledby="myLargeModalLabel">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h2>Register</h2>
				</div>
				<div class="modal-body">
					<div class="row text13">
						<form role="registerForm" >
							<div class="col-lg-10">

								<div class="form-group">
									<label for="InputName">Enter Name <span class="red">*</span></label>
									<div class="input-group">
										<input type="text" class="form-control" name="InputName"
											id="InputName" placeholder="Enter Name" required="">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-user"></span></span>
									</div>
								</div>
								<div class="form-group">
									<label for="InputEmail">Enter Email</label>
									<div class="input-group">
										<input type="email" class="form-control" id="InputEmailFirst"
											name="InputEmail" placeholder="Enter Email" required="">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-envelope"></span></span>
									</div>
								</div>
								<div class="form-group">
									<label for="InputEmail">Confirm Email</label>
									<div class="input-group">
										<input type="email" class="form-control" id="InputEmailSecond"
											name="InputEmail" placeholder="Confirm Email" required="">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-envelope"></span></span>
									</div>
								</div>
								<div class="form-group">
									<label for="InputEmail">Contact Number</label>
									<div class="input-group">
										<input type="email" class="form-control" id="InputEmailSecond"
											name="InputEmail" placeholder="Confirm Email" required="">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-phone"></span></span>
									</div>
								</div>


								<div class="form-group">
									<label for="InputMessage">Enter Your Items Delivery
										Address</label>
									<div class="input-group">
										<textarea name="InputMessage" id="InputMessage"
											class="form-control" rows="5" required=""></textarea>
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-home"></span></span>
									</div>
								</div>

							</div>
						</form>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Submit</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
	</div>


	<!--Login-------------------------------------------------------------->
	<div class="modal fade bs-example" id="login" role="dialog"
		aria-labelledby="myLargeModalLabel">
		<div class="modal-dialog">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">
						Sign In
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">×</span>
						</button>
					</div>

				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>

					<form id="loginform" class="form-horizontal" role="form">

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input id="login-username"
								type="text" class="form-control" name="username" value=""
								placeholder="username or email">
						</div>

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input id="login-password"
								type="password" class="form-control" name="password"
								placeholder="password">
						</div>



						<div class="input-group text13">
							<div class="">

								<input id="login-remember" type="checkbox" name="remember"
									value="1"> Remember me | <a href="#">Forgot
									password?</a>

							</div>


						</div>


						<div style="margin-top: 10px" class="form-group">
							<!-- Button -->

							<div class="col-sm-12 controls">
								<a id="btn-login" href="#" class="btn btn-success">Login </a> <a
									id="btn-fblogin" href="#" class="btn btn-primary">Cancel</a>

							</div>
						</div>


						<div class="form-group">
							<div class="col-md-12 control">
								<div
									style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
									Don't have an account! <a href="#" data-dismiss="modal"
										aria-label="Close" data-toggle="modal" data-target="#register">
										Sign Up Here </a>
								</div>
							</div>
						</div>
					</form>



				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>



	<!--My Basket Items -------------------------------------------------------->
	<div class="modal fade bs-example" id="myModal" role="dialog"
		aria-labelledby="myLargeModalLabel">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h2>My Basket Items</h2>
				</div>
				<div class="modal-body">
					<div class="">



						<div class="pull-left col-sm-4">
							<small>My Basket (4 Items)</small>

						</div>

						<div class="pull-right col-sm-6 text-right">
							<small>
								<h4>Delivery Address</h4>
								<p>
									Financial Centre Road, Downtown Dubai, Near Buj Khalifa <span><strong>Mobile</strong>
										: 917507649011</span> <a href="#">Change Address</a>
								</p>
							</small>


						</div>
						<div class="clearfix"></div>
						<hr />
						<div id="cartContent">
							<!-- cart header -->

							<!-- /cart header -->

							<!-- cart item -->
							<div class="item">
								<div class="cart_img">
									<img src="resources/public/images/pic1.png" alt="" width="60">
								</div>
								<div class="col-sm-3 product_name">Onions</div>
								<div class="col-sm-2">
									<select class="select">
										<option>250 gm - 2 AED</option>
										<option>500 gm - 3 AED</option>
										<option>1 kg - 5 AED</option>
									</select>
								</div>
								<div class="total_price col-sm-3">
									<span>32.00</span> - AED
								</div>
								<div class="clearfix"></div>
							</div>
							<!-- /cart item -->

							<!-- cart item -->
							<div class="item">
								<div class="cart_img">
									<img src="resources/public/images/pic2.png" alt="" width="60">
								</div>
								<div class="col-sm-3 product_name">Tamato</div>
								<div class="col-sm-2">
									<select class="select">
										<option>250 gm - 2 AED</option>
										<option>500 gm - 3 AED</option>
										<option>1 kg - 5 AED</option>
									</select>
								</div>
								<div class="total_price col-sm-3">
									<span>32.00</span> - AED
								</div>
								<div class="clearfix"></div>
							</div>
							<!-- /cart item -->

							<!-- cart item -->
							<div class="item">
								<div class="cart_img">
									<img src="resources/public/images/pic3.png" alt="" width="60">
								</div>
								<div class="col-sm-3 product_name">Potato</div>
								<div class="col-sm-2">
									<select class="select">
										<option>250 gm - 2 AED</option>
										<option>500 gm - 3 AED</option>
										<option>1 kg - 5 AED</option>
									</select>
								</div>
								<div class="total_price col-sm-3">
									<span>32.00</span> - AED
								</div>
								<div class="clearfix"></div>
							</div>

							<!-- /cart item -->


							<!-- cart total -->
							<div class="total col-sm-offset-10">


								<span class="totalToPay styleSecondColor"> <strong>TOTAL:
										$64</strong>
								</span>

							</div>
							<!-- /cart total -->
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Deliver Now</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<nav>
		<div class="header_top ">
			<div class="pull-right col-sm-6 ">
				<div class="register-info ">
					<ul>
						<li class="col-sm-7 text-right call">Call Us : +917507649011</li>
						<li class="col-sm-5 text-right"><a href="#"
							data-toggle="modal" data-target="#register">Register</a> <span>
								| </span> <a href="#" data-toggle="modal" data-target="#login">Login</a></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="header_bottom">
			<div class="col-sm-2 span_1">
				<div class="logo">
					<h1>FreshMart</h1>
				</div>
			</div>
			<div class="col-sm-10 row_2">
				<div class="header_bottom_right">
					<div class="find pull-left">
						<select class="select-search">
							<option>Fruits</option>
							<option>Vegetables</option>
						</select>
					</div>
					<div class="search pull-left">

						<input type="text" value="Search"> <input type="submit"
							value="">
					</div>
					<ul class="bag">
						<a href="#"><i class="bag_left"> </i></a>
						<a href="#" data-toggle="modal" data-target="#myModal">
							<li class="bag_right">
								<p>
									Buy Basket <span
										style="border-radius: 40px; background: #fff; color: #000; padding: 5px;">6</span>
								</p>
						</li>
						</a>
						<div class="clearfix"></div>
					</ul>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
		<div>
			<nav class="navbar navbar-default navbar-static-top nav-top">
				<!-- We use the fluid option here to avoid overriding the fixed width of a normal container within the narrow content columns. -->
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-8" aria-expanded="true">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>

					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="navbar-collapse collapse"
						id="bs-example-navbar-collapse-8" aria-expanded="true">
						<ul class="nav navbar-nav">
							<li><a href="index.html">Home</a></li>
							<li class="dropdown"><a class="dropdown-toggle"
								data-toggle="dropdown" href="#" role="button"
								aria-haspopup="true" aria-expanded="false">Fruits <span
									class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">Apples</a></li>
									<li><a href="#">Oranges</a></li>
									<li><a href="#">Bananas</a></li>
									<li><a href="#">Grapes</a></li>
									<li><a href="#">Melons</a></li>
									<li><a href="#">Pomegranate</a></li>
									<li><a href="#">Figs</a></li>
								</ul></li>
							</li>
							<li><a class="dropdown-toggle" data-toggle="dropdown"
								href="#" role="button" aria-haspopup="true"
								aria-expanded="false">Vegetables <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">Cabbage</a></li>
									<li><a href="#">Carrot</a></li>
									<li><a href="#">Brocolli</a></li>
									<li><a href="#">Cauliflower</a></li>
									<li><a href="#">Cucumber</a></li>
									<li><a href="#">Green Beans</a></li>
									<li><a href="#">Onions</a></li>
									<li><a href="#">Patatoes</a></li>
									<li><a href="#">Radish</a></li>
									<li><a href="#">Spinach</a></li>
									<li><a href="#">Beetroot</a></li>

								</ul></li>
							<li><a href="about.html">About</a></li>
							<li><a href="contact.html">Contact</a></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>
			</nav>
		</div>

	</nav>
	<div id="carousel-example-generic" class="carousel slide"
		data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="resources/public/images/banner1.jpg" width="100%"
					class="img-responsive">
				<div class="carousel-caption">...</div>
			</div>
			<div class="item">
				<img src="resources/public/images/banner2.jpg" width="100%"
					class="img-responsive">
				<div class="carousel-caption">...</div>
			</div>
			<div class="item">
				<img src="resources/public/images/banner3.jpg" width="100%"
					class="img-responsive">
				<div class="carousel-caption">...</div>
			</div>
		</div>

		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic"
			role="button" data-slide="prev"> <span
			class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#carousel-example-generic"
			role="button" data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	<div class="content m-top20">
		<div class="content_box">
			<h2>Fruits and Vegetables</h2>
			<div class="products">
				<ul>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic1.png"
						class="img-responsive center-block" alt="" />
						<h3>Onions</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic2.png"
						class="img-responsive center-block" alt="" />
						<h3>Tamato</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic3.png"
						class="img-responsive center-block" alt="" />
						<h3>Ladies Finger</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic4.png"
						class="img-responsive center-block" alt="" />
						<h3>Carrot</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>

					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic1.png"
						class="img-responsive center-block" alt="" />
						<h3>Onions</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic2.png"
						class="img-responsive center-block" alt="" />
						<h3>Tamato</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic3.png"
						class="img-responsive center-block" alt="" />
						<h3>Ladies Finger</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic4.png"
						class="img-responsive center-block" alt="" />
						<h3>Carrot</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>

					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic1.png"
						class="img-responsive center-block" alt="" />
						<h3>Onions</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic2.png"
						class="img-responsive center-block" alt="" />
						<h3>Tamato</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic3.png"
						class="img-responsive center-block" alt="" />
						<h3>Ladies Finger</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic4.png"
						class="img-responsive center-block" alt="" />
						<h3>Carrot</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>

					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic1.png"
						class="img-responsive center-block" alt="" />
						<h3>Onions</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic2.png"
						class="img-responsive center-block" alt="" />
						<h3>Tamato</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic3.png"
						class="img-responsive center-block" alt="" />
						<h3>Ladies Finger</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic4.png"
						class="img-responsive center-block" alt="" />
						<h3>Carrot</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>

					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic1.png"
						class="img-responsive center-block" alt="" />
						<h3>Onions</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>
					<li class="col-xs-6 col-sm-3 col-lg-2 col-xl-12 col-md-3"><img
						src="resources/public/images/pic2.png"
						class="img-responsive center-block" alt="" />
						<h3>Tamato</h3>
						<p>
							<select>
								<option>250 gm - 2 AED</option>
								<option>500 gm - 3 AED</option>
								<option>1 kg - 5 AED</option>
							</select>
						</p>
						<p>
							<input type="button" value="Add">
						</p></li>





					<div class="clearfix"></div>
				</ul>
			</div>
		</div>
	</div>
	<div class="clearfix"></div>
	<footer>
		<div class="container">
			<div class="col-sm-2">
				<h4>GET TO KNOW US</h4>
				<ul>
					<li><a href="#">About</a></li>
					<li><a href="#">Terms & Conditions</a></li>
					<li><a href="#">Privacy Policy</a></li>
					<li><a href="#">Disclaimer</a></li>
				</ul>
			</div>

			<div class="col-sm-2">
				<h4>LINKS</h4>
				<ul>
					<li><a href="#">Home</a></li>
					<li><a href="#">Fruits</a></li>
					<li><a href="#">Vegetables</a></li>


				</ul>
			</div>


			<div class="col-sm-2">
				<h4>CONTACT US</h4>
				<p>Financial Centre Road,Downtown Dubai,Near Buj Khalifa United
					Arab Emirates</p>
			</div>

			<div class="col-sm-2">
				<h4>CALL US</h4>
				<p>+ 917507649011</p>
			</div>
		</div>
		<div class="copyright">Copyright © 2015 Fresh Mart. All Rights
			Reserved</div>
	</footer>

	<link href="resources/public/css/flexslider.css" rel='stylesheet'
		type='text/css' />
	<script defer src="resources/public/js/jquery.flexslider.js"></script>
	<script type="text/javascript">
		$(function() {
			SyntaxHighlighter.all();
		});
		$(window).load(function() {
			$('.flexslider').flexslider({
				animation : "slide",
				start : function(slider) {
					$('body').removeClass('loading');
				}
			});
		});
	</script>
</body>
</html>
