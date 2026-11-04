package com.google.api.client.http.javanet;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Proxy f115640a;

    public b() {
        this(null);
    }

    @Override // com.google.api.client.http.javanet.a
    public HttpURLConnection a(URL url) throws IOException {
        Proxy proxy = this.f115640a;
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(proxy == null ? url.openConnection() : url.openConnection(proxy)));
    }

    public b(Proxy proxy) {
        this.f115640a = proxy;
    }
}
