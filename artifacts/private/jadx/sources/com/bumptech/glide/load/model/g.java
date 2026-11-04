package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class g implements com.bumptech.glide.load.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f96833j = "@#&=*+-_.,:!?()/~'%;$";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f96834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final URL f96835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final String f96836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private String f96837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private URL f96838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private volatile byte[] f96839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f96840i;

    public g(URL url) {
        this(url, h.f96842b);
    }

    private byte[] d() {
        if (this.f96839h == null) {
            this.f96839h = c().getBytes(com.bumptech.glide.load.g.f96793b);
        }
        return this.f96839h;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f96837f)) {
            String string = this.f96836e;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) com.bumptech.glide.util.k.d(this.f96835d)).toString();
            }
            this.f96837f = Uri.encode(string, f96833j);
        }
        return this.f96837f;
    }

    private URL g() throws MalformedURLException {
        if (this.f96838g == null) {
            this.f96838g = new URL(f());
        }
        return this.f96838g;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f96836e;
        return str != null ? str : ((URL) com.bumptech.glide.util.k.d(this.f96835d)).toString();
    }

    public Map<String, String> e() {
        return this.f96834c.O();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (c().equals(gVar.c()) && this.f96834c.equals(gVar.f96834c)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return f();
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.f96840i == 0) {
            int iHashCode = c().hashCode();
            this.f96840i = iHashCode;
            this.f96840i = (iHashCode * 31) + this.f96834c.hashCode();
        }
        return this.f96840i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.f96842b);
    }

    public g(URL url, h hVar) {
        this.f96835d = (URL) com.bumptech.glide.util.k.d(url);
        this.f96836e = null;
        this.f96834c = (h) com.bumptech.glide.util.k.d(hVar);
    }

    public g(String str, h hVar) {
        this.f96835d = null;
        this.f96836e = com.bumptech.glide.util.k.b(str);
        this.f96834c = (h) com.bumptech.glide.util.k.d(hVar);
    }
}
