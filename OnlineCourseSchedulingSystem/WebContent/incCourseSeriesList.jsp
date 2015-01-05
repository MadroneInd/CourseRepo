             <%@ page import="java.util.List"%>
             <%@ page import="com.ocms.entity.CourseSeries"%>
             <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
              <section class="content" style="background-color:#FFF;">
                    <div class="row">
                     
                        <div class="col-xs-12">
                            <div class="box box-primary">
                              
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Course Series</th>                                              
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <%List<String> courseSeriesList = (List)request.getAttribute("courseSeriesList");%>
                                            <c:forEach items="${courseSeriesList}" var="courseSeriesList">
                                            <tr>
                                                <td><a data-toggle="modal" data-target="#exampleModal" data-whatever="ATL-LOCATION-01"><c:out value="${courseSeriesList}" /></a>
                                               
                                                </td>
                                                                
                                            </tr>
                                            </c:forEach> 
                                        </tbody>
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        </div>
                    </div>

                </section><!-- /.content --> 