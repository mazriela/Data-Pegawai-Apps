package com.mazriela.pegawaiapps.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {

//    public static HttpLoggingInterceptor logging =
//            new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    public static OkHttpClient client = new OkHttpClient.Builder()
//            .addInterceptor(logging)
            .build();
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.122.1/server_pegawai/index.php/Api/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build();

    public static RestApi service = retrofit.create(RestApi.class);

}
