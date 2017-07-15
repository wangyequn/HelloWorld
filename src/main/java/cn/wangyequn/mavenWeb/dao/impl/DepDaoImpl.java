package cn.wangyequn.mavenWeb.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.wangyequn.mavenWeb.dao.DepDao;
import cn.wangyequn.mavenWeb.domain.Dep;

public class DepDaoImpl extends HibernateDaoSupport implements DepDao{

	@Override
	public List<Dep> getList() {
		//应该是调用了父类的方法,不是很明白,下课看看
		return (List<Dep>) getHibernateTemplate().find("from Dep");
	}
}
