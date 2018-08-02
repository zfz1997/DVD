package com.iotek.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.iotek.dao.RecordDao;

public class RecordDaoImpl extends BaseDao implements RecordDao{
	
	public void delete() {
		// TODO Auto-generated method stub
		String sql="delete from records where id=1";
		jdbcTemplate.update(sql);
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
	    }
}
