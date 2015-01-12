<!DOCTYPE html>
<html>
  <head>
      <meta charset="UTF-8">
      <title>Admin  |  Course series List</title>
      <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
      <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" /><!-- bootstrap 3.0.2 -->
      <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" /> <!-- font Awesome -->
      <link href="css/ionicons.min.css" rel="stylesheet" type="text/css" /><!-- Ionicons -->
      <link href="css/AdminLTE.css" rel="stylesheet" type="text/css" /><!-- Theme style -->
	  <link href="css/datepicker.css" rel="stylesheet"  type="text/css" />
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
                    <h3 class="box-title"> Course series Lists</h3>
                      <div style="float:right; padding:5px;"><a href="${pageContext.request.contextPath}/CourseSeriesListDetails" ><i class="fa fa-angle-double-right"></i> Create Course Series</a></div>
                  </div>
				  <%@ include file="incCourseSeriesList.jsp" %>
				  <%@ include file="incPopup.jsp" %>
                </div> <!-- /.box -->
             </div> <!--/.col (left) -->
          </div>     <!-- /.row -->
         </section> <!-- /.content -->
       </aside> <!-- /.right-side -->
     </div> <!-- ./wrapper -->
      
     <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script><!-- jQuery 2.0.2 -->
     <script src="js/bootstrap.min.js" type="text/javascript"></script> <!-- Bootstrap -->
     <script src="js/plugins/datatables/jquery.dataTables.js" type="text/javascript"></script><!-- DATA TABES SCRIPT -->
     <script src="js/plugins/datatables/dataTables.bootstrap.js" type="text/javascript"></script>
     <script src="js/AdminLTE/app.js" type="text/javascript"></script> <!-- AdminLTE App -->
     <script src="js/AdminLTE/demo.js" type="text/javascript"></script><!-- AdminLTE for demo purposes -->
     <script src="js/bootstrap-datepicker.js"></script>
         
	<script type="text/javascript">
		$( document ).ready(function() {
			var list;
			$('#exampleModal').on('shown.bs.modal', function (event) {
				  var button = $(event.relatedTarget); // Button that triggered the modal
				  var recipient = button.data('whatever'); // Extract info from data-* attributes
				  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
				  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
				  var modal = $(this);
				 // modal.find('.modal-title').text('Edit ' + recipient);  
				  $('#groupid').val(recipient);
				  //alert(recipient);
			});
			

			
				
			
			$(document).on('focus', '.clsdate', function(event){
				thisID = $(this).attr("id"); 								
				//alert("test");
				$(this).datepicker();
			});			
			
			$('td').on('click', function() {  
				var objectArray =[];
				    objectArray[0] = { "courseCode"  : "CCON KS", "courseSeriesTitle" : "DVR-WYND-Series-2" };
				    objectArray[1] = { "courseCode"  : "Cert", "courseSeriesTitle" : "DVR-WYND-Series-2" };
				    objectArray[2] = { "courseCode"  : "CCON PP", "courseSeriesTitle" : "DVR-WYND-Series-2" };
				/* var currentValueid = $(this).attr('id');
				$.ajax({
					  async: false,
					  type:'GET',
					  url: "CourseSeriesSelectServlet",
					  data:{id:currentValueid}, 
					  success: function(response) {
						  objectArray = response;
					  },
					  error: function(xhr) {
					    //Do Something to handle error
					  }
				}); */
				
				if(objectArray.length > 0){
					$('#courseSeriesDetails').modal('show');
				  	$('#courseSeriesDetails').on('shown.bs.modal', function (event) {
				  		$("#course").empty();
				  		for (var i = 0; i < objectArray.length; i++) {
				  			
				         	var html=$("<div class='form-group'>").append($("<div class='row'>").append($("<div class='col-xs-8'>").append('<input type="text" class="form-control" style="margin-bottom:10px;" name="coursename[]" value="'+objectArray[i].courseCode+'">')).append($("<div class='col-xs-4'>").append('<input class="form-control clsdate" type="text" name="pdate[]" placeholder="Choose date" value="">')));
							//$("#duplitextbox").append(html);				  			
				  	       // $('#course').append('<input type="text" name="Fname" value="'+objectArray[i].courseCode+'"><br>');
				         	 $('#course').append(html);
				  	    }
			      	})
				}
			});
			
			var textboxId = 0;	
			var dupId = 0;
			var gdata=-1;
			function CreateTextbox(textboxId,textboxvalue) {    
				
			 	var textBox = document.createElement("input");	
			    textBox.setAttribute("type", "textbox");
			    textBox.setAttribute("id", "d_course"+textboxId);
				textBox.setAttribute("class", "form-control");
				textBox.setAttribute("style", "margin-bottom:10px;");	
				textBox.setAttribute("name", "d_coursename[]");
				textBox.setAttribute("value", textboxvalue);
			    textboxId++;
			    return textBox; 
				
			}	

			function CreateTextdatebox(textdateboxId,textdateboxvalue) {    
				
			 	var textBox = document.createElement("input");	
			    textBox.setAttribute("type", "textbox");
			    textBox.setAttribute("id", "d_cdate"+textdateboxId);
				textBox.setAttribute("class", "form-control clsdate");
				textBox.setAttribute("style", "margin-bottom:10px;");
				textBox.setAttribute("data-date-format", "mm/dd/yyyy");
				textBox.setAttribute("data-date", "");
				textBox.setAttribute("name", "d_coursedate[]");
				textBox.setAttribute("value", '');
			    textboxId++;
			    return textBox; 
				
			}	

			  $( "input[name='coursename[]']" ).on( "mousedown", function( event ) {
				if(event.which==3){													 
					var data = $(this).attr("id");
					var textboxvalue = $(this).val(); 
					 
					var r = confirm("Do you want duplicate the course name");
					if (r == true) {
						var html=$("<div class='form-group'>").append($("<div class='row'>").append($("<div class='col-xs-8'>").append(CreateTextbox(data,textboxvalue))).append($("<div class='col-xs-4'>").append(CreateTextdatebox(data,textboxvalue))));
						$("#duplitextbox").append(html);
						
					} else {
						
					} 
				}
			});		
			  
		});
	</script>
  </body>
</html>
