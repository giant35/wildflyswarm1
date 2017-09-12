/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildflyswarm1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author sihai
 */
@Path("/hello")
public class HelloController {

    @Path("/msg")
    @GET
    public String msg(@QueryParam("id") int id) {
        return "hello " + id;
    }
}
