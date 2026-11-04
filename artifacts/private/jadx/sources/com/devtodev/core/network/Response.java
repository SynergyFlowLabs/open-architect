package com.devtodev.core.network;

import com.devtodev.core.utils.log.CoreLog;

/* JADX INFO: loaded from: classes3.dex */
public class Response {
    public static final int CODE_OK = 200;
    public static final String TAG = "Response";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98333c;

    public Response(int i10, String str) {
        this.f98331a = i10;
        this.f98332b = str;
        CoreLog.d("DevToDev", "Request send. Code: " + i10);
    }

    public String getRedirectUrl() {
        return this.f98333c;
    }

    public int getResponseCode() {
        return this.f98331a;
    }

    public String getResponseMessage() {
        return this.f98332b;
    }

    public void setRedirectUrl(String str) {
        this.f98333c = str;
    }

    public String toString() {
        return "Code: " + this.f98331a + " Message: " + this.f98332b;
    }
}
