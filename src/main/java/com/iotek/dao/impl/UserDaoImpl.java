package com.iotek.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.iotek.dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao{
	
	public void query() {
		// TODO Auto-generated method stub
		String sql="select *from users";
		SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(sql);
		while(sqlRowSet.next()) {
			System.out.println(sqlRowSet.getInt(1) + "," + sqlRowSet.getString(2)+","+sqlRowSet.getString(3)+","+sqlRowSet.getInt(4));
		}
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
	    }
}
