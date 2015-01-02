             <%@ page import="java.util.List"%>
             <%@ page import="com.ocms.entity.Location"%>
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
                                                <th>City</th>
                                                <th>State</th>
                                                <th>Country Region</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%List<Location> locationList = (List)session.getAttribute("locationList");%>
                                            <c:forEach items="${locationList}" var="location">
                                       
                                            <tr>
                                                <td><c:out value="${location.getName()}"/></td>
                                                <td><c:out value="${location.getCode()}"/></td>
                                                <td><c:out value="${location.getCity()}"/></td>
                                                <td><c:out value="${location.getState()}"/></td>
                                                <td><c:out value="${location.getCountry()} ${location.getRegion()}"/></td>          
                                            </tr>
                                            </c:forEach>                                           
                                           
                                        </tbody>
                                       
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        </div>
                    </div>

                </section><!-- /.content --> 