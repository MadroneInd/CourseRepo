<%@ page import="com.ocms.entity.Course"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <form id="courseForm" action="/OnlineCourseSchedulingSystem/courseUpdate" method="post">
 <div class="row">
                        <!-- left column -->
                        <div class="col-md-6">
                            <!-- general form elements -->
                            <div class="box box-primary">

                                <!-- form start -->
                               
                                    <div class="box-body">
                                    	<div class="form-group">
											<div class="row">
											<%Course course = (Course)request.getAttribute("course");%>
                                                <div class="col-xs-6">
                                                	<label for="Course Name">Name</label>
                                                    <input type="text" value="${course.name}" placeholder="Enter the Name"  name="name"  class="form-control">
                                                    <input type="hidden" value="${course.id}" placeholder="Enter the Name"  name="id"  class="form-control">
                                                </div>
                                                <div class="col-xs-6">
                                                	<label for="Course Code">Code</label>
                                                    <input type="text" value="${course.code}" name="code" placeholder="Enter the code" class="form-control">
                                                </div>                                                
                                            </div> 
                                         </div>       
                                        <div class="form-group">
                                            <label for="Course Duration">Duration</label>
                                           <input type="text" value="${course.duration}" class="form-control" name="duration" id="location_name" placeholder="Enter the Duration ">                                 </div>
                            <div class="box-footer">
                            	<button type="submit" class="btn btn-primary">Save</button>
                                 <button type="submit" class="btn btn-primary">Cancel</button>
                                 
                            </div> 
                           
                        </div><!-- /.box -->
                        </div><!--/.col (left) -->

                   		 </div>   <!-- /.left -->
                         </div>
                         </form>
                   