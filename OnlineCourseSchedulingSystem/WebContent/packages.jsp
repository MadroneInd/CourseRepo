<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Admin  | Packages</title>
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
                <%@ include file="sidebar_menu.jsp" %>
                <!-- /.sidebar -->
            </aside>

            <!-- Right side column. Contains the navbar and content of the page -->
            <aside class="right-side">  
              <section class="content"> 
                   <div class="row">
                        <div class="col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">Packages Options</h3>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive no-padding">
                                    <table class="table table-hover">
                                        <tr>
                                            <th>Package/Course Payment Description</th>
                                            <th>Availability</th>
                                            <th>Price</th>
                                            <th></th>
                                             
                                        </tr>
                                        <tr>
                                            <td><strong>*Starter: Co-Active Coaching Fundamentals Course Only</strong> <br>
Fundamentals — paid in full at the time of registration</td>
                                            <td>At any time</td>
                                            <td>$925</td>
                                            <td><a href="registration.jsp?pack_id=1"><span class="label label-success">Register Now!</span></a></td>
                                            
                                        </tr>
                                        <tr>
                                            <td><strong>Co-Active Coaching Skills Pathway (SAVE $1,520) Package A </strong>(Complete Core)
<br>Includes Fundamentals through Synergy</td>
                                            <td>Prior to Fundamentals</td>
                                            <td>$5,665 ($1,520 savings over à la carte)</td>
                                             <td><a href="registration.jsp?pack_id=2"><span class="label label-success">Register Now!</span></a></td>
                                             
                                        </tr>
                                        <tr>
                                            <td><strong>Certified Professional Co-Active Coach Pathway (SAVE $2,275) Package B </strong>(Complete Core plus Certification)<br>
Includes Fundamentals through Synergy and Certification</td>
                                            <td>Prior to Fundamentals</td>
                                            <td>$10,900 ($2,275 savings over à la carte)</td>
                                            <td><a href="registration.jsp?pack_id=3"><span class="label label-success">Register Now!</span></a></td>
                                             
                                        </tr>
 
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        </div>
                    </div>
                    
					<div class="row">
                        <div class="col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">à la carte Options</h3>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive no-padding">
                                    <table class="table table-hover">
                                        <tr>
                                            <th>Package/Course Payment Description</th>
                                            <th>Availability</th>
                                            <th>Price</th>
                                            <th></th>
                                             
                                        </tr>
                                        <tr>
                                            <td><strong>Fulfillment ($315 deposit)</td>
                                            <td>At any time</td>
                                            <td>$1,565</td>
                                            <td><a href="#"><span class="label label-success">Register Now!</span></a></td>
                                            
                                        </tr>
                                        <tr>
                                            <td><strong>Balance ($315 deposit)</strong></td>
                                            <td>Prior to Fundamentals</td>
                                            <td>$1,565</td>
                                             <td><a href="#"><span class="label label-success">Register Now!</span></a></td>
                                             
                                        </tr>
                                        <tr>
                                           <td><strong>Process ($315 deposit)</strong></td>
                                            <td>Prior to Fundamentals</td>
                                            <td>$1,565</td>
                                            <td><a href="#"><span class="label label-success">Register Now!</span></a></td>
                                        </tr>
 
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
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
