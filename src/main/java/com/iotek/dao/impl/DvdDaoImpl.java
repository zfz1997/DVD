package com.iotek.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.iotek.dao.DvdDao;

public class DvdDaoImpl extends BaseDao implements DvdDao {
	
	public void insert() {
		// TODO Auto-generated method stub
		String sql="insert into dvds(id,dname,dcount,status) values(12,'全职猎人',0,1)";
		 jdbcTemplate.update(sql);
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
	    }
}
