package com.fpmislata.practicas.gerritjava;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Creado por Antonio Sáiz. Fecha: 01/02/2017.
 */

public interface GerritAPI {

    @GET("changes/")
    Call<List<Change>> loadChanges(@Query("q") String status);
}
