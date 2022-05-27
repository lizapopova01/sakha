package com.example.saha.database;


import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LessonService {
    @GET("lessons")
    Call<List<Lesson>> listLessons();

    @GET("lessons/{lessonId}")
    Call<Lesson> detailLesson(@Path("lessonId") String lessonId);
}
