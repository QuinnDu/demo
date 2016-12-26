package com.demo.dwr;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Component;

@Component(value="dwrDemo")
@RemoteProxy
public class DwrDemo {
	
	@RemoteMethod
	public String sayHello(){
		return "hello dwr!";
	}
}
