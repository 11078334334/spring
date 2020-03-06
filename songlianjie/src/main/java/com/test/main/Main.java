package com.test.main;

import com.test.app.Appconfig;
import com.test.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author songlj
 * @date 2020/2/19 23:02
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		final TestDao test = annotationConfigApplicationContext.getBean(TestDao.class);
 		test.query();

	}
}
