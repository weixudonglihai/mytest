package com.itheima.service;

import java.sql.SQLException;

import com.itheima.dao.LinkmanDao;
import com.itheima.domain.Linkman;

public class LinkmanService {

	public void save(Linkman linkman) throws Exception {
		
	}

	public int link(Linkman linkman) throws SQLException {
		LinkmanDao dao = new LinkmanDao();
		return dao.link(linkman);
	}

}
