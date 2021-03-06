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
    
    
   
  <section id="slideshow">	<!-- Slideshow Start -->
        <div class="html_carousel">
			<div id="slider">
            
				<div class="slide">
					<img src="images/slideshow/sliderimage1.jpg" width="3000" height="783" alt="image 1"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->
				</div><!--/slide-->
                
				<div class="slide">
					<img src="images/slideshow/sliderimage2.jpg" width="3000" height="783" alt="image 2"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->
				</div><!--/slide-->
                
                <div class="slide">
					<img src="images/slideshow/sliderimage3.jpg" width="3000" height="783" alt="image 3"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->
				</div><!--/slide-->
                
			</div><!--/slider-->
			<div class="clearfix"></div>
		</div><!--/html_carousel-->
    </section>	<!-- Slideshow End -->
    
    
   

<!-- TO MAKE THE PHP FORM WORK, ALL YOU NEED TO DO IS OPEN UP THE FILE CALLED 'submitemail.php' AND CHANGE WHERE IT SAYS 'your email goes here' -->

<!-- DON'T TOUCH THIS SECTION -->

<footer id="footer">
	<div class="wrapper">
    	<section class="left">
    	<h4>Enter Specification </h4>
            <div  id="formwrap">
                <form method="post" id="submitform2" action="home">
<table border="3" width=800>
<tr><td><font color='white'>Company Name :   </td> <td><select name="cname">
				<option value="0"> Select </option>
				<option value="Samsung">Samsung </option>
				<option value="Apple">Apple</option>
				<option value="Acer">Acer </option>
				<option value="Toshiba">Toshiba </option>
				<option value="Asus">Asus </option>
				<option value="Lenovo">Lenovo </option>
				<option value="Micromax">Micromax </option>
				<option value="HCL">HCL </option>
				<option value="Amazon">Amazon </option>
				<option value="Sony">Sony </option>
				<option value="HP">HP </option>
				<option value="HTC">HTC </option>
				<option value="Huawei">Huawei </option>
				<option value="Google">Google </option>
				<option value="LG">LG </option>
				<option value="Blackberry">Blackberry </option>
				<option value="Dell">Dell </option>
				<option value="Others">Others </option>


</select></tr>
<tr>

<td> <font color='white'>Product Name : </td> <td> <input type="text" name="pname" /> </td> 

<td> <font color='white'>Processor Frequency(in GHz) : </td> <td> <input type = "text" name = "pf" /> </td>
</tr>
<tr></tr>
<tr>
<td><font color='white'>Processor Core :   </td> <td> <select name="pc">
				<option value="0"> Select </option>
				<option value="1">1 </option>
				<option value="2">2 </option>
				<option value="4">4</option>
				<option value="8">8 </option>
				
				
</select> </td>


<td><font color='white'>Processor Company :   </td> <td> <select name="pq">
				<option value="0"> Select </option>
				<option value="50">Intel </option>
				<option value="45">Apple</option>
				<option value="43">Qualcomm </option>
				<option value="41">Nvidia </option>
				<option value="39">Exynox </option>
				<option value="36">Ti Omap </option>
				<option value="ot">Others </option>
</select> </td>
</tr>
<tr></tr>
<tr>
<td><font color='white'>Mac Support :   </td> <td> <select name="ms">
				<option value="0"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
				
</select> </td>
<td><font color='white'>Android Support :   </td> <td> <select name="as">
				<option value="0"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
				
</select> </td>
</tr>
<tr></tr>
<tr>
<td><font color='white'>Windows Support :   </td> <td> <select name="ws">
				<option value="0"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
				
</select> </td>
<td><font color='white'>Blackberry Support :   </td> <td> <select name="bs">
				<option value="0"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
				
</select> </td>
</tr>
<tr></tr>
<tr>
<td><font color='white'>Display Size(in inches)	:   </td> <td> <input type = "text" name = "ds" /></td>
<td><font color='white'>Display Quality :   </td> <td> <select name="dq">
				<option value="0"> Select </option>
				<option value="1">LCD </option>
				<option value="2">TFT LCD</option>
				<option value="3">HD LCD</option>
				<option value="3.5">IPS LCD</option>
				<option value="4">Full HD LCD</option>
				<option value="5">3D LCD</option>
				<option value="6">LED</option>
				<option value="6.5">IPD LED</option>
				<option value="7">LED backlit 132 PPi</option>
				<option value="8">LED backlit 264 PPi</option>
				<option value="9">HD LED</option>
				<option value="10">FULL HD LED</option>
				<option value="11">3D HD LED</option>
				
				
				
				
</select> </td>

</tr>
<tr></tr>
<tr>
<tr></tr>
<tr>
<td><font color='white'>Display Resolution	:   </td> <td> <input type = "text" name = "dsr" /></td>
<td><font color='white'>RAM(MB)	:   </td> <td> <input type = "text" name = "ram" /></td>
</tr>

<tr><td></td><td><font color='Red'>e.g:-<br> 786X432 =786432</td>
</tr>

<tr></tr>
<tr>
<td><font color='white'>Ram Type :   </td> <td> <select name="rt">
				<option value="0"> Select </option>
				<option value="1">DDR1 </option>
				<option value="2">DDR2</option>
				<option value="3">DDR3</option>
</select> </td>
<td><font color='white'>On Board Memory(GB) :   </td> <td> <select name="obm">
				<option value="0"> Select </option>
				<option value="8">8 </option>
				<option value="16">16 </option>
				<option value="32">32</option>
				<option value="64">64</option>
				<option value="128">128</option>
</select> </td>

</tr>
<tr></tr>
<tr>
<td><font color='white'>Expandable Memory :   </td> <td> <select name="em">
				<option value="0"> Select </option>
				<option value="0"> 0 </option>
				<option value="8">8 </option>
				<option value="16">16 </option>
				<option value="32">32</option>
				<option value="64">64</option>
				<option value="128">128</option>
</select> </td>
<td><font color='white'>Battery Backup(Hrs)   </td> <td> <input type = "text" name = "bbk" /></td>
</tr>
<tr></tr>
<tr>
<tr></tr>
<tr>
<td><font color='white'>Battery Type(mAh)   </td> <td> <input type = "text" name = "bbt" /></td>
<td><font color='white'>weight(in Kg.)   </td> <td> <input type = "text" name = "wgt" /></td>
</tr>
<tr></tr>
<tr>
<td><font color='white'>Back Camera(MegaPixel)    </td> <td> <input type = "text" name = "bcm" /></td>
<td><font color='white'>Back Camera(mode)   </td> <td> <select name="bc">
				<option value="0"> Select </option>
				<option value="1">VGA </option>
				<option value="2">HD</option>
				<option value="3">Full HD</option>
				
</select> 
</tr>
<tr></tr>
<tr>
<td><font color='white'>Front Camera(MegaPixel)</td> <td> <input type = "text" name = "fcm" /></td>
<td><font color='white'>Front Camera(mode)   </td> <td> <select name="fc">
				<option value="0"> Select </option>
				<option value="1">VGA </option>
				<option value="2">HD</option>
				<option value="3">Full HD</option>
				
</select> </td>
</tr>
<tr></tr>
<tr>
<td><font color='white'>HDMI Support :   </td> <td> <select name="hs">
				<option value="0"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
				
</select> </td>
<td><font color='white'>Touch Input   </td> <td> <select name="ti">
				<option value="0"> Select </option>
				<option value="1">Resistive </option>
				<option value="5">Capacitive Single Touch</option>
				<option value="8">Capacitive Multi Touch 8 point</option>
				<option value="10">Capacitive Multi Touch 10 point</option>				
</select> </td>
</tr>
<tr></tr>
<tr>
<td><font color='white'>Thickness   </td> <td> <input type = "text" name = "thk" /></td>
<td><font color='white'>Dimensions (Length X Breadth)inches   </td> <td> <input type = "text" name = "dimn" /></td>
</tr>
<tr></tr>
<tr>
<td><font color='white'>Wifi Support:   </td> <td><select name="wifi">
				<option value="3"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
</select>
<td><font color='white'>Wifi type:   </td><td> <select name="wifiq">
				<option value="0"> Select </option>
				<option value="4">802.11 - A/B/G/N</option>
				<option value="5">802.11 - 2 MBPS</option>
				<option value="6">802.11 - 4 MBPS</option>
</select>
</tr>

<tr></tr>
<tr>
<td><font color='white'>Bluetooth Support:   </td><td> <select name="bts">
				<option value="3"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
</select>
<td><font color='white'>Bluetooth type:   </td><td> <select name="btq">
				<option value="0"> Select </option>
				<option value="2">2</option>
				<option value="2.1">2.1</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
</select>
</tr>

<tr></tr>
<tr>
<td><font color='white'>USB Support:   </td> <td><select name="usbs">
				<option value="3"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
</select>
<td><font color='white'>USB type:   </td><td> <select name="usbq">
				<option value="0"> Select </option>
				<option value="1">micro USB</option>
				<option value="1">usb 1.0</option>
				<option value="2">usb 2.0</option>
				<option value="3">usb 3.0</option>
				
</select>
</tr>

<tr></tr>
<tr>
<td><font color='white'>4G Support:   </td> <td><select name="4gs">
				<option value="3"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
</select>

<td><font color='white'>3G Support:   </td> <td><select name="3gs">
				<option value="3"> Select </option>
				<option value="1">Yes </option>
				<option value="0">No</option>
</select>

</tr>
</table>
<table width='1000'>
<tr height='50'></tr>
<tr align="center"><td width='1000'>

<input type = "submit" value = "Get Price">
</td>
</tr>
</table>
</form>
     
             

             
                
                
            </div>
            
        </section>

    <div class="clearfix"></div>
</footer>

<!-- SLIDESHOW SCRIPT START -->
<script type="text/javascript">
$("#slider").carouFredSel({
	responsive	: true,
	scroll		: {
		fx			: "crossfade",
		easing		: "swing",
		duration	: 1000,
		
	},
	items		: {
		visible		: 1,
		height		: "27%"
	}
});
</script>
<!-- SLIDESHOW SCRIPT END -->
</body>
</html>

