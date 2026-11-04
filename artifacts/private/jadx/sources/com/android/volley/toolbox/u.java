package com.android.volley.toolbox;

import androidx.annotation.p0;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u<T> extends com.android.volley.s<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final String f89630d = "utf-8";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f89631e = String.format("application/json; charset=%s", f89630d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f89632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    @p0
    private com.android.volley.v.b<T> f89633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final String f89634c;

    @Deprecated
    public u(String str, String str2, com.android.volley.v.b<T> bVar, com.android.volley.v.a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    @Override // com.android.volley.s
    public void cancel() {
        super.cancel();
        synchronized (this.f89632a) {
            try {
                this.f89633b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.android.volley.s
    protected void deliverResponse(T t10) {
        com.android.volley.v.b<T> bVar;
        synchronized (this.f89632a) {
            bVar = this.f89633b;
        }
        if (bVar != null) {
            bVar.onResponse(t10);
        }
    }

    @Override // com.android.volley.s
    public byte[] getBody() {
        try {
            String str = this.f89634c;
            if (str == null) {
                return null;
            }
            return str.getBytes(f89630d);
        } catch (UnsupportedEncodingException unused) {
            com.android.volley.b0.g("Unsupported Encoding while trying to get the bytes of %s using %s", this.f89634c, f89630d);
            return null;
        }
    }

    @Override // com.android.volley.s
    public String getBodyContentType() {
        return f89631e;
    }

    @Override // com.android.volley.s
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.s
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Override // com.android.volley.s
    protected abstract com.android.volley.v<T> parseNetworkResponse(com.android.volley.o oVar);

    public u(int i10, String str, @p0 String str2, com.android.volley.v.b<T> bVar, @p0 com.android.volley.v.a aVar) {
        super(i10, str, aVar);
        this.f89632a = new Object();
        this.f89633b = bVar;
        this.f89634c = str2;
    }
}
