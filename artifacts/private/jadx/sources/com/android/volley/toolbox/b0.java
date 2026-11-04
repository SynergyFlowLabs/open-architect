package com.android.volley.toolbox;

import androidx.annotation.p0;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends com.android.volley.s<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f89516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    @p0
    private com.android.volley.v.b<String> f89517b;

    public b0(int i10, String str, com.android.volley.v.b<String> bVar, @p0 com.android.volley.v.a aVar) {
        super(i10, str, aVar);
        this.f89516a = new Object();
        this.f89517b = bVar;
    }

    @Override // com.android.volley.s
    public void cancel() {
        super.cancel();
        synchronized (this.f89516a) {
            try {
                this.f89517b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.s
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void deliverResponse(String str) {
        com.android.volley.v.b<String> bVar;
        synchronized (this.f89516a) {
            try {
                bVar = this.f89517b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bVar != null) {
            bVar.onResponse(str);
        }
    }

    @Override // com.android.volley.s
    protected com.android.volley.v<String> parseNetworkResponse(com.android.volley.o oVar) {
        String str;
        try {
            str = new String(oVar.f89471b, m.f(oVar.f89472c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(oVar.f89471b);
        }
        return com.android.volley.v.c(str, m.e(oVar));
    }

    public b0(String str, com.android.volley.v.b<String> bVar, @p0 com.android.volley.v.a aVar) {
        this(0, str, bVar, aVar);
    }
}
