package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.domain.Movie;
import com.bawei.service.MovieService;
import com.bawei.vo.MovieVo;

@Controller
public class MovieController {
	@Resource
	private MovieService service;
	@RequestMapping("selects")
	public String list(MovieVo movievo,Model m) {
		List<Movie> list=service.selects(movievo);
		m.addAttribute("list",list);
		return "list";
	}
}