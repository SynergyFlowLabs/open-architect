package com.google.api.client.http;

import com.google.api.client.util.m0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f115665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f115666b;

    public o(m0 m0Var, n nVar) {
        this.f115665a = (m0) com.google.api.client.util.h0.d(m0Var);
        this.f115666b = (n) com.google.api.client.util.h0.d(nVar);
    }

    public m0 b() {
        return this.f115665a;
    }

    public n d() {
        return this.f115666b;
    }

    @Override // com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f115666b.a(this.f115665a, outputStream);
    }
}
