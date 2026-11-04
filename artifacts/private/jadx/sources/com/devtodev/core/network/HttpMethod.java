package com.devtodev.core.network;

/* JADX INFO: loaded from: classes3.dex */
public enum HttpMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    HEAD("HEAD"),
    DELETE("DELETE"),
    TRACE("TRACE"),
    OPTIONS("OPTIONS"),
    CONNECT("CONNECT"),
    PATCH("PATCH");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98324a;

    HttpMethod(String str) {
        this.f98324a = str;
    }

    public String getMethodName() {
        return this.f98324a;
    }
}
