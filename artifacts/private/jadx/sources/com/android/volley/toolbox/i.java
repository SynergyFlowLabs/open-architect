package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class i extends com.android.volley.s<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.android.volley.f f89559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f89560b;

    public i(com.android.volley.f fVar, Runnable runnable) {
        super(0, null, null);
        this.f89559a = fVar;
        this.f89560b = runnable;
    }

    @Override // com.android.volley.s
    protected void deliverResponse(Object obj) {
    }

    @Override // com.android.volley.s
    public com.android.volley.s.d getPriority() {
        return com.android.volley.s.d.IMMEDIATE;
    }

    @Override // com.android.volley.s
    public boolean isCanceled() {
        this.f89559a.clear();
        if (this.f89560b == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f89560b);
        return true;
    }

    @Override // com.android.volley.s
    protected com.android.volley.v<Object> parseNetworkResponse(com.android.volley.o oVar) {
        return null;
    }
}
