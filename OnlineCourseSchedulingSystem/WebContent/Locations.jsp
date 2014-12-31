<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Admin  | Locations</title>
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
                        <!-- left column -->
                        <div class="col-md-10"> 
                            <!-- general form elements -->
                            <div class="box box-primary"> 
                                <div class="box-header">
                                    <h3 class="box-title">Locations</h3>
                                </div><!-- /.box-header -->
                                <!-- form start -->
                                <br>
                        
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#Locationslist-tab" data-toggle="tab">Locations List <i class="fa"></i></a></li>
                                    <li><a href="#Createlocation-tab" data-toggle="tab">Create Location <i class="fa"></i></a></li>
                                     
                                    
                                </ul>											
                                        
 
    <div class="tab-content">
    <br>
    
    <div class="tab-pane active" id="Locationslist-tab" >
                <!-- Main content -->
                <%@ include file="inc_location_list.jsp" %>
        
    </div> 


    <div class="tab-pane" id="Createlocation-tab">


                <!-- Main content -->
               
              <section class="content" style="background-color:#FFF;">
                   <%@ include file="inc_location_create.jsp" %>
                </section><!-- /.content -->
                 
    </div>

        
    </div>
    <br>
 
                                   
                                
                            </div> <!-- /.box -->

                        
                        </div> <!--/.col (left) -->
                      
                    </div>     <!-- /.row -->
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
