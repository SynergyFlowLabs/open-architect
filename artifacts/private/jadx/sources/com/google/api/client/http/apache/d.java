package com.google.api.client.http.apache;

import com.google.api.client.util.h0;
import com.google.api.client.util.m0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* JADX INFO: loaded from: classes4.dex */
final class d extends AbstractHttpEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f115578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f115579b;

    d(long j10, m0 m0Var) {
        this.f115578a = j10;
        this.f115579b = (m0) h0.d(m0Var);
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.f115578a;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        if (this.f115578a != 0) {
            this.f115579b.writeTo(outputStream);
        }
    }
}
