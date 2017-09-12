/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildflyswarm1;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author sihai
 */
@ApplicationPath("api")
public class RestConfig extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> ret = new HashSet<>();
        ret.add(HelloController.class);
        return ret;
    }
    
}
