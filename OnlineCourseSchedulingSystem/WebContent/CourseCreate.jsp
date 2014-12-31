<!DOCTYPE html>
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
                                    <h3 class="box-title">Course CREATE</h3>
                                </div><!-- /.box-header -->
                                <!-- form start -->
                                <br>
                        
                                <ul class="nav nav-tabs">
                                    <li><a href="#Contacts-tab" data-toggle="tab">Course List <i class="fa"></i></a></li>
                                    <li><a href="#Faculty-tab" data-toggle="tab">Faculty <i class="fa"></i></a></li>
                                    <li><a href="#Events-tab" data-toggle="tab">Events <i class="fa"></i></a></li>
                                    <li><a href="#Locations-tab" data-toggle="tab">Locations <i class="fa"></i></a></li>
                                    <li><a href="#Faculty-tab" data-toggle="tab">Faculty <i class="fa"></i></a></li>
                                    <li><a href="#Sales-tab" data-toggle="tab">Sales <i class="fa"></i></a></li>
                                    <li><a href="#Setup-tab" data-toggle="tab">Setup <i class="fa"></i></a></li>
                                    <li class="active"><a href="#CS-tab" data-toggle="tab">Create Course<i class="fa"></i></a></li>
                                    
                                </ul>											
                                        
<form id="accountForm" method="post" class="form-horizontal">
    <div class="tab-content">
    <br>
    <div class="tab-pane" id="Contacts-tab">
           Coming Soon
    </div>
        <div class="tab-pane" id="Faculty-tab">
           Coming Soon
    </div>
        <div class="tab-pane" id="Events-tab">
           Coming Soon
    </div>
        <div class="tab-pane" id="Locations-tab">
           Coming Soon
    </div>
        <div class="tab-pane" id="Faculty-tab">
           Coming Soon
    </div>
        <div class="tab-pane" id="Sales-tab">
           Coming Soon
    </div>
        <div class="tab-pane" id="Setup-tab">
           Coming Soon
    </div>
    
        <div class="tab-pane active" id="CS-tab">

        
        
            <div class="form-group">
                <label class="col-lg-3 control-label">Course Name</label>
                <div class="col-lg-5">
                    <input type="text" class="form-control" name="fullName" value="2" />
                </div>
            </div>
			<div class="form-group">
                <label class="col-lg-3 control-label">Course Code</label>
                <div class="col-lg-5">
                    <input type="text" class="form-control" name="company" />                  
                </div>
            </div>            
            <div class="form-group">
                <label class="col-lg-3 control-label">Course Duration</label>
                <div class="col-lg-5">
                    <input type="text" class="form-control" name="company" />
                </div>
            </div>
            
            
<div class="form-group">
        <div class="col-lg-5 col-lg-offset-3">
            <button type="submit" class="btn btn-default">Create</button>&nbsp;<button type="submit" class="btn btn-default">Cancel</button>
        </div>
    </div>            
                     
        </div>

        
    </div>

    
    <br>
</form>
                                   
                                
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
        <!-- AdminLTE App -->
        <script src="js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="js/AdminLTE/demo.js" type="text/javascript"></script>        
    </body>
</html>
