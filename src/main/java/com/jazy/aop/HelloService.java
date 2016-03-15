package com.jazy.aop;

public class HelloService implements IHelloService {
	
	private String db;
	
	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	private Integer port;
	
	public HelloService(){
		System.out.println("Constructor: HelloService()");
		System.out.println("db=" + db + ", port=" + port);
	}
	
	public HelloService(String db, Integer port){
		System.out.println("Constructor: HelloService(String db, Integer port)");
		System.out.println("db=" + db + ", port=" + port);
		this.db = db;
		this.port = port;
	}
	
	public HelloService(String db, String port){
		System.out.println("Constructor: HelloService(String db, String port)");
		System.out.println("db=" + db + ", port=" + port);
		this.db = db;		
		this.port = new Integer(port);
	}

	@Override
	public void sayHello(String name) {
		this.init();
		System.out.println("---------------------------------------------");
		System.out.println("DB:" + this.db);
		System.out.println("Port:" + this.port);
		System.out.println("Nice to meet you, " + name);
	}

	@Override
	public void sayBye() {
		this.init();
		System.out.println("---------------------------------------------");
		System.out.println("Bye bye!");
	}
	
	protected void init(){		
		System.out.println("system is initing.....");
	}
}
