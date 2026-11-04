package com.google.api.client.http.apache;

import com.google.api.client.http.e0;
import com.google.api.client.http.f0;
import com.google.api.client.util.h0;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import java.io.IOException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes4.dex */
final class a extends e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HttpClient f115569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HttpRequestBase f115570f;

    a(HttpClient httpClient, HttpRequestBase httpRequestBase) {
        this.f115569e = httpClient;
        this.f115570f = httpRequestBase;
    }

    @Override // com.google.api.client.http.e0
    public void a(String str, String str2) {
        this.f115570f.addHeader(str, str2);
    }

    @Override // com.google.api.client.http.e0
    public f0 b() throws IOException {
        if (f() != null) {
            HttpRequestBase httpRequestBase = this.f115570f;
            h0.c(httpRequestBase instanceof HttpEntityEnclosingRequest, "Apache HTTP client does not support %s requests with content.", httpRequestBase.getRequestLine().getMethod());
            d dVar = new d(d(), f());
            dVar.setContentEncoding(c());
            dVar.setContentType(e());
            ((HttpEntityEnclosingRequest) this.f115570f).setEntity(dVar);
        }
        HttpRequestBase httpRequestBase2 = this.f115570f;
        return new b(httpRequestBase2, FirebasePerfHttpClient.execute(this.f115569e, httpRequestBase2));
    }

    @Override // com.google.api.client.http.e0
    public void k(int i10, int i11) throws IOException {
        HttpParams params = this.f115570f.getParams();
        ConnManagerParams.setTimeout(params, i10);
        HttpConnectionParams.setConnectionTimeout(params, i10);
        HttpConnectionParams.setSoTimeout(params, i11);
    }
}
