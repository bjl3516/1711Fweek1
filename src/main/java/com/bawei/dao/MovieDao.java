package com.bawei.dao;

import java.util.List;

import com.bawei.domain.Movie;
import com.bawei.vo.MovieVo;

public interface MovieDao {
    //Ä£ºý²éÑ¯
	List<Movie> selects(MovieVo movieVos);
}
