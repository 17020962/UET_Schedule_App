package com.example.uet_schedule.Presenter;

import com.example.uet_schedule.Model.Subject;
import com.example.uet_schedule.Model.SubjectMSSV;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface I_SubjectGetDataService {
    @GET ("/get-data-subject")
    Call<List<Subject>> getSubject();

    @Headers("Content-Type:application/x-www-form-urlencoded")
    @FormUrlEncoded
    @POST ("/get-data-subject-from-mssv")
    Call<List<SubjectMSSV>>  getSubjectMSSV(@Field("mssv") String mssv);
}
