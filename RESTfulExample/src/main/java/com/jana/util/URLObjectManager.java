package com.jana.util;

import org.apache.ibatis.session.SqlSession;

import com.jana.mapper.URLObjectMapper;
import com.jana.model.URLObject;

import java.util.List;

public class URLObjectManager {
	public static URLObject getAllURLObject() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory()
				.openSession();
		try {
			URLObjectMapper urlObjectMapper = sqlSession
					.getMapper(URLObjectMapper.class);

			return (URLObject) urlObjectMapper.getAllURLObject();
		} finally {
			sqlSession.close();
		}
	}
	
	public static void addURLObject(URLObject urlObject) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory()
				.openSession();
		try {
			URLObjectMapper urlObjectMapper = sqlSession
					.getMapper(URLObjectMapper.class);

			urlObjectMapper.addURLObject(urlObject);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public static URLObject getURLObjectById(int id) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory()
				.openSession();
		try {
			URLObjectMapper urlObjectMapper = sqlSession
					.getMapper(URLObjectMapper.class);

			return (URLObject) urlObjectMapper.getURLObjectById(id);
		} finally {
			sqlSession.close();
		}
	}
}
