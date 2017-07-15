package cn.wangyequn.mavenWeb.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import cn.wangyequn.mavenWeb.domain.Dep;
import cn.wangyequn.mavenWeb.service.DepService;

public class DepAction {
	
	private DepService depService;

	public void setDepService(DepService depService) {
		this.depService = depService;
	}
	
	public String list(){
		List<Dep> list = depService.getList();
		System.out.println(list);
		ServletActionContext.getRequest().setAttribute("list", list);
		
		return "list";
	}
	
}
