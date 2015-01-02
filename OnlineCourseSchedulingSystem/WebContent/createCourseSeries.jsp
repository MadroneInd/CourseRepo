<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<%@ page import="com.ocms.entity.Course"%>
<%@ page import="com.ocms.entity.Location"%>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Admin  | Course Creation</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- bootstrap 3.0.2 -->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- font Awesome -->
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- daterange picker -->
        <link href="css/daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css" />
        <!-- iCheck for checkboxes and radio inputs -->
        <link href="css/iCheck/all.css" rel="stylesheet" type="text/css" />
        <!-- Bootstrap Color Picker -->
        <link href="css/colorpicker/bootstrap-colorpicker.min.css" rel="stylesheet"/>
        <!-- Bootstrap time Picker -->
        <link href="css/timepicker/bootstrap-timepicker.min.css" rel="stylesheet"/>
        <!-- Theme style -->
        <link href="css/AdminLTE.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
        
		           
        
    </head>
    <body class="skin-blue">
        <!-- header logo: style can be found in header.less -->
        <%@ include file="header.jsp" %>
        <div class="wrapper row-offcanvas row-offcanvas-left">
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="left-side sidebar-offcanvas">
                <!-- sidebar: style can be found in sidebar.less -->
                <%@ include file="sidebarMenu.jsp" %>
                <!-- /.sidebar -->
            </aside>

            <!-- Right side column. Contains the navbar and content of the page -->
            <aside class="right-side">  
              <section class="content"> 
                    <div class="row">              
                        <!-- left column -->
                        <div class="col-md-10">
                            <!-- general form elements -->
                            <div class="box box-primary"> 
                                <div class="box-header">
                                    <h3 class="box-title">New Page</h3>
                                </div><!-- /.box-header -->
                            </div> <!-- /.box -->
                            
						<div class="col-md-6">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">Select Location</h3>
                                </div>
                                <div class="box-body">
                                                             <!-- radio -->
                                    <%List<Location> locationList = (List)session.getAttribute("locationList");%>
                                    <c:forEach items="${locationList}" var="location">
                                    <div class="form-group">
                                        <label>
                                            <input type="radio" name="l1" value="${location.getCode()}" class="minimal-red"  />${location.getCode()}
                                        </label>
                                    </div>
                                    </c:forEach> 
                                    </div><!-- /.box-body -->
                            </div><!-- /.box -->

                            <!-- iCheck -->
                            <div class="box box-success">
                                <div class="box-header">
                                    <h3 class="box-title">Select Course</h3>
                                </div>
                                <div class="box-body">
                             
                                    <!-- Checkbox -->
                                     <%List<Course> courseList = (List)session.getAttribute("courseList");%>
                                     <c:set var="count" value="0" scope="page" />
                                        <div class="form-group">
                                        <c:forEach items="${courseList}" var="course">
                                            <div class="checkbox">
                                             <label>
                                                 
                                                <input name="bType[]" id="bType_"+count class="ads_Checkbox minimal-red" type="checkbox" value="${course.getCode()}" />${course.getCode()}
                                            </label>
                                            </div>
                                           <c:set var="count" value="${count + 1}" scope="page"/>
                                        </c:forEach>   
                                        </div>
                                                                                                
									
                                    
                                </div><!-- /.box-body -->
                               
                            </div><!-- /.box -->
                        </div>
                        
                        <div class="col-md-6" id="disshow" style="display:none;">
                            <div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">Course Series Preview</h3>
                                </div>
                                <div class="box-body">
                                <div id="formContainer"> </div>                              	
                                </div>
                                <div class="box-footer">
                                   <button class="btn btn-primary" type="submit">Create</button>
                                </div>                                
                             </div>
                        </div>                                
                        
                        </div> <!--/.col (left) -->
                        
                        
                      
                    </div>     <!-- /.row -->
                </section> <!-- /.content -->
              
                
            </aside> <!-- /.right-side -->
        </div> <!-- ./wrapper -->

        <!-- jQuery 2.0.2 -->
         <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>  
        <!--<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>-->
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        
        <!-- AdminLTE App -->
        <script src="js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes 
        <script src="js/AdminLTE/demo.js" type="text/javascript"></script>-->
        <!-- Page script -->
        <script type="text/javascript">
 
$(document).ready(function () {
var textboxId = 0;							
function CreateTextbox(textboxId,textboxvalue) {
    var textBox = document.createElement("input");
    textBox.setAttribute("type", "textbox");
    textBox.setAttribute("id", textboxId);
	textBox.setAttribute("class", "form-control");
	textBox.setAttribute("style", "margin-bottom:10px;");
	
	textBox.setAttribute("name", "coursename_"+textboxId);
	textBox.setAttribute("value", textboxvalue);
    textboxId++;
    return textBox;
}							
							
	var val = [];
    var counter = 0;	
 
	 $("input[name='bType[]']").on('ifChecked', function(event){
	   
		if($('input[name=l1]:checked').length<=0)
		{
			alert("Please select the location...");
			$('#disshow').hide();
			return false;
			//$("input[name='bType[]']").removeAttr("checked");
			//$( "input" ).prop( "checked", true );
			 
			//$( ".icheckbox_minimal" ).removeClass( "icheckbox_minimal checked" ).addClass( "icheckbox_minimal" );
		} 
		else{
			//$("#disshow").prop('disabled',false);
			$('#disshow').show();
			var l1=$("input[name=l1]:checked").val();		
			if($(this).is(":checked"))
			{
				var data = $(this).attr("id");
				var arr = data.split('_');			
				var textboxvalue = l1+ '-' +$(this).val();
				$("#formContainer").append(CreateTextbox(arr[1],textboxvalue));		
				
			}
		}	 
	});
	 
  
 
		$("input[name='bType[]']").on('ifUnchecked', function(event){   
		var l1=$("input[name=l1]:checked").val();
		
		if($('input[name=l1]:checked').length<=0){$("#disshow").css("display", "none");}
		
		if($(this).is(":checked")){ } 
		else
		{ 		
			var textboxvalue = l1+ '-' +$(this).val();
			var data = $(this).attr("id");
			var arr = data.split('_');			
			$( "#"+arr[1] ).remove();		
		}
		
	}); 
 

 
});


        </script>  
    </body>
</html>
