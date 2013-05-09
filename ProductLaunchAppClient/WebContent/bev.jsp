<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">
<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<!-- END OF DON'T TOUCH -->

<!-- Website Title -->
<title>Product Launch</title>
<!-- END OF Website Title -->

<!--  Website description - Change the 'content' section to whatever you want -->
<meta name="description" content="Replace this text with a summary of your website. i.e. John Smith - Web Developer and Photographer - Welcome to my portfolio website! Here you will find all of my latest work. Enjoy!">
<!-- END OF Website description -->

<!-- DON'T TOUCH THIS SECTION -->
<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700|Cookie' rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script src="scripts/jquery.carouFredSel-5.5.2.js" type="text/javascript"></script>
<script type="text/javascript" src="scripts/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="scripts/jquery.form.js"></script> 
<script type="text/javascript" src="scripts/scripts.js"></script> 
</head>
<!-- END OF DON'T TOUCH -->

<body>
<div class="wrapper">
	<div id="top">
        <div id="logo">
          <img src="images/logo.png" alt="logo" width="118" height="139" id="logoimage">	<!-- Logo image -->
            <h1 id="logotitle">Product Launch App...</h1>	
            <!-- Logo text -->
        </div><!--/logo-->
    
        <nav>	<!-- Navigation Start -->
            <ul>
            	<li><a href="#top">HOME</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#work">Work</a></li>
                <li><a href="#footer">Contact</a></li>
        
            </ul>      
        </nav>	<!-- Navigation End -->
       
    
    </div><!--/top-->
    
    
    <hr/><!-- Horizontal Line -->
    
    
  
 <!--  <section id="slideshow">	<!-- Slideshow Start ->
        <div class="html_carousel">
			<div id="slider">
            
				<div class="slide">
					<img src="images/slideshow/sliderimage1.jpg" width="3000" height="783" alt="image 1"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->
				</div><!--/slide ->
                
				<div class="slide">
					<img src="images/slideshow/sliderimage2.jpg" width="3000" height="783" alt="image 2"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->
				</div><!--/slide ->
                
                <div class="slide">
					<img src="images/slideshow/sliderimage3.jpg" width="3000" height="783" alt="image 3"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->
				</div><!--/slide ->
                
			</div><!--/slider ->
			<div class="clearfix"></div>
		</div><!--/html_carousel ->
    </section>	<!-- Slideshow End  -->
    
    
   

<!-- TO MAKE THE PHP FORM WORK, ALL YOU NEED TO DO IS OPEN UP THE FILE CALLED 'submitemail.php' AND CHANGE WHERE IT SAYS 'your email goes here' -->

<!-- DON'T TOUCH THIS SECTION -->

<footer id="footer">
	<div>
    	<section class="left">
    	<h4>Break Even Point </h4>
            <div  id="formwrap">
            
         <!--  <%// String s = request.getAttribute("qdone2").toString(); %>  -->
 
  <form method="post" id="submitform2" action="bev">

</div>
<table >
<tr>
<td> <font color='white'>Your Product price is(USD) </td> <td> <input type="text" id="ab" value=<%= request.getAttribute("qdone2").toString() %> /> </td> 
</tr>
<tr></tr>

<tr>
<td> <font color='white'>Advertising Budget(USD) </td> <td> <input type="text" name="ab" /> </td> 
</tr>
<tr></tr>

<tr>
<td> <font color='white'>Consumer & Trade Promotion Budget(USD)</td> <td> <input type = "text" name = "cpb" /> </td>
</tr>
<tr></tr>

<tr>
<td><font color='white'>Sales Force Budget(USD)</td> <td> <input type = "text" name = "sfb" /></td>
</tr>

<tr>
<td><font color='white'>General and Other Budget(USD)</td> <td> <input type = "text" name = "gb" /></td>
</table>
<table width='1000'>
<tr height='50'></tr>
<tr align="center"><td width='1000'>
<input type = "submit" value = "Get Break Even Point">
</td>
</tr>
</table>
</form>
     
 <%if("true".equals(request.getAttribute("hide")))
 { 
	 %> 
	
	
	 <div style="color: red"> Break Event Point <input type = "text" name = "cpb" value='<%= request.getAttribute("bev").toString()%>'/>
	<%} 
	 %>            

             
                
                
            </div>
            
        </section>

    <div class="clearfix"></div>
</footer>

<!-- SLIDESHOW SCRIPT START 
<script type="text/javascript">
$("#slider").carouFredSel({
	responsive	: true,
	scroll		: {
		//fx			: "crossfade",
		//easing		: "swing",
		//duration	: 1000,
		
	},
	items		: {
		visible		: 1,
		height		: "27%"
	}
});
</script>-->
<!-- SLIDESHOW SCRIPT END -->
</body>
</html>

