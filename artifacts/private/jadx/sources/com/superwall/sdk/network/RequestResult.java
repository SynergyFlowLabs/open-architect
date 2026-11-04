package com.superwall.sdk.network;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class RequestResult {
    private final double duration;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final String requestId;
    private final int responseCode;

    @NotNull
    private final String responseMessage;

    public RequestResult(@NotNull String requestId, int i10, @NotNull String responseMessage, double d10, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.requestId = requestId;
        this.responseCode = i10;
        this.responseMessage = responseMessage;
        this.duration = d10;
        this.headers = headers;
    }

    public final double getDuration() {
        return this.duration;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    @NotNull
    public final String getResponseMessage() {
        return this.responseMessage;
    }
}
