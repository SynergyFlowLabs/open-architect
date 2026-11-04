package com.google.api.client.http.apache;

import com.google.api.client.http.f0;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;

/* JADX INFO: loaded from: classes4.dex */
final class b extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpRequestBase f115571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpResponse f115572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Header[] f115573c;

    b(HttpRequestBase httpRequestBase, HttpResponse httpResponse) {
        this.f115571a = httpRequestBase;
        this.f115572b = httpResponse;
        this.f115573c = httpResponse.getAllHeaders();
    }

    @Override // com.google.api.client.http.f0
    public void a() {
        this.f115571a.abort();
    }

    @Override // com.google.api.client.http.f0
    public InputStream b() throws IOException {
        HttpEntity entity = this.f115572b.getEntity();
        if (entity == null) {
            return null;
        }
        return entity.getContent();
    }

    @Override // com.google.api.client.http.f0
    public String c() {
        Header contentEncoding;
        HttpEntity entity = this.f115572b.getEntity();
        if (entity == null || (contentEncoding = entity.getContentEncoding()) == null) {
            return null;
        }
        return contentEncoding.getValue();
    }

    @Override // com.google.api.client.http.f0
    public long d() {
        HttpEntity entity = this.f115572b.getEntity();
        if (entity == null) {
            return -1L;
        }
        return entity.getContentLength();
    }

    @Override // com.google.api.client.http.f0
    public String e() {
        Header contentType;
        HttpEntity entity = this.f115572b.getEntity();
        if (entity == null || (contentType = entity.getContentType()) == null) {
            return null;
        }
        return contentType.getValue();
    }

    @Override // com.google.api.client.http.f0
    public int f() {
        return this.f115573c.length;
    }

    @Override // com.google.api.client.http.f0
    public String g(int i10) {
        return this.f115573c[i10].getName();
    }

    @Override // com.google.api.client.http.f0
    public String h(int i10) {
        return this.f115573c[i10].getValue();
    }

    @Override // com.google.api.client.http.f0
    public String i() {
        StatusLine statusLine = this.f115572b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.getReasonPhrase();
    }

    @Override // com.google.api.client.http.f0
    public int j() {
        StatusLine statusLine = this.f115572b.getStatusLine();
        if (statusLine == null) {
            return 0;
        }
        return statusLine.getStatusCode();
    }

    @Override // com.google.api.client.http.f0
    public String k() {
        StatusLine statusLine = this.f115572b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.toString();
    }

    public String l(String str) {
        return this.f115572b.getLastHeader(str).getValue();
    }
}
