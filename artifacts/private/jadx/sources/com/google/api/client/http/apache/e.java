package com.google.api.client.http.apache;

import com.google.api.client.util.h0;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* JADX INFO: loaded from: classes4.dex */
final class e extends HttpEntityEnclosingRequestBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f115580a;

    public e(String str, String str2) {
        this.f115580a = (String) h0.d(str);
        setURI(URI.create(str2));
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.f115580a;
    }
}
