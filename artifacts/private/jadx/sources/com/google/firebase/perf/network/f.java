package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes5.dex */
public class f<T> implements ResponseHandler<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ResponseHandler<? extends T> f124069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Timer f124070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f124071c;

    public f(ResponseHandler<? extends T> responseHandler, Timer timer, i iVar) {
        this.f124069a = responseHandler;
        this.f124070b = timer;
        this.f124071c = iVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f124071c.y(this.f124070b.c());
        this.f124071c.p(httpResponse.getStatusLine().getStatusCode());
        Long lA = h.a(httpResponse);
        if (lA != null) {
            this.f124071c.w(lA.longValue());
        }
        String strB = h.b(httpResponse);
        if (strB != null) {
            this.f124071c.v(strB);
        }
        this.f124071c.b();
        return this.f124069a.handleResponse(httpResponse);
    }
}
