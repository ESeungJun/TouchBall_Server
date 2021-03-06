package com.seungjun.touchball;

import java.nio.charset.Charset;

import javax.servlet.Filter;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
@MapperScan(value= {"com.seungjun.touchball.mapper"})
public class TouchballApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouchballApplication.class, args);
	}

	@Bean
	public HttpMessageConverter<String> responseBodyConverter() {
		return new StringHttpMessageConverter(Charset.forName("UTF-8"));
	}
	
	@Order(Ordered.HIGHEST_PRECEDENCE)
	@Bean
	public Filter characterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return filter;
	}

	
	/**    * SqlSessionFactory ����     */  
	@Bean   
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{      
	   SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();     
	   sessionFactory.setDataSource(dataSource);    
	   Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml");           
	   sessionFactory.setMapperLocations(res);   
	   
	   	return sessionFactory.getObject();   
	}
}
