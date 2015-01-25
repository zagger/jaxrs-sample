package servlet;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest/*")
public class MyApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		//s.add(HelloWorldResource.class);
		s.add(ResponseJSON.class);
		return s;
	}
}
