package com.infinite.sol.prepostactions;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PrePostActionsBean implements InitializingBean, DisposableBean{

	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void destroy() throws Exception {
		System.out.println("PrePostActionsBean -> destroy -> cleaning up all resouces!!!");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("PrePostActionsBean -> afterPropertiesSet -> on startup invoked after all properties set for this bean. Current value for msg = "+ msg);
	}

	public void customInitMethod(){
		
		System.out.println("PrePostActionsBean -> customInitMethod invoked");
	}
	
	public void customDestroyMethod(){
		System.out.println("PrePostActionsBean -> customDestroyMethod invoked");
	}
}
