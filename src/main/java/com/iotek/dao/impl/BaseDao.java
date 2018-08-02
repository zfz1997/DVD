package com.iotek.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {
	public JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
	    }
}
