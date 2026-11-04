package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1hSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class HttpException extends IOException {
    private final AFd1hSDK getRevenue;

    public HttpException(@NonNull Throwable th2, @NonNull AFd1hSDK aFd1hSDK) {
        super(th2.getMessage(), th2);
        this.getRevenue = aFd1hSDK;
    }

    @NonNull
    public AFd1hSDK getMetrics() {
        return this.getRevenue;
    }
}
