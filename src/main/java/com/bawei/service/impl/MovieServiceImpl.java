package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.MovieDao;
import com.bawei.domain.Movie;
import com.bawei.service.MovieService;
import com.bawei.vo.MovieVo;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao dao;
	
	@Override
	public List<Movie> selects(MovieVo movievo) {
		// TODO Auto-generated method stub
		return dao.selects(movievo);
	}

}
