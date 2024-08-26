package iprep_core_java;

import java.util.HashMap;
import java.util.Map;

//Service interface
public interface Service {
	String getName();

	void execute();
}

//Concrete Service implementation
 class ServiceA implements Service {
	public String getName() {
		return "ServiceA";
	}

	public void execute() {
		System.out.println("Executing Service A");
	}
}

//Service Locator
class ServiceLocator {
	private static Map<String, Service> services = new HashMap<>();

	public static Service getService(String serviceName) {
		Service service = services.get(serviceName);
		if (service == null) {
			// Lazy initialization or lookup
			if (serviceName.equalsIgnoreCase("ServiceA")) {
				service = new ServiceA();
			}
			services.put(serviceName, service);
		}
		return service;
	}
}
