import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Publisher {
    public static void main(String args[]){
        int port=9090;
        URI baseUri= UriBuilder.fromUri("http://localhost/").port(port).build();
        ResourceConfig resourceConfig=new ResourceConfig(StudentResources.class);
        JdkHttpServerFactory.createHttpServer(baseUri,resourceConfig,true);
        System.out.println("Hosting service at localhost:"+port);
    }
}
