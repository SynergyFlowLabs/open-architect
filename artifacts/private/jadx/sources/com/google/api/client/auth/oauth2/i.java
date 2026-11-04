package com.google.api.client.auth.oauth2;

import com.google.api.client.http.i0;
import com.google.api.client.http.w;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class i implements w, com.google.api.client.http.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f115199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f115200b;

    public i(String str, String str2) {
        this.f115199a = (String) h0.d(str);
        this.f115200b = str2;
    }

    @Override // com.google.api.client.http.p
    public void a(com.google.api.client.http.u uVar) throws IOException {
        Map<String, Object> mapF = com.google.api.client.util.n.f(i0.i(uVar).j());
        mapF.put("client_id", this.f115199a);
        String str = this.f115200b;
        if (str != null) {
            mapF.put("client_secret", str);
        }
    }

    @Override // com.google.api.client.http.w
    public void b(com.google.api.client.http.u uVar) throws IOException {
        uVar.L(this);
    }

    public final String c() {
        return this.f115199a;
    }

    public final String d() {
        return this.f115200b;
    }
}
