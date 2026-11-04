package com.google.api.client.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements w, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f115587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f115588b;

    public d(String str, String str2) {
        this.f115587a = (String) com.google.api.client.util.h0.d(str);
        this.f115588b = (String) com.google.api.client.util.h0.d(str2);
    }

    @Override // com.google.api.client.http.p
    public void a(u uVar) throws IOException {
        uVar.j().j0(this.f115587a, this.f115588b);
    }

    @Override // com.google.api.client.http.w
    public void b(u uVar) throws IOException {
        uVar.L(this);
    }

    public String c() {
        return this.f115588b;
    }

    public String d() {
        return this.f115587a;
    }
}
