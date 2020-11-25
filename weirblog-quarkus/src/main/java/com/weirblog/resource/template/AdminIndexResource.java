package com.weirblog.resource.template;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.api.ResourcePath;

@ApplicationScoped
@Path("admin/index")
@Produces(MediaType.TEXT_HTML)
public class AdminIndexResource {

	@ResourcePath("admin/layout/north.html") 
    Template north;
    @ResourcePath("admin/layout/south.html") 
    Template south;
    @ResourcePath("admin/layout/welcome.html") 
    Template welcome;
    @ResourcePath("admin/blog/main.html") 
    Template main;
    
    @GET
    @Path("toAdmin")
    public TemplateInstance getMain() {
        return main.data(null);  
    }
    @GET
    @Path("north")
    public TemplateInstance getNorth() {
    	return north.data(null);
    }
    @GET
    @Path("south")
    public TemplateInstance getSouth() {
    	return south.data(null);
    }
    @GET
    @Path("welcome")
    public TemplateInstance getWelcom() {
    	return welcome.data(null);
    }
    
}
