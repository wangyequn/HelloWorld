package cn.wangyequn.mavenWeb.service.impl;

import java.util.List;

import cn.wangyequn.mavenWeb.dao.DepDao;
import cn.wangyequn.mavenWeb.domain.Dep;
import cn.wangyequn.mavenWeb.service.DepService;

public class DepServiceImpl implements DepService {
	private DepDao depDao;

	public void setDepDao(DepDao depDao) {
		this.depDao = depDao;
	}

	@Override
	public List<Dep> getList() {
		System.out.println("运行到这里了");
		return depDao.getList();
	}

}
