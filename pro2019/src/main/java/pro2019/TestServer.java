package pro2019;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;

public class TestServer extends Service<Configuration>{

	@Override
	public void initialize(Bootstrap<Configuration> bootstrap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(Configuration configuration, Environment environment) throws Exception {
		// TODO Auto-generated method stub
		
		environment.addResource(TestResource.class);
		
	}

	public static void main(String[] args) throws Exception{
		new TestServer().run(args);
	}
}
