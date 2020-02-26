package com.bawei.service;

import java.util.List;

import com.bawei.domain.Movie;
import com.bawei.vo.MovieVo;

public interface MovieService {

	List<Movie> selects(MovieVo movievo);

}
