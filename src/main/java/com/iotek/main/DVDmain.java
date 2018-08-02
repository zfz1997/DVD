package com.iotek.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iotek.dao.impl.BaseDao;
import com.iotek.dao.impl.DvdDaoImpl;
import com.iotek.dao.impl.RecordDaoImpl;
import com.iotek.dao.impl.UserDaoImpl;

public class DVDmain {
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	BaseDao baseDao=(BaseDao)context.getBean("BaseDao");
    	DvdDaoImpl dvdDaoImp=(DvdDaoImpl)context.getBean("daoImpl");
    	RecordDaoImpl recordDaoImpl=(RecordDaoImpl)context.getBean("daoImpl2");
        UserDaoImpl userDaoImpl=(UserDaoImpl)context.getBean("daoImpl3");
        userDaoImpl.query();
        //dvdDaoImp.insert();
        //recordDaoImpl.delete();
	}
}
