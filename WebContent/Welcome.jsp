
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta charset="utf-8">
    <meta name="robots" content="all,follow">
    <meta name="googlebot" content="index,follow,snippet,archive">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Obaju e-commerce template">
    <meta name="author" content="Ondrej Svestka | ondrejsvestka.cz">
    <meta name="keywords" content="">

    <title>
        Obaju : e-commerce template
    </title>

    <meta name="keywords" content="">

    <link href='http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100' rel='stylesheet' type='text/css'>

    <!-- styles -->
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/owl.carousel.css" rel="stylesheet">
    <link href="css/owl.theme.css" rel="stylesheet">

    <!-- theme stylesheet -->
    <link href="css/style.default.css" rel="stylesheet" id="theme-stylesheet">

    <!-- your stylesheet with modifications -->
    <link href="css/custom.css" rel="stylesheet">

    <script src="js/respond.min.js"></script>

    <link rel="shortcut icon" href="favicon.png">


</head>
<body>
 

   

                <div class="col-md-6">
                    <div class="box">
                        
<%if(session.getAttribute("id")==null)
	{
	response.sendRedirect("register.jsp");
	}
	%>
	<h1>WELCOME "<%=session.getAttribute("id")%>"</h1>
	
	
	
	
                        <form action="uploadservelet" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                                <label for=name>Enter PRODUCT ID</label>
                                <input type="text" name="Product_id" class="form-control">
                            </div>
                           
                            <div class="form-group">
                                <label for="text">Enter PRODUCT NAME</label>
                                <input type="text" name="Product_name" class="form-control">
                            </div>
                             <div class="form-group">
                                <label for="text">Enter BRAND ID</label>
                                <input type="text" name="Brand_id" class="form-control">
                            </div>
                             <div class="form-group">
                                <label for="text">Enter BRAND NAME</label>
                                <input type="text" name="Brand_name" class="form-control">
                            </div>
                           
                             <div class="form-group">
                                <label for="text">Enter DESCRIPTION</label>
                                <input type="text" name="Description" class="form-control">
                            </div>
                             <div class="form-group">
                                <label for="text">Enter PRICE</label>
                                <input type="text" name="Price" class="form-control">
                            </div>
                             <div class="form-group">
                                <label for="text">Enter OFFERS</label>
                                <input type="text" name="Offers" class="form-control">
                            </div>
                             <div class="form-group">
                                <label for="text">Enter MANUFACTURING DATE</label>
                                <input type="text" name="Manufacturing_date" class="form-control">
                            </div>
                             <div class="form-group">
                                <label for="text">Enter CATEGORY ID</label>
                                <input type="text" name="Category_id" class="form-control">
                            </div>
                             <div class="form-group">
                                <label for="text">Enter CATEGORY NAME</label>
                                <input type="text" name="Category_name" class="form-control">
                            </div>
                             <div class="form-group">
                                <label for="file">UPLOAD IMAGE </label>
                                <input type="file" name="Image" class="form-control">
                            </div>
                             <div class="text-center">
                                <button type="submit" class="btn btn-primary"><i class="fa fa-user-md"></i>SUBMIT</button>
                            </div>
                        </form>
                       
                  </div>
                </div>

                <div class="col-md-6">
                    <div class="box">
                        <br><h1><a href="Logout">Logout</a></h1>
            <!-- /.container -->
        </div>
        <!-- /#content -->


        <!-- *** FOOTER ***
 _________________________________________________________ -->
        





   


    

    <!-- *** SCRIPTS TO INCLUDE ***
 _________________________________________________________ -->
    <script src="js/jquery-1.11.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.cookie.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/modernizr.js"></script>
    <script src="js/bootstrap-hover-dropdown.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/front.js"></script>

</body>
</html>
                  
</body>
</html>