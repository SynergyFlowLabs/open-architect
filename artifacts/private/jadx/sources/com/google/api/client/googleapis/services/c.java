package com.google.api.client.googleapis.services;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f115520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f115521b;

    public c() {
        this(null);
    }

    @Override // com.google.api.client.googleapis.services.d
    public void a(b<?> bVar) throws IOException {
        String str = this.f115520a;
        if (str != null) {
            bVar.put("key", str);
        }
        String str2 = this.f115521b;
        if (str2 != null) {
            bVar.put("userIp", str2);
        }
    }

    public final String b() {
        return this.f115520a;
    }

    public final String c() {
        return this.f115521b;
    }

    public c(String str) {
        this(str, null);
    }

    public c(String str, String str2) {
        this.f115520a = str;
        this.f115521b = str2;
    }
}
