package com.segment.analytics.kotlin.core;

import java.io.IOException;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends q {
    @Override // com.segment.analytics.kotlin.core.q
    @NotNull
    public HttpURLConnection c(@NotNull String apiHost) throws IOException {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        HttpURLConnection httpURLConnectionA = a("https://" + apiHost + "/m");
        httpURLConnectionA.setRequestProperty("Content-Type", "text/plain");
        httpURLConnectionA.setDoOutput(true);
        httpURLConnectionA.setChunkedStreamingMode(0);
        return httpURLConnectionA;
    }
}
