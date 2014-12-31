  <form id="courseForm" action="/OnlineCourseSchedulingSystem/CreateLocation" method="post">
 <div class="row">
                        <!-- left column -->
                        <div class="col-md-12">
                            <!-- general form elements -->
                            <div class="box box-primary">

                                <!-- form start -->
                                <form role="form">
                                    <div class="box-body">
                                    	<div class="form-group">
											<div class="row">
                                                <div class="col-xs-6">
                                                	<label for="exampleInputEmail1">Code</label>
                                                    <input type="text" value="" placeholder="Enter the code" name="code"  class="form-control">
                                                </div>
                                                <div class="col-xs-6">
                                                	<label for="exampleInputEmail1">Name</label>
                                                    <input type="text" value="" name="name" placeholder="Enter the name" class="form-control">
                                                </div>                                                
                                            </div> 
                                         </div>       
                                        <div class="form-group">
                                            <label for="exampleInputFile">Address Line1</label>
                                           <input type="text" value="" class="form-control" name="address_line1" id="address_line1" placeholder="Enter the address line1">                                 </div>
                                        <div class="form-group">
                                            <label for="exampleInputFile">Address Line1</label>
                                           <input type="text" value="" class="form-control" name="address_line2" id="address_line2" placeholder="Enter the address line2">
                                        </div>  
                                    	<div class="form-group">
											<div class="row">
                                                <div class="col-xs-4">
                                                	<label for="exampleInputEmail1">City</label>
                                                    <input type="text" value="" placeholder="Enter the City" name="city"   class="form-control">
                                                </div>
                                                <div class="col-xs-4">
                                                	<label for="exampleInputEmail1">State</label>
                                                    <input type="text" value="" name="state" placeholder="Enter the State" class="form-control">
                                                </div>
                                                <div class="col-xs-4">
                                                	<label for="exampleInputEmail1">Country</label>
                                                    <input type="text" value="" name="country" placeholder="Enter the country" class="form-control">
                                                </div>    
                                                <div class="col-xs-4">
                                                	<label for="exampleInputEmail1">Region</label>
                                                    <input type="text" value="" name="region" placeholder="Enter the region" class="form-control">
                                                </div> 
                                                <div class="col-xs-4">
                                                	<label for="exampleInputEmail1">Zipcode</label>
                                                    <input type="text" value="" name="zip" placeholder="Enter the Zipcode" class="form-control">
                                                </div>                                                                                                   
                                            </div> 
                                         </div>                                              
										<div class="form-group">
											<div class="row">
                                                <div class="col-xs-6">
                                                	<label for="exampleInputEmail1">Phone No.</label>
                                                    <input type="text" value="" placeholder="Enter the phone no." name="phone" class="form-control">
                                                    
                                                </div>
                                                <div class="col-xs-6">
                                                	<label for="exampleInputEmail1">Fax No.</label>
                                                    <input type="text" value="" name="fax" placeholder="Enter the Fax" class="form-control">
                                                </div> 
                                                <div class="col-xs-6">
                                                	<label for="exampleInputEmail1">Email</label>
                                                    <input type="text" value="" name="email" placeholder="Enter the email" class="form-control">
                                                </div>    
                                                                                                                                                
                                            </div> 
                                         </div>                                                                               
                                        <div class="form-group">
                                            <label for="exampleInputFile">Site URL</label>
                                           <input type="text" value="" class="form-control" name="url" id="url" placeholder="Enter the site link URL">                                
                                       </div>
                                                                                                                                                                       
									<h3 class="box-title">Primary Contact Info</h3>                                         
                                    <div class="box-body">
                                    	<div class="form-group">
											<div class="row">
                                                <div class="col-xs-2">
                                                	<label for="exampleInputEmail1">Title</label>
                                                    <input type="text" value="" name="ptitle" placeholder="Mr." class="form-control">
                                                </div>                                             
                                                <div class="col-xs-6">
                                                	<label for="exampleInputEmail1">Name</label>
                                                    <input type="text" value="" placeholder="Enter the name" name="pname"  class="form-control">
                                                </div>
                                               
                                            </div> 
                                         </div>  
										<div class="form-group">
											<div class="row">
                                                <div class="col-xs-4">
                                                	<label for="exampleInputEmail1">Phone No.</label>
                                                    <input type="text" value="" placeholder="Enter the Phone no." name="pphone"  class="form-control">
                                                </div>
                                                <div class="col-xs-4">
                                                	<label for="exampleInputEmail1">Fax</label>
                                                    <input type="text" value="" name="pfax" placeholder="Enter the Fax No." class="form-control">
                                                </div>                                                
                                            </div> 
                                         </div>                                                                                  
                                        <div class="form-group">
                                            <label for="exampleInputFile">Email</label>
                                           <input type="text" value="" class="form-control" name="pemail" id="pemail" placeholder="Enter the email ID">
                                        </div>                                           
                                    </div><!-- /.box-body -->
                                    
                                                                                                                                                                    
									<h3 class="box-title">Accounting Contact Info</h3>                                         
                                    <div class="box-body">
                                    	<div class="form-group">
											<div class="row">
                                                <div class="col-xs-2">
                                                	<label for="exampleInputEmail1">Title</label>
                                                    <input type="text" value="" name="stitle" placeholder="Mr." class="form-control">
                                                </div>                                             
                                                <div class="col-xs-6">
                                                	<label for="exampleInputEmail1">Name</label>
                                                    <input type="text" value="" placeholder="Enter the name" name="sname"  class="form-control">
                                                </div>
                                               
                                            </div> 
                                         </div>  
										<div class="form-group">
											<div class="row">
                                                <div class="col-xs-4">
                                                	<label for="exampleInputEmail1">Phone No.</label>
                                                    <input type="text" value="" placeholder="Enter the Phone no." name="sphone"  class="form-control">
                                                </div>
                                                <div class="col-xs-4">
                                                	<label for="exampleInputEmail1">Fax No.</label>
                                                    <input type="text" value="" name="sfax" placeholder="Enter the Fax no." class="form-control">
                                                </div>                                                
                                            </div> 
                                         </div>                                                                                  
                                        <div class="form-group">
                                            <label for="exampleInputFile">Email</label>
                                           <input type="text" value="" class="form-control" name="semail" id="semail" placeholder="Enter the email ID">
                                        </div>                                           
                                    </div><!-- /.box-body -->

										<div class="form-group">
                                            <label>Location Note</label>
                                            <textarea class="form-control" rows="3" placeholder="Enter ..." name="notes"></textarea>
                                        </div>                                   
                                </form>
                            
                            <div class="box-footer">
                            	<button type="submit" class="btn btn-primary">Create</button>
                                 <button type="submit" class="btn btn-primary">Cancel</button>
                                 
                            </div>    
                        </div><!-- /.box -->
                        </div><!--/.col (left) -->

                   		 </div>   <!-- /.left -->
                    </div><!-- /.row -->
            </form>