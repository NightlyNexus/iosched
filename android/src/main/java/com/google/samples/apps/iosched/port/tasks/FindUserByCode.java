package com.google.samples.apps.iosched.port.tasks;

import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by kgalligan on 8/23/14.
 */
public interface FindUserByCode
{
    @GET("/dataTest/findUserByCode/{code}")
    UserInfoResponse findUserByCode(@Path("code")String code);
}
