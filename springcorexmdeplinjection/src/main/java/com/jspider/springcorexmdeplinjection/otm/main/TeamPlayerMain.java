package com.jspider.springcorexmdeplinjection.otm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexmdeplinjection.otm.bean.TeamBean;

public class TeamPlayerMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("TeamPlayerConfig.xml");
		TeamBean team1 =context.getBean(TeamBean.class);
		System.out.println(team1);
		((ClassPathXmlApplicationContext)context).close();
	}
}
