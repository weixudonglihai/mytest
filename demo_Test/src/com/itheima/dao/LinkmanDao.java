package com.itheima.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.itheima.domain.Linkman;
import com.itheima.utils.DataSourceUtils;

public class LinkmanDao {

	public void save(Linkman l) throws SQLException {
		
	}

	public int link(Linkman linkman) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into linkman values(?,?,?,?,?,?)";
		Object[] params = {linkman.getLkm_id(),linkman.getLkm_name(),linkman.getLkm_gender(),linkman.getLkm_mobile(),linkman.getLkm_email(),linkman.getLkm_qq()};
		return qr.update(sql,params);
	}

}
