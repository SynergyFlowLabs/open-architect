package com.google.api.client.testing.http.javanet;

import com.google.api.client.util.f;
import com.google.api.client.util.h0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@f
public class a extends HttpURLConnection {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final byte[] f116002f = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final byte[] f116003g = new byte[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f116004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OutputStream f116005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f116006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InputStream f116007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, List<String>> f116008e;

    public a(URL url) {
        super(url);
        this.f116005b = new ByteArrayOutputStream(0);
        this.f116006c = null;
        this.f116007d = null;
        this.f116008e = new LinkedHashMap();
    }

    public a a(String str, String str2) {
        h0.d(str);
        h0.d(str2);
        if (this.f116008e.containsKey(str)) {
            this.f116008e.get(str).add(str2);
            return this;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        this.f116008e.put(str, arrayList);
        return this;
    }

    public final boolean b() {
        return this.f116004a;
    }

    public a c(InputStream inputStream) {
        h0.d(inputStream);
        if (this.f116007d == null) {
            this.f116007d = inputStream;
        }
        return this;
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
    }

    public a d(InputStream inputStream) {
        h0.d(inputStream);
        if (this.f116006c == null) {
            this.f116006c = inputStream;
        }
        return this;
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
    }

    public a e(OutputStream outputStream) {
        this.f116005b = outputStream;
        return this;
    }

    public a f(int i10) {
        boolean z10;
        if (i10 >= -1) {
            z10 = true;
            int i11 = (-1) | 1;
        } else {
            z10 = false;
        }
        h0.a(z10);
        ((HttpURLConnection) this).responseCode = i10;
        return this;
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f116007d;
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        List<String> list = this.f116008e.get(str);
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f116008e;
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        if (((HttpURLConnection) this).responseCode < 400) {
            return this.f116006c;
        }
        throw new IOException();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        OutputStream outputStream = this.f116005b;
        return outputStream != null ? outputStream : super.getOutputStream();
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return ((HttpURLConnection) this).responseCode;
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f116004a = true;
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return false;
    }
}
