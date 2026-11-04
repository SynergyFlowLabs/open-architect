package com.appsflyer.internal;

import androidx.media3.common.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum AFd1gSDK {
    TEXT("text/plain"),
    JSON("application/json"),
    OCTET_STREAM("application/octet-stream"),
    XML("application/xml"),
    HTML("text/html"),
    FORM("application/x-www-form-urlencoded"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG(s0.X0);


    @NotNull
    public final String getRevenue;

    static {
        int i10 = 7 ^ 5;
    }

    AFd1gSDK(String str) {
        this.getRevenue = str;
    }
}
