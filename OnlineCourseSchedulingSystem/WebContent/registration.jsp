<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Admin  | Price &amp; Registration</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- bootstrap 3.0.2 -->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- font Awesome -->
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="css/ionicons.min.css" rel="stylesheet" type="text/css" />
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
              
<%= request.getParameter("pack_id") %>              
					<div class="row">
                        <div class="col-xs-8">              
							<div class="box box-warning">
                                <div class="box-header">
                                    <h3 class="box-title">Package A: Co-Active Coaching Skills Pathway</h3>
                                </div><!-- /.box-header -->
                                <div class="box-footer">
                                    
                                    </div>
                                <div class="box-body">
                                  
<form onsubmit="return hasAgreed(this);" role="form" name="frmregistration" method="POST" action="http://www.cartserver.com/sc/cart.cgi">
<input type="hidden" value="01" name="pkg">
<input type="hidden" value="a-6814^PKG01^Package A: Co-Active Coaching Skills Pathway, USD $5,665 ^1325.00^1^^^^^" name="item">                                    
                                        <!-- text input -->
                                        <div class="form-group">
                                            <label>Please tell us which Program Advisor assisted you:</label>
                                            
                                            <select class="form-control" name="program_advisor"><option value=" none">-- Please Select --</option><option value=" No one assisted">-- No one assisted me --</option><option value=" Assisted by Amy Anderson">Amy Anderson</option><option value=" Assisted by Carla Hamby">Carla Hamby</option><option value=" Assisted by Debra Martin">Debra Martin</option><option value=" Assisted by Jayson Krause">Jayson Krause</option><option value=" Assisted by Kristen Bentley">Kristen Bentley</option><option value=" Assisted by Rachel Suckle">Rachel Suckle</option><option value=" Assisted by Stephanie Lovinger">Stephanie Lovinger</option><option value=" Assisted by Sue Jordon">Sue Jordon</option><option value=" Assisted by Tammy Hibler">Tammy Hibler</option></select>
                                         
                                        </div> 
                                        
                                        <!-- select -->
                                        <div class="form-group">
                                            <label>Course 1: Co-Active Fundamentals<br>
Co-Active Fundamentals -- Course Dates</label>
                                            <select class="form-control">
<option value="">You have not made a course location selection.</option><option value="Fundamentals - San Francisco Bay Area, CA (San Rafael) - Jan  9-11, 2015">Fundamentals - San Francisco Bay Area, CA (San Rafael) - Jan  9-11, 2015</option><option value="Fundamentals - Washington, DC Metro (Silver Spring) - Jan 16-18, 2015">Fundamentals - Washington, DC Metro (Silver Spring) - Jan 16-18, 2015</option><option value="Fundamentals - Vancouver Metro, BC (Vancouver) - Jan 16-18, 2015">Fundamentals - Vancouver Metro, BC (Vancouver) - Jan 16-18, 2015</option> 
                                            </select>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Course 2: Fulfillment<br>
Fulfillment -- Course Dates</label>
                                            <select class="form-control">
<option value="">You have not made a course location selection.</option><option value="Fulfillment - Austin, TX (Austin) - Jan  9-11, 2015">Fulfillment - Austin, TX (Austin) - Jan  9-11, 2015</option><option value="Fulfillment - Washington, DC Metro (Silver Spring) - Feb  6-8, 2015">Fulfillment - Washington, DC Metro (Silver Spring) - Feb  6-8, 2015</option><option value="Fulfillment - Toronto Metro, ON (Toronto) - Feb  6-8, 2015">Fulfillment - Toronto Metro, ON (Toronto) - Feb  6-8, 2015</option> 
                                            </select>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Course 3: Balance<br>
Balance -- Course Dates</label>
                                            <select class="form-control">
<option value="">You have not made a course location selection.</option><option value="Balance - San Francisco Bay Area, CA (San Rafael) - Jan 16-18, 2015">Balance - San Francisco Bay Area, CA (San Rafael) - Jan 16-18, 2015</option><option value="Balance - Austin, TX (Austin) - Jan 30-Feb  1, 2015">Balance - Austin, TX (Austin) - Jan 30-Feb  1, 2015</option><option value="Balance - Washington, DC Metro (Silver Spring) - Feb 27-Mar  1, 2015">Balance - Washington, DC Metro (Silver Spring) - Feb 27-Mar  1, 2015</option><option value="Balance - Boston Metro, MA (Boston) - Mar  6-8, 2015">Balance - Boston Metro, MA (Boston) - Mar  6-8, 2015</option>
                                            </select>
                                        </div> 
                                        
                                        <div class="form-group">
                                            <label>Course 4: Process<br>
Process -- Course Dates</label>
                                            <select class="form-control">
<option value="">You have not made a course location selection.</option><option value="Process - Southern California (Culver City) - Jan  9-11, 2015">Process - Southern California (Culver City) - Jan  9-11, 2015</option><option value="Process - Calgary Metro,  AB (Calgary) - Jan  9-11, 2015">Process - Calgary Metro,  AB (Calgary) - Jan  9-11, 2015</option><option value="Process - Chicago Metro, IL (Chicago) - Jan  9-11, 2015">Process - Chicago Metro, IL (Chicago) - Jan  9-11, 2015</option><option value="Process - Vancouver Metro, BC (Vancouver) - Jan  9-11, 2015">Process - Vancouver Metro, BC (Vancouver) - Jan  9-11, 2015</option>
                                            </select>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Course 5: Synergy<br>
Synergy -- Course Dates
 </label>
                                            <select class="form-control">
<option value="">You have not made a course location selection.</option><option value="Synergy - Washington, DC Metro (Silver Spring) - Jan  9-11, 2015">Synergy - Washington, DC Metro (Silver Spring) - Jan  9-11, 2015</option><option value="Synergy - San Francisco Bay Area, CA (San Rafael) - Jan  9-11, 2015">Synergy - San Francisco Bay Area, CA (San Rafael) - Jan  9-11, 2015</option><option value="Synergy - Singapore (Singapore) - Jan 16-18, 2015">Synergy - Singapore (Singapore) - Jan 16-18, 2015</option><option value="Synergy - Denver Metro, CO (Denver) - Jan 16-18, 2015">Synergy - Denver Metro, CO (Denver) - Jan 16-18, 2015</option>
                                            </select>
                                        </div>                                                                                                                                                                    
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox"/>
                                                    Yes, I have read and agree to CTI Policies
                                                </label>
                                            </div>  
                                            
                                        <span class="input-group-btn">
                                            <button class="btn btn-info btn-flat" type="submit">Add to cart!</button>
                                        </span>                                                                                 

                                    </form>
                                </div><!-- /.box-body -->
                            </div>   
                        </div>                
                    </div>    
                    
					                    
                </section> <!-- /.content -->
              
                
            </aside> <!-- /.right-side -->
        </div> <!-- ./wrapper -->
      <!-- jQuery 2.0.2 -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <!-- DATA TABES SCRIPT -->
        <script src="js/plugins/datatables/jquery.dataTables.js" type="text/javascript"></script>
        <script src="js/plugins/datatables/dataTables.bootstrap.js" type="text/javascript"></script>
        <!-- AdminLTE App -->
        <script src="js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="js/AdminLTE/demo.js" type="text/javascript"></script>
        <!-- page script -->
        <script type="text/javascript">
            $(function() {
                $("#example1").dataTable();
                $('#example2').dataTable({
                    "bPaginate": true,
                    "bLengthChange": false,
                    "bFilter": false,
                    "bSort": true,
                    "bInfo": true,
                    "bAutoWidth": false
                });
            });
        </script>       
    </body>
</html>
