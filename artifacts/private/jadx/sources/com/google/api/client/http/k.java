package com.google.api.client.http;

import com.google.api.client.util.k0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.api.client.util.c f115658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k0 f115659b = k0.f116095a;

    public k(com.google.api.client.util.c cVar) {
        this.f115658a = (com.google.api.client.util.c) com.google.api.client.util.h0.d(cVar);
    }

    @Override // com.google.api.client.http.r
    public boolean a(u uVar, boolean z10) throws IOException {
        if (!z10) {
            return false;
        }
        try {
            return com.google.api.client.util.d.a(this.f115659b, this.f115658a);
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public final com.google.api.client.util.c b() {
        return this.f115658a;
    }

    public final k0 c() {
        return this.f115659b;
    }

    public k d(k0 k0Var) {
        this.f115659b = (k0) com.google.api.client.util.h0.d(k0Var);
        return this;
    }
}
