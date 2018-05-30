package com.front.movie.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.front.movie.dao.MovieBackstageDaoImpl;
import com.front.movie.dao.MovieDaoImpl;
import com.front.movie.entity.Movie;

@Service
public class MovieBackstageServiceImpl {
	
	@Resource
	private MovieBackstageDaoImpl mbdi;
	@Resource
	private MovieDaoImpl mdi;
	
	/**
	 * 删除电影
	 * @author 闫相垠
	 * @param movie_id 电影id
	 */
	public void deleteMovie(int movie_id) {
		this.mbdi.deleteMovie(movie_id);
	}
	
	/**
	 * 修改电影名字
	 * @author 闫相垠
	 * @param movie_id 电影id
	 * @param name 电影名字
	 */
	public void changeMovieName(int movie_id,String name) {
		Movie movie = this.mdi.findMovieById(movie_id);
		
		this.mbdi.changeMovieName(movie, name);
	}
	
	/**
	 * 修改电影简介
	 * @author 闫相垠
	 * @param movie_id 电影id
	 * @param summary 电影简介
	 */
	public void changeMovieSummary(int movie_id,String summary) {
		Movie movie = this.mdi.findMovieById(movie_id);
		
		this.mbdi.changeMovieSummary(movie, summary);
	}
	
	/**
	 * 修改电影时长
	 * @author 闫相垠
	 * @param movie 电影
	 * @param time 时长
	 */
	public void changeMovieTime(int movie_id,int time) {
		Movie movie = this.mdi.findMovieById(movie_id);
		this.mbdi.changeMovieTime(movie, time);
	}
		
}
