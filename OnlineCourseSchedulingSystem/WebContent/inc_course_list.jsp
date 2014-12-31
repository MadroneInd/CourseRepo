             <%@ page import="java.util.List"%>
             <%@ page import="com.ocms.entity.Course"%>
             <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
              <section class="content" style="background-color:#FFF;">
                    <div class="row">
                        <div class="col-xs-12">
                            

                            <div class="box box-primary">
                               
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Name</th>
                                                <th>Code</th>
                                                <th>Duration</th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody>
                                            
                                            <%List<Course> courseList = (List)session.getAttribute("courseList");%>
                                            <c:forEach items="${courseList}" var="course">
                                       
                                            <tr>
                                                
                                                <td><a href=${pageContext.request.contextPath}/courseSelect?id=<c:out value="${course.getId()}"/>><c:out value="${course.getName()}" /></a></td>
                                                <td><c:out value="${course.getCode()}"/></td>
                                                <td><c:out value="${course.getDuration()}"/></td>   
                                            </tr>
                                            </c:forEach>                                                                                 
                                           
                                        </tbody>
                                     
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        </div>
                    </div>

                </section><!-- /.content --> 