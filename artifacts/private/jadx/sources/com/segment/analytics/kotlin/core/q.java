package com.segment.analytics.kotlin.core;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class q {
    @NotNull
    public HttpURLConnection a(@NotNull String url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(201000);
            httpURLConnection.setRequestProperty(com.google.common.net.d.P, "analytics-kotlin/1.19.2");
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (MalformedURLException e10) {
            IOException iOException = new IOException("Attempted to use malformed url: " + url, e10);
            k.c(a.Companion, iOException);
            throw iOException;
        }
    }

    @NotNull
    public HttpURLConnection b(@NotNull String cdnHost, @NotNull String writeKey) throws IOException {
        Intrinsics.checkNotNullParameter(cdnHost, "cdnHost");
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        HttpURLConnection httpURLConnectionA = a("https://" + cdnHost + "/projects/" + writeKey + "/settings");
        httpURLConnectionA.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        int responseCode = httpURLConnectionA.getResponseCode();
        if (responseCode == 200) {
            return httpURLConnectionA;
        }
        httpURLConnectionA.disconnect();
        throw new IOException("HTTP " + responseCode + ": " + httpURLConnectionA.getResponseMessage());
    }

    @NotNull
    public HttpURLConnection c(@NotNull String apiHost) throws IOException {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        HttpURLConnection httpURLConnectionA = a("https://" + apiHost + "/b");
        httpURLConnectionA.setRequestProperty("Content-Type", "text/plain");
        httpURLConnectionA.setRequestProperty(com.google.common.net.d.f119476b0, "gzip");
        httpURLConnectionA.setDoOutput(true);
        httpURLConnectionA.setChunkedStreamingMode(0);
        return httpURLConnectionA;
    }
}
