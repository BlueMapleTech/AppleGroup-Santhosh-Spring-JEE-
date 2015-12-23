package com.bluemapletach.app.Dao;

import java.util.List;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.MovieHasTimingDetail;

public interface MovieHasTimingDaoInterface {

	void movieHasTiming(MovieDetail movie);

	List<MovieHasTimingDetail> listOfMovieTiming(MovieHasTimingDetail timing);

}
