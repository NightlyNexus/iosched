package com.google.samples.apps.iosched.port.tasks;

import co.touchlab.android.superbus.errorcontrol.PermanentException;
import co.touchlab.android.superbus.errorcontrol.TransientException;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by kgalligan on 7/20/14.
 */
public interface AddRsvpRequest
{
    @POST("/dataTest/rsvpEvent/{eventId}")
    BasicIdResult addRsvp(@Path("eventId") Long eventId) throws TransientException, PermanentException;
}