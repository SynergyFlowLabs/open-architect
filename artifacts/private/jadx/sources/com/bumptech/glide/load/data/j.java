package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class j implements d<InputStream> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f96322g = "HttpUrlFetcher";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f96323h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    static final b f96324i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f96325j = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.model.g f96326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f96327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f96328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f96329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f96330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f96331f;

    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(com.bumptech.glide.load.model.g gVar, int i10) {
        this(gVar, i10, f96324i);
    }

    private InputStream d(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f96330e = com.bumptech.glide.util.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable(f96322g, 3)) {
                httpURLConnection.getContentEncoding();
            }
            this.f96330e = httpURLConnection.getInputStream();
        }
        return this.f96330e;
    }

    private static boolean e(int i10) {
        if (i10 / 100 != 2) {
            return false;
        }
        boolean z10 = !true;
        return true;
    }

    private static boolean f(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream g(URL url, int i10, URL url2, Map<String, String> map) throws IOException {
        if (i10 >= 5) {
            throw new com.bumptech.glide.load.e("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new com.bumptech.glide.load.e("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f96329d = this.f96328c.a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f96329d.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f96329d.setConnectTimeout(this.f96327b);
        this.f96329d.setReadTimeout(this.f96327b);
        this.f96329d.setUseCaches(false);
        this.f96329d.setDoInput(true);
        this.f96329d.setInstanceFollowRedirects(false);
        this.f96329d.connect();
        this.f96330e = this.f96329d.getInputStream();
        if (this.f96331f) {
            return null;
        }
        int responseCode = this.f96329d.getResponseCode();
        if (e(responseCode)) {
            return d(this.f96329d);
        }
        if (!f(responseCode)) {
            if (responseCode == -1) {
                throw new com.bumptech.glide.load.e(responseCode);
            }
            throw new com.bumptech.glide.load.e(this.f96329d.getResponseMessage(), responseCode);
        }
        String headerField = this.f96329d.getHeaderField(com.google.common.net.d.f119539t0);
        if (TextUtils.isEmpty(headerField)) {
            throw new com.bumptech.glide.load.e("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        b();
        return g(url3, i10 + 1, url, map);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f96330e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f96329d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f96329d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(@NonNull com.bumptech.glide.h hVar, @NonNull d.a<? super InputStream> aVar) {
        long jB = com.bumptech.glide.util.g.b();
        try {
            try {
                aVar.d(g(this.f96326a.i(), 0, null, this.f96326a.e()));
                if (Log.isLoggable(f96322g, 2)) {
                    com.bumptech.glide.util.g.a(jB);
                }
            } catch (IOException e10) {
                aVar.e(e10);
                if (Log.isLoggable(f96322g, 2)) {
                    com.bumptech.glide.util.g.a(jB);
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable(f96322g, 2)) {
                com.bumptech.glide.util.g.a(jB);
            }
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f96331f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @l1
    j(com.bumptech.glide.load.model.g gVar, int i10, b bVar) {
        this.f96326a = gVar;
        this.f96327b = i10;
        this.f96328c = bVar;
    }
}
