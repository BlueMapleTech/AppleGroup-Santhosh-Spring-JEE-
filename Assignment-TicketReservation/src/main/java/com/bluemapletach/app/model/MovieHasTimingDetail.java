package com.bluemapletach.app.model;

public class MovieHasTimingDetail {
private int movieid;
private int timingid;
private int movie_movie_id;
private int timing_timing_id;

public int getMovie_movie_id() {
	return movie_movie_id;
}
public void setMovie_movie_id(int movie_movie_id) {
	this.movie_movie_id = movie_movie_id;
}
public int getTiming_timing_id() {
	return timing_timing_id;
}
public void setTiming_timing_id(int timing_timing_id) {
	this.timing_timing_id = timing_timing_id;
}
public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public int getTimingid() {
	return timingid;
}
public void setTimingid(int timingid) {
	this.timingid = timingid;
}
@Override
public String toString() {
	return "MovieHasTimingDetail [timing_timing_id=" + timing_timing_id + "]";
}

}
