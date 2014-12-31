
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
                                    <h3 class="box-title">Course</h3>
                                </div><!-- /.box-header -->
                                <!-- form start -->
                                <br>
                        
                                <ul class="nav nav-tabs">
                               
                                    <li  ><a href="#Courselist-tab" data-toggle="tab">Course List <i class="fa"></i></a></li>
 
                                    <li><a href="#Coursecreate-tab" data-toggle="tab">Create Course<i class="fa"></i></a></li>
                                    <li class="active"><a href="#Courseedit-tab" data-toggle="tab">Edit Course<i class="fa"></i></a></li>
                                    
                                </ul>											
                                        
 
    <div class="tab-content">
    <br>
    
    <div class="tab-pane  " id="Courselist-tab">
          <%@ include file="inc_course_list.jsp" %>
    </div>
        
    <div class="tab-pane" id="Coursecreate-tab">
   		<section class="content" style="background-color:#FFF;">
		<%@ include file="inc_course_create.jsp" %>
        </section>
    </div>

    <div class="tab-pane active" id="Courseedit-tab">
   		<section class="content" style="background-color:#FFF;">
		<%@ include file="inc_course_edit.jsp" %>
        </section>
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
        <!-- AdminLTE App -->
        <script src="js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="js/AdminLTE/demo.js" type="text/javascript"></script>        
    </body>
</html>
